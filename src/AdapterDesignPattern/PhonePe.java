package AdapterDesignPattern;

public class PhonePe {
    BankAPI bankAPI;

    PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
    }

    public boolean doPayment(int amount , int toAccount){
        return bankAPI.pay(amount , toAccount);
    }

    public int findAccountBalance(int account){
        return bankAPI.checkBalance(account);
    }

}
