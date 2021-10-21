import game.Game;

public class Main {
    public static void main(String[] args) {
        if (Game.play(5)) {
            System.out.println("Игрок выбыл из игры");
        } else {
            System.out.println("Игрок остался в игре");
        }
    }
}

