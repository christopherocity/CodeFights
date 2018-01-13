public class AvoidObstacles {

    int avoidObstacles(int[] inputArray) {
        int[] numberLine = new int[40];
        int a = -1;
        int b = -1;
        int jump = 0;

        for (int anInputArray : inputArray) {
            numberLine[anInputArray] = 1;
        }

        for (int i = 0; i < numberLine.length; i++) {
            if (numberLine[i] == 0) {
                if(a == -1)
                    a = i;
                else if (b == -1)
                    b = i;
            }

            jump = b - a;

            if (jump > 0) {
                for (int j = 0; j < numberLine.length; j+=jump) {
                    if (numberLine[j] == 1) {
                        b = -1;
                        break;
                    }
                }
            }
        }

        return jump;
    }

}
