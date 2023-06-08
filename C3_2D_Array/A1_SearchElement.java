import java.util.Scanner;

public class A1_SearchElement{
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
         System.out.println("Enter search element: ");
         int element=sc.nextInt();
        System.out.println("---------------------------");
        boolean e1=false;
         for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==element){
                    System.out.println(i+" , "+j);
                    e1=true;
                }
            }
            if(e1==true){
                break;
            }
        }
        if(e1==false){
            System.out.println("Not found ");
        }
        System.out.println("----------------------------");
        search(matrix, n, m, element);
        sc.close();
    }
    public static void search(int matrix[][],int n,int m,int element){ 
        for(int i=0;i<n;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==element){
                   System.out.println(i+" , "+j);
                   return;
               }
           } 
       }
       
           System.out.println("Not found ");
            return;
    }
}