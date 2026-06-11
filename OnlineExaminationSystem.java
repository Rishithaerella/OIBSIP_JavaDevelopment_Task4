import java.util.Scanner;

public class OnlineExamination {

    static Scanner sc = new Scanner(System.in);

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("\nLogin Successful!");

            while (true) {

                System.out.println("\n===== MENU =====");
                System.out.println("1. Start Exam");
                System.out.println("2. Update Password");
                System.out.println("3. Logout");
                System.out.print("Enter Choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        startExam();
                        break;

                    case 2:
                        updatePassword();
                        break;

                    case 3:
                        System.out.println("Logged Out Successfully!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

        } else {
            System.out.println("Invalid Username or Password!");
        }
    }

    static void updatePassword() {

        System.out.print("Enter New Password: ");
        password = sc.nextLine();

        System.out.println("Password Updated Successfully!");
    }

    static void startExam() {

        int score = 0;

        long startTime = System.currentTimeMillis();
        long examDuration = 60000; // 60 seconds

        System.out.println("\n===== ONLINE EXAM =====");
        System.out.println("You have 60 seconds to complete the exam.");

        // Question 1
        if (System.currentTimeMillis() - startTime > examDuration) {
            autoSubmit(score);
            return;
        }

        System.out.println("\n1. What does JVM stand for?");
        System.out.println("A. Java Virtual Machine");
        System.out.println("B. Java Variable Method");
        System.out.println("C. Java Vendor Machine");
        System.out.println("D. None");
        System.out.print("Answer: ");
        String ans1 = sc.nextLine();

        if (ans1.equalsIgnoreCase("A"))
            score++;

        // Question 2
        if (System.currentTimeMillis() - startTime > examDuration) {
            autoSubmit(score);
            return;
        }

        System.out.println("\n2. Which keyword is used for inheritance?");
        System.out.println("A. implements");
        System.out.println("B. extends");
        System.out.println("C. import");
        System.out.println("D. package");
        System.out.print("Answer: ");
        String ans2 = sc.nextLine();

        if (ans2.equalsIgnoreCase("B"))
            score++;

        // Question 3
        if (System.currentTimeMillis() - startTime > examDuration) {
            autoSubmit(score);
            return;
        }

        System.out.println("\n3. Which company developed Java?");
        System.out.println("A. Microsoft");
        System.out.println("B. Google");
        System.out.println("C. Sun Microsystems");
        System.out.println("D. Apple");
        System.out.print("Answer: ");
        String ans3 = sc.nextLine();

        if (ans3.equalsIgnoreCase("C"))
            score++;

        // Question 4
        if (System.currentTimeMillis() - startTime > examDuration) {
            autoSubmit(score);
            return;
        }

        System.out.println("\n4. Which method is the entry point of Java?");
        System.out.println("A. start()");
        System.out.println("B. run()");
        System.out.println("C. main()");
        System.out.println("D. execute()");
        System.out.print("Answer: ");
        String ans4 = sc.nextLine();

        if (ans4.equalsIgnoreCase("C"))
            score++;

        // Question 5
        if (System.currentTimeMillis() - startTime > examDuration) {
            autoSubmit(score);
            return;
        }

        System.out.println("\n5. Java is a:");
        System.out.println("A. Programming Language");
        System.out.println("B. Database");
        System.out.println("C. Operating System");
        System.out.println("D. Browser");
        System.out.print("Answer: ");
        String ans5 = sc.nextLine();

        if (ans5.equalsIgnoreCase("A"))
            score++;

        System.out.println("\n===== EXAM SUBMITTED =====");
        System.out.println("Your Score: " + score + "/5");
    }

    static void autoSubmit(int score) {
        System.out.println("\nTime Over!");
        System.out.println("Exam Auto Submitted.");
        System.out.println("Your Score: " + score + "/5");
    }
}
