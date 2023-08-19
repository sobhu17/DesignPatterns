package AdapterDesignPattern;

import AdapterDesignPattern.ThirdPartyAPIs.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{

    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public boolean pay(int amount, int toAccount) {
        return yesBankAPI.sendMoney(amount , toAccount);
    }

    @Override
    public int checkBalance(int account) {
        return yesBankAPI.checkAccountBalance(account);
    }
}
