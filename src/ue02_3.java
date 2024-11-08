import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {
        System.out.println("X-Koordinate:");
        double x = In.readDouble();
        System.out.println("Y-Koordinate:");
        double y = In.readDouble();

        int r = 4;
        
        
        if (x<0 || x>r || y<0 || y>r) {
            System.out.println("Punkt liegt außerhalb des Quadrats");
        }

        else {
            double d = Math.sqrt (x*x + y*y);
            if (d>r) {

                    System.out.println("Punkt liegt in der grünen Fläche");
                }
            else {
                System.out.println("Punkt liegt nicht in der grünen Fläche");
            }
            }
    }
}

