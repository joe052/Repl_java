package research;
import java.util.*;

public class Arrsum{
//array sum method
  public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
    //converting list to array
    int [] myArr = new int[ar.size()];
    for(int i = 0;i < ar.size();i++){
      myArr[i] = ar.get(i);
    }

    //looping through array and  adding
    int sum = 0;
    for(int i = 0;i < myArr.length;i++){
      sum += myArr[i];
    }
    System.out.println(sum);
    return sum;
  }

  public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
    //converting list to array
    long [] myArr = new long[ar.size()];
    for(int i = 0;i < ar.size();i++){
      myArr[i] = ar.get(i);
    }

    //looping through array and  adding
    long sum = 0;
    for(int i = 0;i < myArr.length;i++){
      sum += myArr[i];
    }
    System.out.println(sum);
    return sum;
  }
}