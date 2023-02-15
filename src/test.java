import java.util.Random;

public class test {

    public static void main(String[] args) {
        Random r = new Random();

        int n = 6000000;
        System.out.println(n);

        for (int i = 1; i <= n; i++) {
            int a = r.nextInt(1, 1000000001);
            System.out.print(a + " ");


        }
    }


}
