public class Main {
    private static final String ENV_NAME = "STR";
    public static void main(String[] args) {
        String value = System.getenv(ENV_NAME);
        System.out.println(value);
    }
}
