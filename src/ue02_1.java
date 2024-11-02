import libraries.Out;
import libraries.In;
public class ue02_1 {
    public static void main(String[] args) {
        
System.out.print("Geben Sie drei Ganze Zahlen ein: ");

int a = In.readInt();
int b = In.readInt();
int c = In.readInt();


if (a>b && a>c) {
    System.out.print(a);
}
else if (c>a && c>b){

    System.out.print(c);
}

else if (b>a && b>c){
    System.out.print(b);
}
System.out.print(" ist die größte Zahl.");
}}



