package DotHunter;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :6.00AM;
 * @since :2021.09.11;
 **/
//Soldier class
public abstract class Soldier {
        //idetify variable
        protected int positionX;
        protected int positionY;
        //task
        Soldier newSoldier[];

        public abstract void hunt();

        public abstract void init();
}//end Soldier class
