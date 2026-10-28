
import java.util.Arrays;

public class merging {
    public static void main(String[] args) {
        int [] a={1,4,7};
        int [] b={2,5,8};
        int [] c={3,6,9};
        int [] res =new int [a.length + b.length +c.length ];
        System.arraycopy(a, 0, res, 0, a.length);
        System.arraycopy(b, 0, res, a.length, b.length);
        System.arraycopy(c, 0, res, a.length+b.length, c.length);
        Arrays.sort(res);

        for (int i = 0; i <res.length; i++) {
            System.out.println(res[i]+" ");
        }
    }
}