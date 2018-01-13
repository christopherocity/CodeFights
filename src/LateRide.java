public class LateRide {

    int lateRide(int n) {
        String ans = String.valueOf(n/60);
        String ans2 = String.valueOf(n%60);
        int sum = 0;

        for(int i = 0; i < ans.length(); i++) {
            sum += Character.getNumericValue(ans.charAt(i));
        }

        for(int i = 0; i < ans2.length(); i++) {
            sum += Character.getNumericValue(ans2.charAt(i));
        }

        return sum;

    }
}
