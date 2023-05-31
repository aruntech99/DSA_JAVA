public class A9_PrintSubArray{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int ts=0;
        int p=1;
        for(int i=0;i<arr.length;i++){
            int s=i;
            for(int j=i;j<arr.length;j++){
                int e=j;
                for(int k=s;k<=e;k++){
                      System.out.print(arr[k]+" ");
                } 
                System.out.println("-------------------------"+p++);
                ts++;
                System.out.println();
            } 
        }
        System.out.println(ts);
    }
}
