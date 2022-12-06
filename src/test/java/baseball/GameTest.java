package baseball;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GameTest {
    private static Game game;

    @BeforeAll
    static void setUp() {
        game = new Game();
    }

    @Test
    void main() {
    }

    @Test
    void startGame() {
    }

    @Test
    void createNewNumber() {

    }

    @Test
    void getIntegerRange() {
        int lowerBound = 3;
        int upperBound = 6;
        assertThat(game.getIntegerRange(lowerBound, upperBound)).isGreaterThanOrEqualTo(lowerBound).isLessThan(upperBound);
        assertThat(game.getIntegerRange(lowerBound, upperBound)).isGreaterThanOrEqualTo(lowerBound).isLessThan(upperBound);
        assertThat(game.getIntegerRange(lowerBound, upperBound)).isGreaterThanOrEqualTo(lowerBound).isLessThan(upperBound);
        assertThat(game.getIntegerRange(lowerBound, upperBound)).isGreaterThanOrEqualTo(lowerBound).isLessThan(upperBound);
        assertThat(game.getIntegerRange(lowerBound, upperBound)).isGreaterThanOrEqualTo(lowerBound).isLessThan(upperBound);
        assertThat(game.getIntegerRange(lowerBound, upperBound)).isGreaterThanOrEqualTo(lowerBound).isLessThan(upperBound);
        assertThat(game.getIntegerRange(lowerBound, upperBound)).isGreaterThanOrEqualTo(lowerBound).isLessThan(upperBound);
    }

    @Test
    void addNewIntString(){
        String stringLength0 = "";
        assertThat(game.addNewIntString(stringLength0).length()).isEqualTo(1);

        String stringLength1 = "1";
        assertThat(game.addNewIntString(stringLength1).length()).isEqualTo(2);

        String stringLength2 = "23";
        assertThat(game.addNewIntString(stringLength2).length()).isEqualTo(3);

        String stringLength3 = "34";
        assertThat(game.addNewIntString(stringLength3).length()).isEqualTo(3);
    }
}