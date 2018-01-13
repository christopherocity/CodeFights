import java.util.ArrayDeque;
public class BoxBlur {

    int[][] boxBlur(int[][] image) {
        int[][] answer = new int[image.length-2][image[0].length-2];
        ArrayDeque values = new ArrayDeque();
        int jIndex = 0;
        int iIndex = 0;

        while (iIndex < image.length-2) {
            int sum = 0;
            int numElements = 0;
            for (int i = iIndex; i < iIndex+3; i++) {
                for (int j = jIndex; j < jIndex+3; j++) {
                    sum += image[i][j];
                    numElements++;
                }
            }
            int avg = sum / numElements;
            values.add(avg);
            if(jIndex+3 == image[0].length){
                iIndex++;
                jIndex = 0;
            } else
                jIndex++;
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = (int) values.remove();
            }
        }
        return answer;
    }

}