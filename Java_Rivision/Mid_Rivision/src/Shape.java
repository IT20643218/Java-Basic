import java.awt.*;

/**
 * @author :B.M.S.L.Bandaranayaka <sumedhalakmal95@gmail.com>
 * @Time :8.40AM;
 * @since :2020.09.02;
 **/
public class Shape {
    private String colour;

    public Shape(String colour){
        System.out.println("Shape");
        this.colour=colour;
    }
    public static void main(String[] args){
        new Rectangle();
    }
}

