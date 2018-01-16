public class KnapsackLight {

    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 + weight2 <= maxW)
            return value1 + value2;
        if (value1 == value2)
            return value1;

        int maxV = 0;

        if (weight1 <= maxW) {
            if (value1 > value2)
                maxV =  value1;
            if (weight2 > maxW)
                maxV =  value1;
        }
        if (weight2 <= maxW) {
            if (value2 > value1)
                maxV =  value2;
            if (weight1 > maxW)
                maxV =  value2;

        }

        return maxV;
    }
}
