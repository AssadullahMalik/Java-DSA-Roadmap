import java.util.Hashtable;

public class HashtableComplete {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "A");
        ht.put(2, "B");

        for (Integer key : ht.keySet())
            System.out.println(key + " " + ht.get(key));
    }
}
