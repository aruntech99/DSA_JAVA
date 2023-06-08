import java.util.Scanner;

public class A1_BasicString{
    public static void main(String args[]) {
        String str="arunkumar";
        System.out.println(str);
        String str2=new String("ArunKumar");
        System.out.println(str2);
        //length:length()
        System.out.println(str.length());
        //Strings are immutable.
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        //Arun Kumar---->Arun
        System.out.println("----------------------");
        String name2=sc.nextLine();
        //Arun Kumar---->Arun Kumar
        System.out.println(name1+" , "+name2);
        sc.close();
    }
}