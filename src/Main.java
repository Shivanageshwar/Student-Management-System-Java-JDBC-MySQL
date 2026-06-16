import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        StudentDAO dao =
                new StudentDAO();

        while (true) {

            System.out.println(
                    "\n===== STUDENT MANAGEMENT SYSTEM ====="
            );

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice =
                    sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name =
                            sc.nextLine();

                    System.out.print("Email: ");
                    String email =
                            sc.nextLine();

                    System.out.print("CGPA: ");
                    double cgpa =
                            sc.nextDouble();

                    Student student =
                            new Student(
                                    0,
                                    name,
                                    email,
                                    cgpa
                            );

                    dao.addStudent(student);

                    break;

                case 2:

                    dao.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter ID: ");

                    int id =
                            sc.nextInt();

                    dao.searchStudent(id);

                    break;

                case 4:

                    System.out.print("ID: ");

                    int updateId =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name: ");

                    String updateName =
                            sc.nextLine();

                    System.out.print("Email: ");

                    String updateEmail =
                            sc.nextLine();

                    System.out.print("CGPA: ");

                    double updateCgpa =
                            sc.nextDouble();

                    dao.updateStudent(
                            updateId,
                            updateName,
                            updateEmail,
                            updateCgpa
                    );

                    break;

                case 5:

                    System.out.print("Enter ID: ");

                    int deleteId =
                            sc.nextInt();

                    dao.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("Thank You");

                    System.exit(0);

                default:

                    System.out.println(
                            "Invalid Choice"
                    );
            }
        }
    }
}