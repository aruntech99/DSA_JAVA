public class AA13_RainTrappingWater {
       // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappingWater(height, height.length));
    }
    static long trappingWater(int arr[], int n) { 
        // Your code here
        if(n==1 || n==2){
            return 0;
        }
        int l[]=new int[n];
        int r[]=new int[n];
        long res=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                l[i]=max;
            }else{
                l[i]=max;
            }
        }
        max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                r[i]=max;
            }else{
                r[i]=max;
            }
        }
         for(int i=0;i<n;i++){
             long temp=(int)Math.min(l[i],r[i])-arr[i];
             res=res+temp;
         }
         return res;
    } 
}
