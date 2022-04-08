public class FactorialUsingRecursion {
    public static void main(String[] args) {

        FactorialUsingRecursion recursion = new FactorialUsingRecursion();
        var rec = recursion.factorial(15);
        System.out.println("rec = " + rec);

    }

    public int factorial(int n){

//        the unintentional case - the constraint

        if (n < 0) {
            return -1;
        }

//        the base case - the stopping criterion
        if (n == 0 || n == 1) {
            return 1;
        }

//        recursive cae - the flow
        return n * factorial(n - 1);
    }
}
