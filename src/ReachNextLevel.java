public class ReachNextLevel {

    boolean reachNextLevel(int experience, int threshold, int reward) {
        return (experience >= threshold || (experience + reward) >= threshold);

    }
}
