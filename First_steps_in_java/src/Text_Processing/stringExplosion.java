package Text_Processing;

import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());

        int power = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '>') {
                power += Integer.parseInt(String.valueOf(sb.charAt(i + 1)));

            } else if (power > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                power--;
                i--;
            }
        }

        System.out.println(sb);
    }
}