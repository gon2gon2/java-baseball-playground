package baseball;

public class Game {
    public static int MAX_NUMBER = 9;
    public static int MIN_NUMBER = 1;
    public static InputView inputView = new InputView();
    public static ResultView resultView = new ResultView();

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Game game = new Game();
//        do {
//            game.startGame();
//
//        }
//        while (inputView.nextGame());
    }

    public void startGame() {
        // 숫자를 생성하고
        String answer = createNewAnswer();

        // 입력을 받고
        inputView.askAnswer();

        // 결과를 처리하고

    }

    public String createNewAnswer() {
        String newAnswer = "";

        do {
            newAnswer = addNewIntString(newAnswer);

        } while (newAnswer.length() < 3);
        return newAnswer;
    }

    public String addNewIntString(String answer) {
        String randomIntString;
        int randomInt;
        do {

            randomInt = getIntegerRange(MIN_NUMBER, MAX_NUMBER);
            randomIntString = Integer.toString(randomInt);

        } while (answer.contains(randomIntString));

        return answer + randomIntString;
    }

    public int getIntegerRange(int lowerBound, int upperBound) {
        int newInteger;
        do {
            newInteger = (int) (Math.random() * 10);
        } while (newInteger < lowerBound || upperBound <= newInteger);

        return newInteger;
    }
}
