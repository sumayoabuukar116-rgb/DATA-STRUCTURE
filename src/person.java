
void main() {
    Student s = new Student();
    s.setDetails("Sumayo", "101");
    s.setGpa(3.5);
    System.out.println(s.studentCard());

    Lecturer l = new Lecturer();
    l.setDetails("Ahmed", "201");
    l.setFaculty("Computer Science");
    System.out.println(l.staffCard());
}

class Person {
    protected String name;
    protected String id;

    public void setDetails(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String describe() {
        return name + " (" + id + ")";
    }
}

class Student extends Person {
    protected double gpa;

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    public String studentCard() {
        return "Student " + describe() + ", GPA = " + gpa;
    }
}

class Lecturer extends Person {
    private String faculty;

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String staffCard() {
        return "Lecturer " + name + " (" + id + "), " + faculty;
    }
}
