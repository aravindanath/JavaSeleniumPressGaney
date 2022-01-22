package day3;

public class AndroidPhone extends Mobile{

   public void battery() {
       System.out.println("Android Mobile Battery");
    }

    public static void main(String[] args) {
        AndroidPhone ap = new AndroidPhone();
        ap.battery();
        ap.fiveG();
        ap.flashlight();
    }

    public void fiveG(){
       System.out.println("5G");
    }
}
