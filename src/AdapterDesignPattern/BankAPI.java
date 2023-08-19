package AdapterDesignPattern;

public interface BankAPI {

    public boolean pay(int amount , int toAccount);

    public int checkBalance(int account);

}
