package baseball;

public class Game {
    public static int MAX_NUMBER = 9;
    public static int MIN_NUMBER = 1;
    public static InputView inputView = new InputView();
    public static ResultView resultView = new ResultView();

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Game game = new Game();
        do {
            game.startGame();
        }
        while (inputView.askNextGame());
    }

    public void startGame() {
        // 숫자를 생성하고
        String answer = createNewAnswer();
        String userInput;
        int strikeCount;
        int ballCount;

        do {
            userInput = inputView.askAnswer();

            ballCount = getBallCount(userInput, answer);
            strikeCount = getStrikeCount(userInput, answer);

            resultView.printResult(ballCount, strikeCount);
        } while (userInput != answer);

    }

    public int getStrikeCount(String userInput, String answer) {
        // 대충 스트라이크 수
        return 1;
    }

    public int getBallCount(String userInput, String answer) {
        // 대충 볼 수
        return 1;
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
