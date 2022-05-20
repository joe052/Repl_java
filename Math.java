import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Math{
 
  public int add(int x,int y){
    
    return x+y;
  }

  public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        Collections.sort(a);
        int [] arr = new int[a.size()+1];
        int t = 1;
        int test = 0;
        int n = 0;

        //pushing elements to my new array
        for(int i = 0;i < a.size(); i++){
            int x = a.get(i);
            arr[i] = x;
        }

        //checking for duplicates using int test as a control
        for(int i = 0;i < a.size(); i++){
            if(arr[i] == arr[t]){
                t++;
                test = 0;
            }else{
              test++;
              if(test == 2){
                n = i;
              }
              t++;
            }
        }

        int result = arr[n];


          //printing arrays
      for(int i=0; i < arr.length; i++){
       System.out.println(arr[i]);
      }
        //System.out.println(Arrays.toString(arr));
        System.out.println(result);
    
        return result;        
    }

  //for learning purpose
  public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        //pushing elements to my new array
        int []myArr = new int[arr.size()];
        for(int i = 0;i < arr.size(); i++){
            myArr[i] = arr.get(i);
        }
    
        //creating the filtering array
        int []filtArr = new int[myArr.length];
            
        //implementing counter
        for(int i = 0;i < myArr.length;i++){
            int x = myArr[i];
            filtArr[x]++;
        }

        //printing array
        for(int i=0; i < filtArr.length; i++){
        System.out.println(filtArr[i]);
        }

        System.out.println("\nfiltering array length is "+ filtArr.length);
        
        List<Integer> result = new ArrayList<Integer>(filtArr.length);
        for (int i : filtArr)
        {
            result.add(i);
        }
    
        return result; 
    }
}