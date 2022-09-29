import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        int[] sales = new int[4];
        double commission = 0;
		double[] items = {239.99, 129.75, 99.95, 350.89};

        Scanner input = new Scanner(System.in);

        for(int i = 0;i < 4;i++) {
            System.out.printf("Enter the sales amounts of item %d: ", i + 1);
            sales[i] = input.nextInt();
        }

        for(int i = 0;i < 4;i++) {
            commission += sales[i] * items[i];
        }

        commission = commission * 0.09 + 200;
        System.out.printf("Commission: $%.2f", commission);

        input.close();

	}
}