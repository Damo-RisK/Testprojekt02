import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        ByTwos byTwos = new ByTwos();
        byThrees byThreesobj = new byThrees();

        Series ob;

        for (int i = 0; i < 6; i++) {

            ob = byTwos;
            System.out.println("ByTwos: " + ob.getNext());

            ob = byThreesobj;
            System.out.println("ByThrees: " + ob.getNext());
        }
        //Static Methods in Interfaces can only be called by the Interface!
        byTwos.printStuff();
        byThreesobj.printStuff();

        byTwos.printStuff();
    }

}
