import java.util.*;

public class Main{
  public static void main(String [] args){
    
    Math x = new Math();
    // int z = x.add(5,3);
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(1);
    nums.add(4);
    nums.add(8);
    nums.add(4);
    nums.add(8);
    nums.add(4);
    nums.add(4);
    nums.add(1);
    nums.add(9);

    x.lonelyinteger(nums);
    //System.out.println(z);
  }
}