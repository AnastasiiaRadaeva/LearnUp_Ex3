package game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void positiveSpeed() {
        boolean result = Game.play(9);
        Assertions.assertTrue(result, "Скорость положительна - игрок выбывает");
    }

    @Test
    public void ziroSpeed() {
        boolean result = Game.play(0);
        Assertions.assertFalse(result, "Скорость нулевая - игрок остается в игре");
    }
}
