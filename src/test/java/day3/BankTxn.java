package day3;

public class BankTxn {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    private String name ;
    private long cc ;
    private int cvv ;
    private int exp ;

}
