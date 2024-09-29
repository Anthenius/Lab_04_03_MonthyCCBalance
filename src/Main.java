public class Main
{
    public static void main(String[] args)
    {
        // Initial credit card balance and interest rate
        double balance = 5000.00;
        double interestRate = 0.17;

        // Calculate interest for one month and two months
        double interestOneMonth = balance * interestRate / 12;
        double balanceAfterOneMonth = balance + interestOneMonth;
        double interestTwoMonths = balanceAfterOneMonth * interestRate / 12;
        double balanceAfterTwoMonths = balanceAfterOneMonth + interestTwoMonths;

        // Output interest and balance after one and two months
        System.out.println("Initial balance: $" + balance);
        System.out.println("Interest due after one month: $" + interestOneMonth);
        System.out.println("Balance after one month: $" + balanceAfterOneMonth);
        System.out.println("Interest due after two months: $" + interestTwoMonths);
        System.out.println("Balance after two months: $" + balanceAfterTwoMonths);
    }
}
