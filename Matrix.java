public class Matrix{
  public static boolean isDiagonal(int[][] m){
    boolean isDiag = true;
    for(int i = 0; i < m.length; ++i){
      for(int j = 0; j < m.length; ++j){
        if((i != j) && m[i][j] != 0){
          isDiag = false;
        }
      }
    }
    return isDiag;
  }
  public static void main(String[] args){
    int[][] example = new int[2][2];
    example[0][0] = 2;
    example[0][1] = 0;
    example[1][0] = 0;
    example[1][1] = 4;

    if(isDiagonal(example)){
      System.out.println("The Matrix is a Diagonal!");
    }
    else{
      System.out.println("The Matrix is NOT a Diagonal!");
    }
  }
}
