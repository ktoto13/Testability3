public class CreditPaymentService {
    public int calculate(int totalCredit, int years, double percent) {

        double monthlyPercent = percent / 1200; // месячная процентная ставка
        double sumMonth = years * 12; // количество месяцев

        double monthlyPayment = totalCredit * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, -sumMonth));

        int monthlyPaymentInt = (int) monthlyPayment;
        return monthlyPaymentInt;

    }
}
