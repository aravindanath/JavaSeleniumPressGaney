package day2;

public class AccessModifier {

    public void pubMethod(){
        System.out.println("Public method");
    }

    protected void proMethod(){
        System.out.println("Protected method");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }

      void defMethod(){
        System.out.println("Default method");
    }


    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        am.defMethod();
        am.proMethod();
        am.pubMethod();
        am.privateMethod();
    }
}
