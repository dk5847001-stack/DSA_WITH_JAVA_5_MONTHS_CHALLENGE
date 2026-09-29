
public class useOfYield {
    public static void main(String[] args) {
        int day = 2;

        String result = switch (day) {

            case 1 -> "Monday";

            case 2 -> {
                System.out.println("Processing...");
                yield "Tuesday";
            }

            default -> "Invalid";
        };

        System.out.println(result);
    }
}
