public class AA11_Max_Min_In_SumOfSubArray_PrefixSum {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subArrraySumMaxMin(arr);
        return;
    }
    public static void subArrraySumMaxMin(int [] arr){ 
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            prefix[i]=sum;
        }
        for(int i=0;i<arr.length;i++){
            int s=i;
            for(int j=i;j<arr.length;j++){
                int e=j; 
                int resSum=0;
                if(s!=0){  
                 resSum=prefix[e]-prefix[s-1];
                }else{
                 resSum=prefix[e];
                }
                if(max<resSum){
                    max=resSum;
                } 
            } 
        } 
        System.out.println(max);
    }
}
