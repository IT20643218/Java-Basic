import java.util.Random;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :10.00PM;
 * @since :2021.09.10;
 **/
public class Redsoldier extends Soldier {

        public Redsoldier() {
            System.out.println("killed using a Hand!");
        }

        Random random = new Random();
        int x = random.nextInt(1);
        int y = random.nextInt(3);

        int getdotX() {

            return x;
        }
        int getdotY() {

            return y;
        }
        void interface() {

            System.out.print("X cont :"+x+"\nY cont :"+y);
        }
    }
}
