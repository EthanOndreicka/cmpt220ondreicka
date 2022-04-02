// Ethan Ondreicka // Professor Arias // March 31 //
import java.util.Scanner;
public class Problem3 {
    public static Point getCenterPoint(Point p1, Point p2, Point p3){
        
        Point p = new Point();
        double x = (p1.getP1() + p2.getP1() + p3.getP1()) / 3;
        double y = (p1.getP2() + p2.getP2() + p3.getP2()) / 3;
        
        p.setP1(x);
        p.setP2(y);
        return p;
    }
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter x1 and y1");
        p1.setP1(input.nextDouble());
        p1.setP2(input.nextDouble());
        
        System.out.println("Enter x2 and y2");
        p2.setP1(input.nextDouble());
        p2.setP2(input.nextDouble());
        
        System.out.println("Enter x3 and y3");
        p3.setP1(input.nextDouble());
        p3.setP2(input.nextDouble());
        
        p4 = getCenterPoint(p1, p2, p3);
        System.out.println("The center point is at (" + p4.getP1() + ", " + p4.getP2());
        input.close();
    }

}

