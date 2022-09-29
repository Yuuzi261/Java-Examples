import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.print("Enter 5 numbers...(between 1 and 30, separated by space)\n> ");
        for(int i = 0;i < 5;i++) nums[i] = input.nextInt();

        for(int i = 0;i < 5;i++) {
            System.out.printf("%d:\t", nums[i]);
            for(int j = 0;j < nums[i];j++) System.out.print('*');
            System.out.println();
        }

        input.close();

    }
}