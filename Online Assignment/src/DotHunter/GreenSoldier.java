package DotHunter;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :12.10PM;
 * @since :2021.09.11;
 **/
//GreenSoldier class

public class GreenSoldier extends Soldier{


        public void hunt(){
            System.out.println("Hunting :"+Board.getDotType());
            System.out.println("Game Over");
        }
        public void init(){
            int MinmumX = 0;
            int MaxmumX = 250;
            int MinmumY = 0;
            int MaxmumY = 360;

            int positionX= (int) ((Math.random() * ((MaxmumX - MinmumX) + 1)) + MaxmumX);
            int positionY=(int) ((Math.random() * ((MaxmumY - MinmumY) + 1)) + MinmumY);
        }

}//end Green slodeir
