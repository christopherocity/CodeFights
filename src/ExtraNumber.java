public class ExtraNumber {

    int extraNumber(int a, int b, int c) {
        return (b != c) ? extraNumber(c,a,b) : a;
    }
}
