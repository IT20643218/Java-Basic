package Lab_02;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :12.31AM;
 * @since :2021.09.08;
 **/

//Scanner class
import java.util.Scanner;//add java libraries
public class Lab_02_Ex_03 {

        public static void main(String[] args){

            int height, width, length, volume;
            Scanner sc = new Scanner (System.in);

            System.out.print("Enter length of cube: ");
            length=sc.nextInt();

            System.out.print("Enter height of cube: ");
            height=sc.nextInt();

            System.out.print("Enter width of cube: ");
            width=sc.nextInt();

            volume = length* height* width;

            System.out.println("==========================");
            System.out.println("Volume of cube: "+ volume);
        }
}
