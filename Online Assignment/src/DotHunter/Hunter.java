package DotHunter;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :6.10PM;
 * @since :2021.09.10;
 **/

//Hunter class
public class Hunter {

        //identify variable
        private String name;
        private String color;
        private static int positionX;
        private static int positionY;

        //assigned hunter variable
        public Hunter(String name,String color){
            this.name = name;
            this.color=color;
        }

        public static void init(){
            positionX=0;
            positionY=0;
        }

        //select position
        public void move (Hunter hunter){
            positionX = hunter.getPositionX();
            positionY = hunter.getPositionY();
            System.out.println("Hunter is moving , X:"+positionX+" Y:"+positionY);
        }


        public void hunt(){
            System.out.println("Hunting "+Board.getDotType());
        }


        //position X - return x
        public int getPositionX(){
            return positionX;
        }

        public void setPositionX(int positionX) throws SoundException{
            if (positionX <250)
                Hunter.positionX = positionX;
            else
                throw new SoundException("Oh  ooo!!...");
        }

        //position Y -return y
        public int getPositionY(){
            return positionY;
        }

        public void setPositionY(int positionY) throws SoundException{
        if (positionY <360)
            Hunter.positionY = positionY;
        else
            throw new SoundException("Oh  ooo!!...");
        }

}//end Hunter class
