import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no");
        int n = sc.nextInt();

        int sumeven = 0, sumodd = 0;
        int counteven = 0, countodd = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter number");
            int num = sc.nextInt();

            int temp = num;
            int digitsum = 0;

            while (temp > 0) {
                digitsum = digitsum + temp % 10;
                temp = temp / 10;
            }

            System.out.println("Digit sum = " + digitsum);

            if (digitsum % 2 == 0) {
                sumeven = sumeven + digitsum;
                counteven++;
            } else {
                sumodd = sumodd + digitsum;
                countodd++;
            }
        }

        int unique_number = 0;

        unique_number = (sumeven * counteven) + (sumodd * countodd);

        System.out.println(unique_number);
    }
}
