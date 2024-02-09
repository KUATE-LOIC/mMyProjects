import org.junit.Test;

import java.util.Random;
public class Fighter extends Robot
{
        private Random random;
        public Fighter(String name , int seed) {
            super(name);
            this.random = new Random(seed);
        }

        @Override
        public String toString(){return "Fighter " + getName();}

        @Override
        public void fire(Robot cible) {

            if (!isDead()) {
                if (random.nextBoolean()) {
                   super.fire(cible);
                    System.out.println("Fighter " + getName() + " a touché la cible " + cible.getName());
                } else {
                    System.out.println("Fighter " + getName() + " a raté sa cible !");
                }
            }
        }

        @Test
        public void test_fighterFire(){
            System.out.println("TEST OF fighterFire");

            Fighter fighter1 = new Fighter("Fighter1" ,123);
            Fighter fighter2 = new Fighter("Fighter2" , 123);

            fighter1.fire(fighter2);

            if(fighter2.getVie() < 10)   System.out.println("TEST OF fighterFire: right");
            else System.out.println("TEST OF fighterFire: wrong");
        }

    }

