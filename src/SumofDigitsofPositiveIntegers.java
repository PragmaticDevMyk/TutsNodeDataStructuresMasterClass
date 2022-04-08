public class SumofDigitsofPositiveIntegers {

    public static void main(String[] args) {

        SumofDigitsofPositiveIntegers main = new SumofDigitsofPositiveIntegers();

        var result = main.sumofDigits(555);
        System.out.println("result = " + result);

    }

    public int sumofDigits(int n) {

//        base condition - stopping criterion
        if (n == 0) {
            return 0;
        }

//        unintentional case - the constraint

        if (n < 0){
            return 0;
        }


//        recursive case - the flow
        return n % 10 + sumofDigits(n/10);
    }


}
