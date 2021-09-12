package DotHunter;

import java.util.Scanner;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :7.40PM;
 * @since :2021.09.10;
 **/
public class MainApp {
    public static void main(String[] args) throws SoundException {

        Scanner sc = new Scanner(System.in);
        Hunter myhunter = new Hunter("Maha Deva", "Brown");
        Soldier threeSoldier[] = {new BlueSoldier(), new RedSoldier(), new GreenSoldier()};
        Board myboard = new Board("superDot", myhunter, threeSoldier);

        //Try catch block for Exception hadaling
        try {
            System.out.println("Use the keyboard up, down, left, right arrow keys to move the hunter");
            myhunter.setPositionX(sc.nextInt());
            myhunter.setPositionY(sc.nextInt());
            myhunter.move(myhunter);
            myhunter.hunt();
            threeSoldier[2].hunt();

        }catch(SoundException dot){
            System.out.println("Oh no!...");
            dot.printStackTrace();//this is optional ,if we want to print additional msg we can use this method
        }
    }//end main function
}//end MainApp class
