
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter the number of people in the arena");
        Scanner scanner = new Scanner(System.in);
        int numberOfFighters = scanner.nextInt();
        Fighter[] fighters = new Fighter[numberOfFighters];
        for (int i = 0; i < numberOfFighters; i++) {
            System.out.println("Enter fighter name:");
            String name = scanner.next();
            System.out.println("Enter fighter damage:");
            int damage = scanner.nextInt();
            Fighter fighter = new Fighter(name, damage);
            fighters[i] = fighter;
        }
        Arena.listFighters(fighters);
        for (int i = 0; i < fighters.length; ++i) {
            System.out.println(fighters[i]);
        }
        System.out.println("Choose a fighter! :");
        int numberOfEnemy = scanner.nextInt();
        for (Fighter fighter : fighters) {
            System.out.println(fighter);
        }
        Fighter enemy = fighters[numberOfEnemy - 1];
        System.out.println("Choose an fighter to fight!:");
        int numberOfEnemy2 = scanner.nextInt();
        for (Fighter fighter : fighters) {
            System.out.println(fighter);
        }
        Fighter enemy2 = fighters[numberOfEnemy2 - 1];
        System.out.println("Choose an enemy:");
        int numberOfEnemy3 = scanner.nextInt();
        for (Fighter fighter : fighters) {
            System.out.println(fighter);
        }
        Fighter enemy3 = fighters[numberOfEnemy3 - 1];
        for (Fighter fighter : fighters) {
            fighter.attack(enemy);
            fighter.attack(enemy2);
            fighter.attack(enemy3);
        }
        System.out.println("-----------------------------------------");
        for (Fighter fighter : fighters) {
            System.out.println(fighter);
        }
    }
}