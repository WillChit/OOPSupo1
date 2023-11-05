import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NewList lst = new NewList();
        lst.add(0, 1);
        lst.add(0, 1);
        lst.add(0, 1);
        lst.add(0, 1);
        lst.add(0, 1);
        lst.add(0, 1);
        lst.add(0, 1);

        System.out.println(lst.hasCycle());
    }

    static int sum(int[] a){
        int res = 0;
        for (int i = 0; i < a.length; i++){
            res += a[i];
        }

        return res;
    }

    static int[] cumsum(int[] a){
        int cur = 0;
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++){
            cur += a[i];
            res[i] = cur;
        }

        return res;
    }

    static int[] positives(int[] a){
        int size = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > 0) size++;
        }

        int[] res = new int[size];
        int j = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                res[j] = a[i];
                j++;
            }
        }

        return res;
    }

    public static void vectorAdd(int[] v, int dx, int dy){
        v[0] += dx;
        v[1] += dy;
    }
}