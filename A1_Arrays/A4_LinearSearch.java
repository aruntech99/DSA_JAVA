public class A4_LinearSearch {
    public static void main(String args[]){
        int arr[]={34,20,10,32,77};
        int a=10;
        boolean res=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){ 
                res=true;
                break;
            }
        }
        System.out.println(res);
    }
}
