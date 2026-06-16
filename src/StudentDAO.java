import java.sql.*;

public class StudentDAO {

    public void addStudent(Student student) {

        String query =
                "INSERT INTO students(name,email,cgpa) VALUES(?,?,?)";

        try {

            Connection conn =
                    DBConnection.getConnection();

            PreparedStatement pstmt =
                    conn.prepareStatement(query);

            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getEmail());
            pstmt.setDouble(3, student.getCgpa());

            pstmt.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void viewStudents() {

        String query = "SELECT * FROM students";

        try {

            Connection conn =
                    DBConnection.getConnection();

            PreparedStatement pstmt =
                    conn.prepareStatement(query);

            ResultSet rs =
                    pstmt.executeQuery();

            System.out.println("\n===== STUDENTS =====");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + " | "
                                + rs.getString("name")
                                + " | "
                                + rs.getString("email")
                                + " | "
                                + rs.getDouble("cgpa")
                );
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void searchStudent(int id) {

        String query =
                "SELECT * FROM students WHERE id=?";

        try {

            Connection conn =
                    DBConnection.getConnection();

            PreparedStatement pstmt =
                    conn.prepareStatement(query);

            pstmt.setInt(1, id);

            ResultSet rs =
                    pstmt.executeQuery();

            if (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + " | "
                                + rs.getString("name")
                                + " | "
                                + rs.getString("email")
                                + " | "
                                + rs.getDouble("cgpa")
                );

            } else {

                System.out.println(
                        "Student Not Found"
                );
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void updateStudent(
            int id,
            String name,
            String email,
            double cgpa
    ) {

        String query =
                "UPDATE students SET name=?, email=?, cgpa=? WHERE id=?";

        try {

            Connection conn =
                    DBConnection.getConnection();

            PreparedStatement pstmt =
                    conn.prepareStatement(query);

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setDouble(3, cgpa);
            pstmt.setInt(4, id);

            int rows =
                    pstmt.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Student Updated"
                );

            } else {

                System.out.println(
                        "Student Not Found"
                );
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(int id) {

        String query =
                "DELETE FROM students WHERE id=?";

        try {

            Connection conn =
                    DBConnection.getConnection();

            PreparedStatement pstmt =
                    conn.prepareStatement(query);

            pstmt.setInt(1, id);

            int rows =
                    pstmt.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Student Deleted"
                );

            } else {

                System.out.println(
                        "Student Not Found"
                );
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}