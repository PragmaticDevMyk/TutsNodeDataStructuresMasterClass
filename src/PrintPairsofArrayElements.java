public class PrintPairsofArrayElements {

    public static void main(String[] args) {

        PrintPairsofArrayElements main = new PrintPairsofArrayElements();
        int [] customArray = {1, 3, 4, 5};
        main.printPairs(customArray);
    }

   /** by multiplying time complexities in a nested loop, add the other time complexities, then dropping the consonants
    and non dorminant terms, the time complexity of this function is O(N^2)
    **/

    void printPairs (int[] array) {

        for (int i = 0; i < array.length; i++) {  //..........................O(N)

            for (int j = 0; j < array.length; j++) { //.......................O(N)

                System.out.println(array[i] + ", " + array[j]); //............O(1)
                
            }
            
        }

    }
}
