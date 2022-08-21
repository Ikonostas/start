import java.util.Scanner;

public class summ {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        a = a % 86400;
        int w = (a / 3600);
        int q = ((a % 3600) / 60);
        int t = ((a % 3600) % 60);
        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", w, q, t);
    }
}

