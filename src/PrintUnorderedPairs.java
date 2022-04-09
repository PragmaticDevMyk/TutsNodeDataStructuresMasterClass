public class PrintUnorderedPairs {
    public static void main(String[] args) {

        PrintUnorderedPairs main = new PrintUnorderedPairs();
        int [] customArray = {1,3,4,5};
        main.printUnOrderedPairs(customArray);

    }

    //time complexity is O(N^2)

    void printUnOrderedPairs(int [] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                System.out.println(array[i] + ", " + array[j]);
                
            }
            
        }
    }
}
