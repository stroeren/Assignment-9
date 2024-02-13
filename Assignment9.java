public class Assignment9 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <number>");
            System.exit(1);
        }

        int position = Integer.parseInt(args[0]);
        int result = fibonacci(position);

        System.out.println("Fibonacci number at position " + position + " is: " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}