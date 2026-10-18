class College{
    final void showRules(){
        System.out.println("college rules!");
    }
}
class CollegeStudent extends College{
    // void showRules(){
    //     System.out.println("different rules.");
    // }
}
public class FonalInMethod {
    public static void main(String[] args) {
        College c1 = new College();
        c1.showRules();
    }
}
