import java.util.*;
import java.lang.String;

public class Assignment_02
{
    public static void main(String args[])
    {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> t1=threeSum(nums);
        for(int i=0; i<t1.size(); i++) {
        List<Integer> t2=t1.get(i);
        for(int j=0; j<t2.size(); j++) {
        System.out.print(t2.get(j)+" ");
        }
        System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int nums[])
    {
         List<List<Integer>> result = new ArrayList<List<Integer>> ();
        for(int i=0; i<nums.length; i++) {
        for(int j=i+1; j<nums.length; j++) {
        for(int k=j+1; k<nums.length; k++) {
        if(nums[i] + nums[j] + nums[k] == 0) {
        List<Integer> triplet = new ArrayList < Integer > ();
        triplet.add(nums[i]);
        triplet.add(nums[j]);
        triplet.add(nums[k]); 
        Collections.sort(triplet);
        result.add(triplet);
        }
        }
        }
        }
        LinkedHashSet<List<Integer>>  t1= new LinkedHashSet<List<Integer>> (result); 
        List<List<Integer>>  t2=new  ArrayList<List<Integer>> (t1);
        return t2;
    }
}
