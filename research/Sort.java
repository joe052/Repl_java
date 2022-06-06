//counting sort
import java.util.*;

public class Sort{
  public void counter(List <Integer> arr){
    int [] myArr = new int[arr.size()];

    //assigning list to array
    for(int i = 0; i < arr.size();i++){
      myArr[i] = arr.get(i);
    }

    int [] filtArr = new int[10];

    //assigning frequencies to my new filtArr
    for(int i = 0; i < myArr.length;i++){
      int x = myArr[i];
      filtArr[x] ++;
    }

    //converting my filtArr tom list for returning
    List <Integer> result = new ArrayList<Integer>();
    for(int i: filtArr){
      result.add(i);
    }
    System.out.println(result);
    //return result;
  }
}