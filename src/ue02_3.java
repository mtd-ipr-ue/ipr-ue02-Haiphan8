import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {
    
        int x = In.readInt();
        int y = In.readInt();

        int r = 4;
        if (Math.sqrt (x*x + y*y) > r && x <= r && y <= r) {
            System.out.print("Punkt ist in der grünen Fläche");
    }
}
}
