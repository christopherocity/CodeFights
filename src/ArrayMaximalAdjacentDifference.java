public class ArrayMaximalAdjacentDifference {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int diff = 0;

        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] > inputArray[i+1] && (inputArray[i] - inputArray[i+1]) > diff)
                diff = inputArray[i] - inputArray[i+1];
            if (inputArray[i] < inputArray[i+1] && (inputArray[i+1] - inputArray[i]) > diff)
                diff = inputArray[i+1] - inputArray[i];
        }

        return diff;
    }

}
