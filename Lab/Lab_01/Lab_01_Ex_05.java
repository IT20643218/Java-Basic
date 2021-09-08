package Lab_01;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :4.00PM;
 * @since :2021.09.07;
 **/
import java.util.Scanner;
public class Lab_01_Ex_05 {
        public static void main(String[] args){
            Scanner b=new Scanner(System.in);
            System.out.print("Please Enter Number of Asterisks you want:");
            int num=b.nextInt();

            System.out.print("=======================\n");

            for(int i=1;i<=num;i++){
                for(int j=1;j<=num;j++)
                {
                    System.out.print("*");
                }
                System.out.println("\n");
            }

        }
}
