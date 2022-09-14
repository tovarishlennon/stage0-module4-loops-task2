package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int multipliedNumbers = multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive * multiplyByAndToInclusive : multiplyByAndToInclusive * (-multiplyByAndToInclusive);

        if (multipliedNumbers > 0) {
            while (counter <= multipliedNumbers) {
                System.out.println(counter);
                counter += multiplyByAndToInclusive;
            }
        } else if (multipliedNumbers < 0) {
            while ( counter >= multipliedNumbers) {
                System.out.println(counter);
                counter += multiplyByAndToInclusive;
            }
        } else {

        }
    }
}
