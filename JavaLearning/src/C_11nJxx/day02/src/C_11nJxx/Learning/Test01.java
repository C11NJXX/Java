package C_11nJxx.Learning;
import java.util.Scanner;
import java.util.Random;
public class Test01 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double v1 = 3;
        System.out.println(v1);//隐式类型转换
        double v2 = 3.3;
        int v3 = (int)v2;//强制类型转换
        System.out.println(v3);
        System.out.println(1+"2"+3);
        System.out.println(1+'a');
        //int v4 = input.nextInt();
        Random r = new Random();
        int v4 = r.nextInt(100);
        System.out.println(v4);
    }
}
