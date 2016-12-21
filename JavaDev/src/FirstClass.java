/**
 * Created by bilalsay on 29.09.2016.
 */
public class FirstClass
{
  public static void main(String args[])
  {
    int temporaryList[] = new int[5];
    int lists[] = {14, 33, 27, 35, 10};
    for (int i =0; i < 5; i++)
    {
      for(int j = 0; j < 5; j++)
      {
        if (lists[j] > lists[j + 1])
        {
          temporaryList[j] = lists[j + 1];
          temporaryList[j + 1] = lists[j];
        }

      }
      lists = temporaryList;
    }

    for (int n: lists) {
      System.out.println(n);
    }


  }
}
