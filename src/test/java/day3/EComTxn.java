package day3;

public class EComTxn {

    public static void main(String[] args) {


        BankTxn bnk = new BankTxn();

        bnk.setName("Arvind");
        bnk.setCvv(234);
        bnk.setExp(23);
        bnk.setCc(13241234134234l);


        System.out.println("Get Name: "+ bnk.getName());
        System.out.println("Get CVV: "+ bnk.getCvv());
        System.out.println("Get EXP: "+ bnk.getExp());
        System.out.println("Get CC: "+ bnk.getCc());

        System.out.println("************");

        bnk.setName("Shiv");
        bnk.setCvv(432);
        bnk.setExp(24);
        bnk.setCc(234524524524l);


        System.out.println("Get Name: "+ bnk.getName());
        System.out.println("Get CVV: "+ bnk.getCvv());
        System.out.println("Get EXP: "+ bnk.getExp());
        System.out.println("Get CC: "+ bnk.getCc());


    }
}
