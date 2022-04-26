import library.GameOfThrone;
import org.junit.jupiter.api.BeforeEach;

public class GameOfThroneTest {

    private GameOfThrone gameOfThrone;

    @BeforeEach
    void setup() {
        gameOfThrone = new GameOfThrone("GameOfThrone", "Tragedy",
                "George R R. Martin", 1996, false);
    }

}

