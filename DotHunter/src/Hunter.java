/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :6.30PM;
 * @since :2021.09.10;
 **/
public class Hunter {
    public class Hunter{
        private int positionX;
        private int positionY;
        private String name;
        private String color;

        public Hunter(String name,String color){
            this.name =name;
            this.color =color;
        }
        public int getpositionX() {
            return positionX;
        }

        public void setPositionX(int positionX) {
            this.positionX = positionX;
        }

        public int getPositionY(){
            return positionY;
        }

        public void setPositionY(int positionY) {
            this.positionY = positionY;
        }

        public void move(Hunter myhunter){

        }

        public void hunt() {

        }
    }
}
