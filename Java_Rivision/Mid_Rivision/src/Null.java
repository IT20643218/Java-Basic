/**
 * @author :B.M.S.L.Bandaranayaka <sumedhalakmal95@gmail.com>
 * @Time :9.34AM;
 * @since :2021.09.02;
 **/
public class Null {

        public  static void main(String[] args){
            try{
                try{
                  int value = 10/0;
                }catch (ArithmeticException e){
                    System.out.println("ArithmeticException");
                }finally {
                    System.out.println("Inner finally");
                    int marks[]=new int[]{10};
                    int value = marks[1];
                }
            }catch (NumberFormatException e){
                System.out.println("NumberFormatException");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }finally {
                System.out.println("Outer finally");
            }
        }







}
