package AccountExercise;

public class Account {

    private int accountNo;
    private double amount;
    private int nationalId;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public Account(){
        this.amount = 0;
    }
    public void deposit(int amount){
        this.amount += amount;
    }
    public void withdraw (int amountWithdraw) throws NotEnoughMoneyException{
        if (this.amount < amountWithdraw ){
            throw new NotEnoughMoneyException();
        }

    }

}