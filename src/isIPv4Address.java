public class isIPv4Address {
    boolean isIPv4Address(String inputString) {
        if (inputString.charAt(0) == '.')
            return false;

        String[] ip = inputString.split("\\.");

        if (ip.length != 4)
            return false;

        for (String anIp : ip) {
            if (anIp.equals("") || !anIp.matches("[-+]?\\d*\\.?\\d+"))
                return false;
            if (anIp.length() > 3)
                return false;
            int ipInt = Integer.parseInt(anIp);
            if (ipInt < 0 || ipInt > 255)
                return false;
        }

        return true;
    }
}
