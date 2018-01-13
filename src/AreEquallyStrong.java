public class AreEquallyStrong {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        return ((yourLeft == friendsLeft || yourLeft == friendsRight)
                && (yourRight == friendsRight || yourRight == friendsLeft));
    }

}
