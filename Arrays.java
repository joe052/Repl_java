import java.util.*;

public class Arrays{
  int [][] test = new int[5][3];
  
  public void check(){
    int [][] myArr = {{50,45,67},{33,44,67},{90,87,78}};
    int[]testArr = new int[3];
    int[]testArr2 = new int[3];

    //System.out.println(marks[0][3]);
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
    for(int i = myArr.length - 1;i >= 0;i--){
      for(int j = myArr[i].length - 1;j >= 0;j--){
        if(j == i){
          testArr2[i] = myArr[i][j];
        }
      }
    }  

    for(int i=0; i < testArr.length; i++){
     System.out.println(testArr[i]);
    }

    for(int i=0; i < testArr2.length; i++){
     System.out.println(testArr2[i]);
    }
  }  
}