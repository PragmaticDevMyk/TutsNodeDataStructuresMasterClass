public class GCD {

    public static void main(String[] args) {

        GCD main = new GCD();
        var result = main.gcd(10, 4);
        System.out.println("result = " + result);

    }

//    Euclidean Algorithm

    public int gcd(int a, int b) {

//        base condition - stopping criterion
        if (b == 0) {
            return a;
        }

//        recursive case - the flow
        return gcd(b, a % b);
    }
}
