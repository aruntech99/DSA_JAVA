import java.util.*;
public class Assignment_01 {
    public static void main(String []args){
        int arr[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(duplicateArray(arr));
    }
    //method_01
    static boolean duplicateArray(int arr[]){
        HashSet<Integer> t1=new HashSet<>(); 
        for(int i=0;i<arr.length;i++){
            t1.add(arr[i]);
        }
        if(arr.length==t1.size()){
            return false;
        } 
        return true;
    }
    //method_02
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length-1 ; i++) {
        for(int j=i+1; j<nums.length ; j++ ) {
        if( nums[i] == nums[j] ) {
        return true ;
        }
        }
        }
        return false;
        }
}
