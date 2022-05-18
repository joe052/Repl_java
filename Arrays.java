import java.util.*;

public class Arrays{
  int [][] test = new int[5][3];
  
  public void check(){
    int [][] myArr = {{50,45,67,70},{33,44,58,64},{90,87,78,82},{68,72,80,79}};
    int[]testArr = new int[myArr.length];
    int[]testArr2 = new int[myArr.length];

    for(int i = 0;i < myArr.length;i++){
      for(int j = 0;j < myArr[i].length;j++){
        System.out.println(myArr[i][j]);
      }
      System.out.println();
    }  

    //establishing the right side diagonal
    for(int i = 0;i < myArr.length;i++){
      for(int j = 0;j < myArr[i].length;j++){
        if(j == i){
          testArr[i] = myArr[i][j];
        }
      }
    }  

    //establishing the left side diagonal
    for(int i = 0;i < myArr.length;i++){
      for(int j = myArr[i].length - 1;j >= 0;j--){
        if(i+j == myArr.length - 1){
          testArr2[i] = myArr[i][j];
        }
      }
    }  

    //adding elements of first diagonal
    int diag1 = 0;
    for(int i=0; i < testArr.length; i++){
      diag1 = testArr[i] + diag1;
    }

    //adding elements of second diagonal
    int diag2 = 0;
    for(int i=0; i < testArr2.length; i++){
      diag2 = testArr2[i] + diag2;
    }

    //performing the diagonal difference
    int result = diag1-diag2;
    if(result < 0){
      result = -result;
    }
    
    //printing first diagonal
    for(int i=0; i < testArr.length; i++){
     System.out.println(testArr[i]);
    }

    //printing second diagonal
    for(int i=0; i < testArr2.length; i++){
     System.out.println(testArr2[i]);
    }

    System.out.println("sum is "+diag1);
    System.out.println("sum is "+diag2);
    System.out.println("difference is "+result);
  } 

  public int [] counter(int [] arr){
    //creating the filtering array
      int []filtArr = new int[arr.length - 1];
        
      //implementing counter
      int y = 0;
      for(int i = 0;i < arr.length;i++){
        int x = arr[i];
        filtArr[x] = y+1;
      }

      //printing array
      for(int i=0; i < filtArr.length; i++){
       System.out.println(filtArr[i]);
      }
      //System.out.println(Arrays.toString(filtArr));
      return filtArr;
  }
}