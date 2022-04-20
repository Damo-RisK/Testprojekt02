public class byThrees implements Series {

    int val;

    byThrees() {
        val = 0;
    }

    public int getNext() {
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 3;
        }
        return val;
    }
}
