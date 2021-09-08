package Lab_01;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :3.52PM;
 * @since :2021.09.07;
 **/
import java.util.Scanner;

public class Lab_01_Ex_03 {

        public static void main(String[] args){
            Scanner ob=new Scanner(System.in);
            System.out.print("Please Enter your age :");//keyboard input

            int age = ob.nextInt();
            if (age >18){
                System.out.println("Adult");
            }else{
                System.out.println("Child");
            }
        }
}
