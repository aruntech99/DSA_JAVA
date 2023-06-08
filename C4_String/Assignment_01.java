public class Assignment_01 {
    public static void main(String args[]){
String str="arunkumar";
int count = 0;
for(int i=0; i<str.length(); i++) {
char ch = str.charAt(i);
if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u') {
count++;
}
}
System.out.println("count of vowels is :" + count);
    }
}
