package Reversing;

class ReverseUsingNewArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int [] temp =new int [a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            temp[j++]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(temp[i]);
        }
    }
}