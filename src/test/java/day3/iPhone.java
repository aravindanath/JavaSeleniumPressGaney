package day3;

public class iPhone extends Mobile{


    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.battery();
        iphone.flashlight();
        iphone.camera();
    }


    void camera(){
        System.out.println("12mp camera");
    }

    @Override
    public void battery() {
        System.out.println("Battery");
    }
}
