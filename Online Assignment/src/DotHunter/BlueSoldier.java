package DotHunter;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :10.40AM;
 * @since :2021.09.11;
 **/

//BlueSoldier class
public class BlueSoldier extends Soldier{

    public void hunt() {

        System.out.println("Killed using a gun");
        System.out.println("Game over");
    }

    //Solodier position
    public void init() {

        int MinmumX = 0;
        int MaxmumX = 250;
        int MinmumY = 0;
        int MaxmumY = 360;

        int positionX = (int) (Math.random() * (MaxmumX - MinmumX + 1) + MaxmumX);
        int positionY = (int) (Math.random() * (MaxmumY - MinmumY + 1) + MinmumY);

    }

}end BlueSoldier class
