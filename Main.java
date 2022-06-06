import java.util.*;
import research.*;

public class Main{
  public static void main(String [] args){
    
    //Math x = new Math();
    Arrays arrays = new Arrays();
    // int z = x.add(5,3);
    List<Integer> nums1 = new ArrayList<Integer>();
    List<Integer> nums2 = new ArrayList<Integer>();
    nums1.add(1);
    nums1.add(1);
    nums1.add(4);
    nums1.add(8);
    nums1.add(8);
    nums1.add(8);
    
    //x.lonelyinteger(nums);
    //arrays.check();
    //int [] test = {1,3,3,4,5,6,6,7,8,9};
    //arrays.counter(test);
    //System.out.println(z);
    //arrays.check();
    //research.Arrsum hack = new research.Arrsum();
    //hack.simpleArraySum(nums);

    Rate rate = new Rate();
    Sort s1 = new Sort();

    s1.counter(nums1);
    //System.out.println(rate.compareTriplets(nums1,nums2));
  }
}