package Reversing;

public class ReverseWithoutNewArray {
    public static void main(String[] args) {
        int [] a ={10,20,30,40,50};
        int low=0;
        int high=a.length-1;
        while(low<high){
            a[low]=a[low]+a[high];
            a[high]=a[low]-a[high];
            a[low]=a[low]-a[high];
            low++;high--;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
