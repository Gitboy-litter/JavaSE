package day14_02.work6;

public class DebitCard {
    private String accountNumbe;
    private Double money;

    public DebitCard() {
    }

    public DebitCard(String accountNumbe, Double money) {
        if (money<0){
            throw new BalanceExection("余额永远不能为负数");
        }
        this.accountNumbe = accountNumbe;
        this.money = money;
    }

    public String getAccountNumbe() {
        return accountNumbe;
    }

    public void setAccountNumbe(String accountNumbe) {
        this.accountNumbe = accountNumbe;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        if (money<0){
            throw new BalanceExection("余额永远不能为负数");
        }
        this.money = money;
    }
}
