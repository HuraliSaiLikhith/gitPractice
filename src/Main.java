public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Addition "+ Calculator.add(10, 15));
        System.out.println("Intrest "+ IntrestCalculator.calculate(100000, 8, 5));
        System.out.println("SIP return : "+ SIPCalculator.calculate(10000, 12, 12, 20));
    }
}