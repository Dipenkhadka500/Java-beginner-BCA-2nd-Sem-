import java.util.Scanner;
public class Matrix1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int r=sc.nextInt();
    System.out.println("Enter the number of coulmn:");
    int c=sc.nextInt();
    int[][] mat1=new int[r][c];
    int[][] mat2=new int[r][c];
    int[][] sum=new int[r][c];
    System.out.println("Enter the elements of the first matrix:");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        mat1[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter the elements of the second matrix:");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        mat2[i][j]=sc.nextInt();
      }
    }
    System.out.println("Sum of the matrix:");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++)
      {
        sum[i][j]=mat1[i][j]+mat2[i][j];
        System.out.print(sum[i][j]+" ");
      }
      System.out.println(" ");
    }
    sc.close();
  }
  
}
