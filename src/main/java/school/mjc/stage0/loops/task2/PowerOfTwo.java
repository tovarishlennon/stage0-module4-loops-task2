package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int multiplier = 1;
        if (power > 0) {
            while (true) {
                if (multiplier > power * power) {
                    break;
                }
                System.out.println(multiplier);
                multiplier *= 2;
            }
        } else if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println("1");
        }
    }
}
