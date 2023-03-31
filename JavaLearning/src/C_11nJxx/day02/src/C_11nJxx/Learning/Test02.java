package C_11nJxx.Learning;

public class Test02 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int size = arr1.length;
        for (int j : arr1) {
            System.out.println(j);
        }
        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            arr2[i] = i;
            System.out.println(arr2[i]);
        }
        int res1 = getAddRes(1,2);
        double res2 = getAddRes(1.1,2);
        System.out.println(res1);
        System.out.println(res2);

    }

    public static int getAddRes(int v1,int v2){
        return v1 + v2;
    }
    //方法重载
    public static double getAddRes(double v1, int v2){
        return v1+ v2;
    }
}
