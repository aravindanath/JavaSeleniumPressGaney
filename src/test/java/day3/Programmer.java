package day3;

public class Programmer extends Employee{

    public static void main(String[] args) {

        Programmer pm = new Programmer();
        pm.hike();
        pm.leasrningDev();
        pm.leavePolicy();
    }

    public void leasrningDev(){
        System.out.println("L&D");
    }

}
