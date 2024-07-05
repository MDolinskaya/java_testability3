public class CreditPaymentService {
    public int calculate(int amount, double interest, int months) {
        double interestPerMonth = interest / 12 / 100;
        double monthlyPayment = (amount * (interestPerMonth * Math.pow((1 + interestPerMonth), months) / (Math.pow((1 + interestPerMonth), months) - 1)));
        return (int) monthlyPayment;
    }
}
