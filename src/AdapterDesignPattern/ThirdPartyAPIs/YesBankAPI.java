package AdapterDesignPattern.ThirdPartyAPIs;

public class YesBankAPI {

    public boolean sendMoney(int amount , int toAccount){
        return true;
    }

    public int checkAccountBalance(int account){
        return 1000000;
    }

}
