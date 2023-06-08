public class A6_LargestString {
    public static void main(String args[]){
        String arr[]={"apple","mango","banana"};
        String res=arr[0];
        for(int i=1;i<arr.length;i++){
                if(res.compareToIgnoreCase(arr[i])<0){
                    res=arr[i];
                }
        }
        System.out.println(res);
    }
}
