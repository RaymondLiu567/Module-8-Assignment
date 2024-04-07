import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's number of credits: ");
        int credits = scanner.nextInt();

        System.out.println("Enter student's GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Is the student an honors student? (true/false): ");
        boolean isHonors = scanner.nextBoolean();

        Student student = new Student(credits, gpa, isHonors);
        System.out.println("Year: " + student.getYear());
        System.out.println("Letter Grade: " + student.getLetterGrade());
    }
}
