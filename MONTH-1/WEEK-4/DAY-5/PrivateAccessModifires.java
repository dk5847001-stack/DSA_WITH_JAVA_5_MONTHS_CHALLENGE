class Student {
    private  int marks = 50;

    void display() {
        System.out.println(marks);
    }
}
class Person extends Student {
    // void marksDisplay(){
    //     System.out.println(marks);
    // }
}

public class PrivateAccessModifires {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.marks = 45;
        s1.display();
    }
}
