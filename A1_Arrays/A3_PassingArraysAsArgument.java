import java.util.*;
public class A3_PassingArraysAsArgument {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int nochange=900;
        System.out.println(nochange);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        arrPass(arr,nochange);
        System.out.println("------------------------------------");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);// call by referance
        }
        System.out.println("---------------------------");

        System.out.println(nochange);// call by value
        sc.close();
    }
    public static int[] arrPass(int arr[],int nochange){
        nochange=1000;
         arr[0]=897;
       return arr;
    }
}
