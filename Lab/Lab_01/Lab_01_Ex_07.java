package Lab_01;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :4.15PM;
 * @since :2021.09.07;
 **/
import java.util.Scanner;
public class Lab_01_Ex_07 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num1 = a.nextInt();

        System.out.print("Enter Number 2:");
        int num2 = a.nextInt();

        int sum = num1 + num2;
        int average = sum / 2;

        System.out.println("Sum :" + sum + "\n");
        System.out.println("Average :" + average + "\n");
    }
}


