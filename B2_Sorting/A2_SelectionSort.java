public class A2_SelectionSort {
    public static void main(String args[]){
        int arr[]={5,10,4,-3,8,1};
        int n=arr.length;
        SelectionSort(arr, n);
        
    }
    public static void SelectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){ 
            int minposition=i;
            for(int j=i+1;j<n;j++){ 
                if(arr[minposition]>arr[j]){
                    minposition=j;
                }
            } 
            if(i!=minposition){  
            int temp=arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;
            }

        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
