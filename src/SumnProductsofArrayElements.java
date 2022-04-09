public class SumnProductsofArrayElements {

    public static void main(String[] args) {

        SumnProductsofArrayElements main = new SumnProductsofArrayElements();
        int [] customArray = {1, 3, 4, 5};
        main.spofArray(customArray);
    }

   /** by adding all the time complexities, then dropping the consonants
    and non dorminant terms, the time complexity of this function is O(N)
    **/

    void spofArray (int[] array) {
        int sum = 0;      //...................O(1)
        int product = 1;  //...................O(1)

        for (int i = 0; i < array.length; i++) { //...O(N)
            sum += array[i]; //.......................O(1)
        }

        for (int i = 0; i < array.length; i++) { //...O(N)

            product *= array[i]; //...................O(1)
            
        }
        System.out.println("sum = " + sum + ", " + "product = " + product); //..O(1)
    }
}
