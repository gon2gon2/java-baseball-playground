package baseball;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public boolean askNextGame() {
        return getNumber() == 1;
    }

    public int askAnswer() {
        return getNumber();
    }

    private int getNumber() {
        return scanner.nextInt();
    }
}
