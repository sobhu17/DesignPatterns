package AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {

        PhonePe phonePe1 = new PhonePe(new YesBankAPIAdapter());
        System.out.println(phonePe1.doPayment(20000 , 123456789));
        System.out.println(phonePe1.findAccountBalance(32456786));

        PhonePe phonePe2 = new PhonePe(new ICICIBankAPIAdapter());
        System.out.println(phonePe2.doPayment(80000 , 879456125));
        System.out.println(phonePe2.findAccountBalance(45781352));


        /*
            Adapter design pattern is used when we are using some third party API's

            This design pattern allows us to no directly connect with Third party API's
            Instead what we can do is create an interface and then connect out class with the Third part API's

            The third party API's will not implement out interface so, we have to create another class which allow
            us to interact with these third party API's, like we have done in the above implementation

            It allows us to maintain Dependency inversion principal and avoid Regression.
         */


    }
}
