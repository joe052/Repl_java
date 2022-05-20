import java.util.*;

public class Main{
  public static void main(String [] args){
    
    Math x = new Math();
    Arrays y = new Arrays();
    // int z = x.add(5,3);
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(3);
    nums.add(4);
    nums.add(8);
    nums.add(4);
    nums.add(8);
    nums.add(4);
    nums.add(4);
    nums.add(9);
    nums.add(9);

    //x.lonelyinteger(nums);
    //y.check();
    int [] test = {1,3,3,4,5,6,6,7,8,9};
    y.counter(test);
    //System.out.println(z);
  }
}