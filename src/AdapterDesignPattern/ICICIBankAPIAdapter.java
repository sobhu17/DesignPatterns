package AdapterDesignPattern;

import AdapterDesignPattern.ThirdPartyAPIs.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPI{

    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public boolean pay(int amount, int toAccount) {
        return iciciBankAPI.transferMoney(amount , toAccount);
    }

    @Override
    public int checkBalance(int account) {
        return iciciBankAPI.findAccountBalance(account);
    }
}
