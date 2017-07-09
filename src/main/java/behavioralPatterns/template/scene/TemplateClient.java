package main.java.behavioralPatterns.template.scene;

/**
 * Created by henser on 17-7-9.
 */
public class TemplateClient {

    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }

}
