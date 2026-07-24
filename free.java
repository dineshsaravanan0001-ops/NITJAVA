import java.util.Scanner;

public class free {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int present = 0, absent = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter day " + i + " (1=present, 0=absent): ");
            int result = scan.nextInt();

            if (result == 1) {
                present++;
            } else if (result == 0) {
                absent++;
            } else {
                System.out.println("Invalid input. Please enter 1 for present or 0 for absent.");
                i--; 
        }

        System.out.println("Total present: " + present);
        System.out.println("Total absent: " + absent);

        if (present >= 5) {
            System.out.println("Good Attendance");
        } else {
            System.out.println("Attendance needs improvement");
        }

        scan.close();
    }
}
}