public class PrintUnorderedPairsTwoArrays {
    public static void main(String[] args) {

        PrintUnorderedPairsTwoArrays main = new PrintUnorderedPairsTwoArrays();
        int [] customArray = {1,3,4,5};
        int [] customArrayB = {6,2, 9, 0};
        main.printUnOrderedPairs(customArray, customArrayB);

    }

    //time complexity is O(N^2)

    void printUnOrderedPairs(int [] arrayA, int [] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {

            for (int j = 0; j < arrayB.length; j++) {

                if (arrayA[i] < arrayB[j]) {

                    System.out.println(arrayA[i] + ", " + arrayB[j]);

                }
            }
            
        }
    }
}
