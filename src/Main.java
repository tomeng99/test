public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            print(i);
        }
    }

    private static void print(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("fizzbuzz");
        }
        else if (x % 3 == 0) {
            System.out.println("fizz");
        } else if (x % 5 == 0) {
            System.out.println("buzz");
        }
        else {
            System.out.println(x);
        }
    }
}