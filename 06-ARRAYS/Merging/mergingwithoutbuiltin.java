package Merging;
import java.util.Arrays;

public class mergingwithoutbuiltin {
    public static void main(String[] args) {
    int a[]={1,4,7};
    int b[]={2,5,8};
    int c[]={3,6,9};
    int temp[]=new int[a.length+b.length+c.length];
    int j=0;
    for(int i=0;i<a.length;i++){
        temp[j]=a[i];
        j++;
    }
    for(int i=0;i<b.length;i++){
        temp[j]=b[i];
        j++;
    }
    for(int i=0;i<c.length;i++){
        temp[j]=c[i];
        j++;
    }
    Arrays.sort(temp);
    for(int i=0;i<temp.length;i++){
        System.out.print(temp[i]+" ");
    }
}
}
