import java.util.*;
public class A3_SumOfDiagonal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row and cols");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        } 
        SumOfDiagonal(matrix, n, m);
sc.close();
} 
public static void SumOfDiagonal(int matrix[][],int n,int m){
    
    int sum=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<matrix[i].length;j++){
           if(i==j){
            sum=sum+matrix[i][j];
           }
           else if(i+j==(n-1)){
            sum=sum+matrix[i][j];
           }
    }
}
System.out.println(sum);

}
}