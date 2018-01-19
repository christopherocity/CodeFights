public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0)
                return false;
        }
        return true;

    }
}
