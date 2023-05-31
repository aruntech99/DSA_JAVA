public class AA12_MAX_SumOfSubArra {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subArrraySumMaxMin(arr);
        return;
    }
    public static void subArrraySumMaxMin(int [] arr){ 
       int currentsum=0;
       int maxSum=Integer.MIN_VALUE;
       int  start=0,end=0,s=0;
       for(int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if(maxSum<currentsum){
                maxSum=currentsum;
               start=s;
               end=i;
            }
            if(currentsum<0){
                currentsum=0;
                s=i+1;
            }
       }
        System.out.println("maxsum of subArray: "+maxSum);
        System.out.println("Start: "+start+" end: "+end);
    }
}

