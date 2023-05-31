public class A8_pairs {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
