
//All Variables declared in Interfaces are public static and final!!!!!!!!
public interface Series {

    int getNext();

    int MAX = 10;

    String ERRORMSG = "Cant go Higher than: " + MAX;



    default void printStuff(){
        System.out.println("Jojojo dude");
        printMoreStuff();
    }

    private void printMoreStuff() {
        System.out.println("I dont know what to write anymore");
    }
}
