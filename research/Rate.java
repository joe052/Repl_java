//hackerrank problem to check rate
package research;
import java.util.*;

public class Rate{
  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    //converting list a
    int [] arrA = new int[a.size()];
    for(int i = 0; i < a.size();i++){
      arrA[i] = a.get(i);
    }

    //converting list b
    int [] arrB = new int[b.size()];
    for(int i = 0; i < b.size();i++){
      arrB[i] = b.get(i);
    }

    int aPoints = 0;
    int bPoints = 0;
    
    for(int i = 0; i < arrA.length;i++){
      if(arrA[i] > arrB[i]){
        aPoints += 1;
      }else if(arrA[i] < arrB[i]){
        bPoints += 1;
      }
    }
    
    int[] result = {aPoints,bPoints};
    
    //converting array to list
    List <Integer> res = new ArrayList<Integer>();
    for(int i : result){
      res.add(i);
    }
    return res;
  }
}