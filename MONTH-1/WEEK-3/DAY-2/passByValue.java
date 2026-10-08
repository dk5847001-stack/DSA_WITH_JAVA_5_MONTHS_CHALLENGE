
public class passByValue {
    static void change(int n){
        n++;
    }
    public static void main(String[] args){
        int x = 5;
        change(x);
        System.out.print(x);
    }
}
