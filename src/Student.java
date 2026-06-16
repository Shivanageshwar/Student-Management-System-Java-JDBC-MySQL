public class Student {

    private int id;
    private String name;
    private String email;
    private double cgpa;

    public Student(int id, String name, String email, double cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}