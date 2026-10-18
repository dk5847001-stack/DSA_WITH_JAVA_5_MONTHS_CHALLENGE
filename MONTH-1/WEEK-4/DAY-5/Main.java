/*
Counter naam ki class banao.
static int count = 0; declare karo.
Constructor mein count++ karo.
main() mein 5 objects banao.
Counter.count print karo.
*/
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        System.out.println(Counter.count);
        
    }
}
