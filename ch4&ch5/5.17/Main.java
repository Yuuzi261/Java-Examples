import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] grades = {0, 0, 0, 0};
        Student[] students = new Student[5];

        for(int i = 0;i < 5;i++) {
            Student s = new Student();
            System.out.printf("Enter Student %d (name grade): ", i+1);
            String name = input.next();
            s.setName(name);
            char grade = input.next().charAt(0);
            s.setGrade(grade);
            students[i] = s;
        }

        System.out.println();
        for(int i = 0;i < 5;i++) {
            System.out.printf("[%d] %s: %c\n", i+1, students[i].getName(), students[i].getGrade());
            switch (students[i].getGrade()) {
                case 'A':
                    grades[0]++;
                    break;
                case 'B':
                    grades[1]++;
                    break;
                case 'C':
                    grades[2]++;
                    break;
                case 'D':
                    grades[3]++;
                    break;
                default:
                    break;
            }
        }

        System.out.println();
        for(int i = 0;i < 4;i++) {
            if(grades[i] > 1)
                System.out.printf("%c: %d people\n", i + 65, grades[i]);
            else
                System.out.printf("%c: %d person\n", i + 65, grades[i]);
        }

        input.close();

    }
}