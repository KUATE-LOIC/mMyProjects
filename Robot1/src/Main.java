// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Robot cyborg = new Robot("CYBORG");
        Robot stark = new Robot("STARK");


        System.out.println(cyborg);
        System.out.println(stark);

        Robot winner = Arena.fight(cyborg, stark);
        System.out.println("Le vainqueur est : " + winner);

        

        }
    }
