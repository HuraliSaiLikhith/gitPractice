public class SIPCalculator {
    public static double calculate(int amount, int noOfSips, double rate, int time){
        double totalAmount = 0;
        double monthlyRate = rate / 100 / noOfSips;
        int totalPeriods = time * noOfSips;

        for (int i=0; i < totalPeriods; i++){
            totalAmount += amount;
            totalAmount *= (1 + monthlyRate);
        }

        return  totalAmount;
    }
}
