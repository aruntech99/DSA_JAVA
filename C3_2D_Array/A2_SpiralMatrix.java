import java.util.*;
public class A2_SpiralMatrix {
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
        System.out.println("-----------------------------");
        int l=0,k=0,lastrow=n-1,lastcol=m-1;
        while(l<=lastcol && k<=lastrow){
            for(int i=l;i<=lastcol;i++){
                System.out.print( matrix[k][i]+" ");
            }
            k++;
            System.out.println();
            for(int i=k;i<=lastrow;i++){
                 System.out.print(matrix[i][lastcol]+" ");
            }
         
            lastcol--;
            System.out.println();
            if(k<=lastrow){
                for(int i=lastcol;i>=l;i--){
                    System.out.print(matrix[lastrow][i]+" ");
                }
                lastrow--;
                System.out.println();
            }
            if(l<=lastcol){
                for(int i=lastrow;i>=k;i--){
                    System.out.print(matrix[i][l]+" ");
                }
                l++;
                System.out.println();
            }
        }
    sc.close();
    }
}
