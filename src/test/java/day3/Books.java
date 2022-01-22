package day3;

public class Books {


    public Books() {
        System.out.println("This is constructor");
    }

    //Constructor overloading:
    Books(String author, String title){
        System.out.println("Author "+ author);
        System.out.println("Title "+ title);
    }

    public static void main(String[] args) {
        Books book  = new Books("Arvind","Automation");
        new Books();
        book.read();
    }

    // Method overloading:

    public void read(){
        System.out.println("Reading");
    }

    public void read(String title){
        System.out.println("Reading " + title);
    }


}
