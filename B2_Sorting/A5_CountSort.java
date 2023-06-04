public class A5_CountSort {
    public static void main(String args[]){
        int arr[]={5,10,4,3,8,0};
        int n=arr.length;
        CountSort(arr, n);
        
    }
    public static void CountSort(int arr[],int n){
         int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){ 
            if(max<arr[i]){
                max=arr[i];
            }
            }
        int count[]=new int[max+1];
        for(int i=0;i<count.length;i++){
            count[i]=0;
        }    
        for(int i=0;i<arr.length;i++){
            count[arr[i]]=count[arr[i]]+1;
        }
        int a=0;
        int b=0;
        while(a<=max)
{
    if(count[a]>0){
        arr[b]=a;
        count[a]=count[a]-1;
        b++;
    }else{
        a++;
    }
}
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
