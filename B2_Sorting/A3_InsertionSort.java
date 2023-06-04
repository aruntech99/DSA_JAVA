public class A3_InsertionSort {
     public static void main(String args[]){
            int arr[]={5,10,4,-3,8,1};
            int n=arr.length;
            SelectionSort(arr, n);
            
        }
        public static void SelectionSort(int arr[],int n){
            for(int i=1;i<n;i++){ 
                int temp=arr[i];
                int prev=i-1;
                while(prev>=0 && arr[prev]>temp){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                arr[prev+1]=temp;
            }
            for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            }
        }
    }
    