public class A4_Shortest {
    public static void main(String args[]){
        String dir="WNEENESENNN";
        int x=0,y=0;
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='W'){
                x=x-1;
            }
            else if(dir.charAt(i)=='E'){
                x=x+1;
            }
            else if(dir.charAt(i)=='N'){
                y=y+1;
            }else{
                y=y-1;
            }
        }
        System.out.println(x+","+y);
        int res= (int)Math.pow(x, 2)+(int)Math.pow(y, 2);
        System.out.println((int)Math.sqrt(res));
        //----------------------------------------
        String s1="arun";
        String s2="arun";
        if(s1.equals(s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println("-----------------------------");
        String s3=new String("arun");
        String s4=new String("arun");
        if(s3.equals(s4)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //----------------------------------------------
    }
}
