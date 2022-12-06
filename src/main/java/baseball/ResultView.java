package baseball;

public class ResultView {
    public void printResult(int ballCount, int strikeCount) {
        String message = buildMessage(ballCount, strikeCount);
        System.out.println(message);
    }

    public String buildMessage(int ballCount, int strikeCount) {
        String message = "";

        if (ballCount + strikeCount == 0) {
            message += "낫싱";
        }
        if (ballCount > 0) {
            message += String.format("%d볼 ", ballCount);
        }
        if (strikeCount > 0) {
            message += String.format("%d스트라이크", strikeCount);
        }
        if (strikeCount == 3) {
            message += "\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        }
        return message;
    }
}
