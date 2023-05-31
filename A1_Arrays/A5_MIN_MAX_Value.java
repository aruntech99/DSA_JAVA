 public class A5_MIN_MAX_Value {
    public static void main(String args[]){
        int arr[]={23,43,10,54,45,65,35};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max+" , "+min);
        System.out.println(args[0]);
    }
}
