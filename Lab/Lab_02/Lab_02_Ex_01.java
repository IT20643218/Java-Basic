package Lab_02;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :8.15PM;
 * @since :2021.09.07;
 **/
public class Lab_02_Ex_01 {
    public static void main(String[] args){

        int miles =26,yards =385;
        double kilometers;

        kilometers = (miles * 1.609) + (yards * (1.609 / 1760.0));

        System.out.println("Number of kilometers are:"+kilometers);
    }
}
