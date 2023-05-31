public class AA10_Max_Min_In_SumOfSubArray {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subArrraySumMaxMin(arr);
        return;
    }
    public static void subArrraySumMaxMin(int [] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int s=i;
            for(int j=i;j<arr.length;j++){
                int e=j;
                int sum=0;
                for(int k=s;k<=e;k++){ 
                      sum=sum+arr[k];
                }  
                if(max<sum){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                } 
            } 
        } 
        System.out.println(max+" "+min);
    }
}
