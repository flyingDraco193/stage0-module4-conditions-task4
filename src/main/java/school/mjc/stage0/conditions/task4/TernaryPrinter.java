package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        String greatestNumber = first > second ? "first" : "second";
        System.out.println(greatestNumber);
    }
}
