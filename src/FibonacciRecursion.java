public class FibonacciRecursion {
    public static void main(String[] args) {

        FibonacciRecursion recursion = new FibonacciRecursion();
        var rec = recursion.fibonacci(10);
        System.out.println("rec = " + rec);

    }

    public int fibonacci(int n){

//        unintentional case - the constraint
        if (n < 0) {
            return -1;
        }

//        base case - the stopping criterion
        if (n == 0 || n == 1) {
            return n;
        }

//        recursive case - the flow
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
