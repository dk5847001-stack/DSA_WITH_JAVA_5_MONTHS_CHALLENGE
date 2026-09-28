public class Q8 {
    public static void main(String[] args) {
        boolean usernameCorrect = true;
        boolean passwordCorrect = true;
        if(usernameCorrect) {
            if(passwordCorrect){
                System.out.println("Login successful");
            }else{
                System.out.println("Invalid password");
            }
        }else {
            System.out.println("Invalid username");
        }
    }
}
