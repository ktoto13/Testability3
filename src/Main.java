public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int CreditOneYear = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платёж " + CreditOneYear + " рублей");

        int CreditTwoYears = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платёж " + CreditTwoYears + " рублей");

        int CreditThreeYears = service.calculate(1_000_000,  3, 9.99);
        System.out.println("Ежемесячный платёж " + CreditThreeYears + " рублей");
    }

}