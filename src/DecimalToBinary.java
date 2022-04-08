public class DecimalToBinary {

    public static void main(String[] args) {

        DecimalToBinary main = new DecimalToBinary();
        var result = main.decimalToBinary(10);
        System.out.println("result = " + result);

    }

    public int decimalToBinary(int n) {

//        base condition - stopping criterion
        if (n == 0){
            return n;
        }

//        recursive case - the flow
        return n%2 + 10 * decimalToBinary(n/2);
    }
}
