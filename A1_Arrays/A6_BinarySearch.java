public class A6_BinarySearch{
    public static void main(String args[]){
        int marks[]={80,90,120,150,200,300,400,500};
        int element=150;
        System.out.println("Index of Element : "+BinarySearch(marks,element));
    }
    public static int BinarySearch(int marks[],int element){
        int start=0,end=marks.length;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(marks[mid]==element){
                index=mid;
                return index;
            }
            else if(marks[mid]>element){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
}