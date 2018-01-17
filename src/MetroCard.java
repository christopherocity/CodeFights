public class MetroCard {

    int[] metroCard(int lastNumberOfDays) {
        java.util.ArrayList<Integer> answer = new java.util.ArrayList<>();
        if (lastNumberOfDays <= 30) {
            answer.add(31);
        } else {
            answer.add(28);
            answer.add(30);
            answer.add(31);
        }

        int[] array = new int[answer.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = answer.remove(0);
            System.out.println(array[i]);
        }
        return array;
    }
}
