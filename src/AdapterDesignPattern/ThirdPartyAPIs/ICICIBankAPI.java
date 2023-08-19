package AdapterDesignPattern.ThirdPartyAPIs;

public class ICICIBankAPI {
    public boolean transferMoney(int amount , int toAccount){
        return false;
    }

    public int findAccountBalance(int account){
        return 25025252;
    }

}
