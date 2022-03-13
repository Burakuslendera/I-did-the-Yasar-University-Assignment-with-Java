
public class Arena {

    public static void listFighters(Fighter[] fighter) {
        // Takes a Fighter array as parameter.
        for (int i = 0; i < fighter.length; i++) {
            // Enumerates and prints the names of all fighters in the array
            System.out.println(fighter[i].getName());
        }
    }
}
