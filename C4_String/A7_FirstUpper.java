public class A7_FirstUpper {
    public static void main(String args[]){
        String arr=" arun Kumar S ingh ";
        String res="";
        for(int i=0;i<arr.length();i++){
            if(i!=0){
                if(arr.charAt(i-1)==' '){
                res=res+Character.toUpperCase(arr.charAt(i));
                }
                else{
                    res=res+arr.charAt(i);
                }
            } else{
                res=res+Character.toUpperCase(arr.charAt(i));
            }

        } 
        System.out.println(res);
    }
}
