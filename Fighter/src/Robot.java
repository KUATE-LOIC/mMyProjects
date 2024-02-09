import org.junit.Test;

public class Robot {
        private String name;
        private int PointDeVie;
        public Robot(String name) {
            this.name = name;
            this.PointDeVie = 10;
        }

        public int getVie() { return PointDeVie; }

        public void fire(Robot cible) {
            if (!isDead()) {
                cible.PointDeVie -= 2;
                System.out.println("Robot/Fighter " + name + " a touché le Robot/Fighter " + cible.getName());
            }
        }

        public boolean isDead() {
            return PointDeVie <= 0;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "Robot " + name;
        }

         @Test
        public void player1_isDead(){
            System.out.println("TEST OF isDead");
            Robot player1 = new Robot("player1");
            player1.PointDeVie = 0;
            if (player1.isDead()) System.out.println("test isDead: right");
            else System.out.println("test isDead: wrong");
        }

        @Test
        public void test_fire(){
            System.out.println("TEST OF fire");
            Robot player1 = new Robot("player1");
            Robot player2 = new Robot("player2");

            player1.fire(player2);
            if (player1.PointDeVie==10 && player2.PointDeVie==8) System.out.println("test fire: right");
            else System.out.println("test fire: wrong");
        }
    }

