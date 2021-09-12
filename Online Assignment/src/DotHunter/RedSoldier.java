package DotHunter;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :10.30AM;
 * @since :2021.09.11;
 **/
//RedSoldier class
public class RedSoldier extends Soldier{
    public void hunt() {

        System.out.println("Killed using hand");
        System.out.println("Game over");

    }

    //position
    public void init() {

        int MinmumX = 0;
        int MaxmumX = 250;
        int MinmumY = 0;
        int MaxmumY = 360;

        int positionX = (int)(Math.random()*(MaxmumX-MinmumX + 1)+MaxmumX);
        int positionY =(int)(Math.random()*(MaxmumY-MinmumY + 1)+MinmumY);

    }
}//end red solder
