package Lab_01;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :3.55PM;
 * @since :2021.09.07;
 **/

import java.util.Scanner;
public class Lab_01_Ex_04 {
        public static void main(String[] args){
            Scanner a=new Scanner(System.in);
            System.out.print("Please Enter your Day Number :");
            int days=a.nextInt();

            System.out.print("=======================\n");
            String day;
            System.out.println("Value of the day:"+days);

            switch(days){
                case 1:day="Monday";
                    break;
                case 2:day="Tuesday";
                    break;
                case 3:day="Wednesday";
                    break;
                case 4:day="Thurseday";
                    break;
                case 5:day="Friday";
                    break;
                case 6:day="Satauday";
                    break;
                case 7:day="Sunday";
                    break;
                default:day="Invalid Day";
                    break;
            }
            System.out.println("Day of the week :"+day);
            System.out.println("Good Bye!");
        }
}
