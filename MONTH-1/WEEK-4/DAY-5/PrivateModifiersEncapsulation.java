class Student {
    private int marks = 40;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return this.marks;
    }
}

public class PrivateModifiersEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(50);
        System.out.println(s.getMarks());
    }
}
