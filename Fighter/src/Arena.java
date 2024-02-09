import org.junit.Test;
public class Arena {
        public static Robot fight(Robot robot1, Robot robot2) {
            while (!robot1.isDead() && !robot2.isDead()) {
                robot1.fire(robot2);
                if (!robot2.isDead()) {
                    robot2.fire(robot1);
                }
            }

            if (robot1.isDead()) {
                System.out.println(robot1.getName()+" est mort");
                return  robot2;
            } else {
                System.out.println(robot2.getName()+" est mort");
                return robot1;
            }
        }

        @Test
        public void test_fight() {
            System.out.println("TEST OF fight");

            Robot player1 = new Robot("player1");
            Robot player2 = new Robot("player2");

            Robot winner = Arena.fight(player1, player2);
            if (winner == player1 || winner == player2)
                if (player1.isDead() || player2.isDead()) System.out.println("test fight: right");
                else System.out.println("test fight: wrong");

        }
    }

