/**
 * Created by bilalsay on 29.09.2016.
 */
public class FirstClass
{
    static int[][] numberArray = new int[][]{
            {1, 3, 5, 7, 9},
            {4, 12, 15, 25, 27},
            {8, 22, 32, 45, 49},
            {11, 26, 39, 52, 65}
    };

  public static void main(String args[])
  {
      int b = 2;
      int a = 0 + b;

      b++;

      System.out.println(a);



      System.out.println(findAlg(numberArray, 52));
  }


  public static int rF(int n) {
    if (n <= 1)
      return n;
    return rF(n - 1) + rF(n - 2 );
  }

  public static int iF(int n) {
      int prevN = 0, nextN = 1, sumN = 0;

      for (int i = 0; i < n; i++) {
          prevN = nextN;
          nextN = sumN;
          sumN = prevN + nextN;
      }

      return sumN;
  }

  public static int binarySerch(int[] array, int index1, int index2, int key) {
      int middle = (index1 + index2) / 2;
      int n = (index2 - index1);

      if (array[middle] == key) {
          return key;
      } else {
          if (n == 1)
              return -1;
          else if (key < array[middle])
              return binarySerch(array, index1, middle, key);
          else
              return binarySerch(array, middle, index2, key);
      }
  }

  public static int findAlg(int[][] array, int wantedKey) {
        int iteratorRow = 0;
        int iteratorColum = (array[0].length - 1);
        int result = -1;
        int rowLength = array.length;
        int currentKey = -1;

        while (iteratorRow < rowLength) {

            currentKey = array[iteratorRow][iteratorColum];

            if (currentKey == wantedKey) {
                result = wantedKey;
                break;
            } else if (wantedKey < currentKey) {
                    iteratorColum--;
            } else {
                    iteratorRow++;
            }

        }

        return result;


  }

}
