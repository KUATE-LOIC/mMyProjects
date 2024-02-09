// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Robot cyborg = new Robot("CYBORG");
        Robot stark = new Robot("STARK");
        Fighter tony = new Fighter("TONY" ,123);
        Fighter peter = new Fighter("PETER" , 123);
        System.out.println(tony.toString());
        System.out.println(peter.toString());
        System.out.println(cyborg);
        System.out.println(stark);

        Robot winner = Arena.fight(cyborg, stark);
        System.out.println("Le vainqueur est : " + winner);

        Fighter winnerFighter = (Fighter) Arena.fight(tony, peter);


        }
    }
