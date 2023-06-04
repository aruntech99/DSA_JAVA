import java.util.Arrays;
import java.util.Collections;

public class A4_InbuiltSort {
    public static void main(String args[]){
        int arr[]={5,-1,3,7,2,4};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            }
        //-------------------
        System.out.println("-----------------------");
        int arr1[]={5,-1,3,7,2,4};
        int s=0;
        int e=3;
        Arrays.sort(arr1,s,e);    
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
            }

       System.out.println("-----------------------");
         Integer arr2[]={5,-1,3,7,2,4};    
         Arrays.sort(arr2,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
            }
            System.out.println("-----------------------");
            Integer arr3[]={5,-1,3,7,2,4};    
            Arrays.sort(arr3,0,n,Collections.reverseOrder());
           for(int i=0;i<n;i++){
               System.out.print(arr3[i]+" ");
               }    
    }
    
}
