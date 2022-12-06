package baseball;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ResultViewTest {
    private static ResultView resultView;

    @BeforeAll
    static void setUp(){
        resultView = new ResultView();
    }

    @Test
    void print1(){
        resultView.printResult(1,0);
    }

    @Test
    void print2(){
        resultView.printResult(1,2);
    }

    @Test
    void print3(){
        resultView.printResult(0,2);
    }
}
