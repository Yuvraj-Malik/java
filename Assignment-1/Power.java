import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exp = sc.nextInt();

        long ans = 1;

        for (int i = 1; i <= exp; i++)
            ans *= base;

        System.out.println(ans);

        sc.close();
    }
}