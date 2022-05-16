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

  public static void lonelyinteger(List<Integer> a) {
    // Write your code here
        Collections.sort(a);
        int [] arr = new int[a.size()+1];
        //int [] idx = new int[a.size()];
        //int y = 0;
        int t = 1;
        int test = 0;
        int n = 0;
         
        for(int i = 0;i < a.size(); i++){
            int x = a.get(i);
            arr[i] = x;
        }
        
        for(int i = 0;i < a.size(); i++){
            if(arr[i] == arr[t]){
                //idx[y] = i;
                //y ++;
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

        if(n == 0){
          
        }

        int res = arr[n];
        
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(idx));
        System.out.println(res);
        //return arr[arr.length - 1];
        //return idx;
        
    }
}