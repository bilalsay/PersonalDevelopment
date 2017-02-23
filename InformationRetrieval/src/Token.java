import java.util.ArrayList;

/**
 * Created by bilalsay on 14/02/2017.
 */
public class Token {
    private String tokenName;
    private ArrayList<Integer> tokenDocumentIdList = new ArrayList<Integer>();
    private int[] matrixList;

    Token(String tokenName, int tokenDocumentId) {

        this.tokenName = tokenName;
        this.tokenDocumentIdList.add(tokenDocumentId);
    }

    public String getTokenName() {
        return tokenName;
    }

    public ArrayList<Integer> getTokenDocumentIdList() {
        return tokenDocumentIdList;
    }

    public void addTokenDocumentId(int tokenDocumentId) {
        tokenDocumentIdList.add(tokenDocumentId);
    }

    public String getMatrix(ArrayList<Integer> documentIdList) {
        matrixList = new int[documentIdList.size()];

        int count = 0;

        for (Integer dId: documentIdList) {
            for (Integer docId: getTokenDocumentIdList()) {
                if ((docId.equals(dId) ) && matrixList[count] < 1)
                    matrixList[count]++;

            }
            count++;
        }

        String str = "";
        for (int i = 0; i < matrixList.length; i++) {
            str += matrixList[i] +"     ";
        }

        return str;



    }


}
