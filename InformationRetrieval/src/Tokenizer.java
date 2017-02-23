import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bilalsay on 14/02/2017.
 */
public class Tokenizer {

    private ArrayList<DToken> documentTokenList = new ArrayList<DToken>();
    private ArrayList<Token> uniqueTokenList = new ArrayList<Token>();
    private String pathDirection;
    private ArrayList<Integer> documentIdList = new ArrayList<Integer>();

    Tokenizer(String pathDirection) {
        this.pathDirection = pathDirection;
        createDocumentTokens();
        setUniqueTokenList();
        printUniqueTokens();

    }

    public void createDocumentTokens() {
        Path dir = Paths.get(pathDirection);

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir, "*.html")) {
            Iterator<Path> itr = directoryStream.iterator();

            while (itr.hasNext()) {
                Path i = itr.next(); // Bu tek bir pointer ile kullanılmalı!
                String fName = String.valueOf(i.toFile());
                int docId = Integer.parseInt(fName.substring(fName.indexOf('/') + 1, fName.indexOf('.')));
                documentIdList.add(docId);
                DToken token = new DToken(docId);
                Iterator<String> line = Files.lines(i).iterator();
                while(line.hasNext()){
                    for(String s : line.next().split(" ")) {
                        if (!s.equals(""))
                            token.addDToken(s.trim().replaceAll("\\W", "").toLowerCase());
                    }
                }
                documentTokenList.add(token);
            }

        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("An ıo error occured");
        }
    }

    public void printUniqueTokens() {
        System.out.println("                   302   306   311   313   327   331   342   347   350   354   356   359   362   372   382");

        for (Token tok : uniqueTokenList) {
            String s = tok.getTokenName();
            while (s.length() < 20)
                s += " ";
            System.out.print(s);
            System.out.println(tok.getMatrix(documentIdList));
            System.out.println();

        }

    }

    public void setUniqueTokenList() {

        for (DToken tok : documentTokenList) {
            for (String s: tok.getTokens()) {
                Token qToken = matchQuery(s);
                if (qToken != null) {
                    qToken.addTokenDocumentId(tok.getDTokenId());
                } else {
                    qToken = new Token(s, tok.getDTokenId());
                    uniqueTokenList.add(qToken);
                }

            }

        }
    }

    public Token matchQuery(String s) {
        Token matchToken = null;
        for (Token uToken: uniqueTokenList) {
            if (uToken.getTokenName().equals(s)) {
                matchToken = uToken;
                break;
            }

        }
        return matchToken;
    }


}
