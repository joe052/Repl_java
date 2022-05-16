import java.util.*;

public class Arrays{
  int [][] test = new int[5][3];
  
  public void check(){
    int [][] myArr = {{50,45,67,89,77},{33,44,67,87,74},{90,87,78,69,80}};

    //System.out.println(marks[0][3]);
    for(int i = 0;i < myArr.length;i++){
      for(int j = 0;j < myArr[i].length;j++){
        System.out.println(myArr[i][j]);
      }
      System.out.println();
    }

    int[][]myArr = new int[3][3];
        //arr.toArray(myArr);
        
        for(int i = 0;i < myArr.length;i++){
            for(int j = 0;j < myArr[i].length;j++){
                //System.out.println(myArr[i][j] + "\t");
                myArr[i][j] = arr.get(i).get(j);
            }
        }
        
        int tLft = myArr[0][0];
        int ctr = myArr[1][1];
        int bRgt = myArr[2][2];
        int bLft = myArr[2][0];
        int tRgt = myArr[0][2];
        
        int diag1 = tLft + ctr + bRgt;
        int diag2 = tRgt + ctr + bLft;
        
        int result = diag1 - diag2;
        if(result < 0){
            result = - result;
        }
        return result;
    }

  }
}