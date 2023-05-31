public class A7_reverseOfArray {
    public static void main(String args[]){
        int marks[]={80,90,120,150,200,300,400,500};
        int i=0,j=marks.length-1;
        while(i<j){
            int temp=marks[i];
            marks[i]=marks[j];
            marks[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<marks.length;k++){
            System.out.println(marks[k]);
        }
    }
}
