public class PhoneCall {

    int phoneCall(int min1, int min2_10, int min11, int s) {
        if (s < min1)
            return 0;

        int total = s - min1;
        int minutes = 1;

        for (int i = 0; i <= 8; i++) {
            if (total-min2_10 < 0)
                return minutes;
            total -= min2_10;
            minutes++;
        }

        while (!(total - min11 < 0)) {
            total -= min11;
            minutes++;

        }

        return minutes;
    }
}
