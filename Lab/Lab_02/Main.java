package Lab_02;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :10.37AM;
 * @since :2021.09.08;
 **/
public class Main {
        public static void main (String[]args){
            Lab_02_Ex_05 num = new Lab_02_Ex_05();

            boolean result = num.findEvaenOrOddNumber(5);

            if (result==true){
                System.out.println("This is an even number");
            }else{
                System.out.println("This is an odd number");
            }

        }
}
