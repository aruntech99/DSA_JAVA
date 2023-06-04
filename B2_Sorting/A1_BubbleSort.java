public class A1_BubbleSort{
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        BubbleSort(arr, n);
        
    }
    public static void BubbleSort(int arr[],int n){
        boolean swap;
        for(int i=0;i<n-1;i++){
             swap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}