package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Progression {
    private final static  int maxSequenceLength = 10;
    private final static  int minSequenceLength = 5;
    private final static  int maxArifmeticProgresion = 4;
    public static void playGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var numMin = RandomUtils.generateRandomNums(RandomUtils.minNums, RandomUtils.maxNums);
            var volSequenceLength = RandomUtils.generateRandomNums(minSequenceLength, maxSequenceLength);
            var volArifmeticProgresion = RandomUtils.generateRandomNums(1, maxArifmeticProgresion);
            var possitionHiddenNumber = RandomUtils.generateRandomNums(0, volSequenceLength - 1);
            var hiddenNumber = possitionHiddenNumber * volArifmeticProgresion + numMin;
            var expresion = getExpresion(numMin, volSequenceLength, possitionHiddenNumber, volArifmeticProgresion);
            var resultComparisonQuestionAndAnswer = Engine.getResultGame(expresion, hiddenNumber);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.getResultGame(resultGame);
    }

    private static String getExpresion(int numMin, int volSequenceLength
            , int possitionHiddenNumber, int volArifmeticProgresion) {
        var result = new StringBuilder();
        var count = numMin;
        for (int i = 0; i < volSequenceLength; i++) {
            if (i == possitionHiddenNumber && i < volSequenceLength - 1) {
                result.append(".. ");
            }
            else if (i == possitionHiddenNumber && i == volSequenceLength - 1) {
                result.append("..");
            } else {
                result.append(count);
                result.append(" ");
            }
            count += volArifmeticProgresion;
        }
        return result.toString();
    }
}
