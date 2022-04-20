public class newClass1 {


    private int Anzahl;
    private double Wert;
    private String Name;
    private String Nachname;

    public double getWert() {
        return Wert;
    }

    public void setWert(double wert) {
        this.Wert = wert;
    }

    public int getAnzahl() {
        return Anzahl;

    }

    public void setAnzahl(int anzahl) {
        this.Anzahl = anzahl;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        this.Nachname = nachname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    //Erzeugen eines neuen Objekts
    //
    public newClass1(int anzahl, double wert, String name, String nachname) {
        Anzahl = anzahl;
        Wert = wert;
        Name = name;
        Nachname = nachname;
    }
    public newClass1() {

    }

}
