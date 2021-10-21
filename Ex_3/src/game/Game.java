package game;

public class Game {

    static boolean isGreenLight = false;

    public static boolean play(int speedOfPlayer) {

        if (!isGreenLight && speedOfPlayer > 0) {
            return true;
        }
        return false;
    }
}
