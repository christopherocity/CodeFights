public class IsInfiniteProcess {

    boolean isInfiniteProcess(int a, int b) {
        return a > b || b - a == 1 || a != b && isInfiniteProcess(a + 1, b - 1);

    }
}
