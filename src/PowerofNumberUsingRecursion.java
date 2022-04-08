public class PowerofNumberUsingRecursion {

    public static void main(String[] args) {

        PowerofNumberUsingRecursion main = new PowerofNumberUsingRecursion();
        var result = main.power(10, 10);
        System.out.println("result = " + result);


    }


    public int power(int base, int exp) {

//    base condition - stopping criterion

        if (exp == 0) {
            return 1;
        }

        if (exp == 1) {
            return base;
        }

//    unintentional condition - the constraint

        if (exp < 0) {
            return -1;
        }

//    recursive case - the flow

        return base * power(base, exp - 1);
    }

}
