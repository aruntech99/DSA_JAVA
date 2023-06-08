  public class A3_Palindrome{
    public static void main(String args[]){
        String name="noton";
        int i=0;
        int j=name.length()-1;
        while(i<j){
            if(name.charAt(i)==name.charAt(j)){
                i++;
                j--;
            }else{
                System.out.println("Not Palindrome.");
                return;
            }
        }
        System.out.println("Palindrome.");
    }
  }
   