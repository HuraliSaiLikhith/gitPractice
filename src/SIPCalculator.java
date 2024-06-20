public class SIPCalculator {
    public static double calculate(int amount, int noOfSips, double rate, int time){
        double TotalAmount = 0;
        double monthlyRate = rate / 100 / noOfSips;
        int TotalPeriods = time * noOfSips;

        for (int i=0; i < TotalPeriods; i++){
            TotalAmount += amount;
            TotalAmount *= (1 + monthlyRate);
        }

        return  TotalAmount;
    }
}
