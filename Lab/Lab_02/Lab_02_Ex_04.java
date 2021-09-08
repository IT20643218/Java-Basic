package Lab_02;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :12.34AM;
 * @since :2021.09.08;
 **/
//InputStreamReader and BufferedReader

import java.io.*;//add java libraries

public class Lab_02_Ex_04 {
//Buffer reader class


        public static void main(String[] args)throws IOException{//to heddie run time error

            int height, width, length, volume;

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader (isr);

            System.out.print("Enter length of cube: ");
            length = Integer.parseInt(in.readLine());

            System.out.print("Enter height of cube: ");
            height = Integer.parseInt(in.readLine());

            System.out.print("Enter width of cube: ");
            width = Integer.parseInt(in.readLine());

            volume = length* height* width;

            System.out.println("==========================");
            System.out.println("Volume of cube: "+ volume);
        }


}
