package Methods;

import java.util.Scanner;

public class add_and_subtract_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputCounts = 3;
        int sum = 0;

        for (int i = 0; i < inputCounts; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if(i==2){
                sum = sum - currentNum;

            } else {
                sum += currentNum;
            }
        }

        System.out.print(sum);
    }
}
