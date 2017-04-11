import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.zip.CRC32;


/**
 * Created by bilalsay on 23/02/2017.
 */
public class Comperator {

    public static void main(String args[])  {
        /*
        byte[] b = new byte[]{'A', 'E', 'D'};
        CRC32 c = new CRC32();
        c.update(b);

        System.out.println(c.getValue());
        */

        String pathUri = args[0];
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(pathUri), "*.html")) {

            Iterator<Path> itr = directoryStream.iterator();

            ArrayList<Path> pathList = StreamSupport
                    .stream(Spliterators.spliteratorUnknownSize(itr, Spliterator.ORDERED), false)
                    .collect(Collectors.toCollection(ArrayList::new));

            for (int i = 0; i < pathList.size() ; i++) {
                Path p1 = pathList.get(i);

                for (int j = i+1; j < pathList.size() ; j++) {

                    Path p2 = pathList.get(j);

                    if (Comperator.gnrt(p1).equals(Comperator.gnrt(p2)))
                        System.out.println(p1 + " is same with " + p2);


                }

            }

        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }catch(UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String gnrt(Path i) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(Files.readAllBytes(i.toFile().toPath()));
        byte[] hash = messageDigest.digest();

        return DatatypeConverter.printHexBinary(hash).toUpperCase();
    }
}
