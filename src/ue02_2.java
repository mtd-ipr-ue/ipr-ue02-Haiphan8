import libraries.Out;
import libraries.In;
public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Geben Sie eine Jahreszahl und einen Monatswert zwischen 1 und 12 an:");
    
int year = In.readInt();


if (year < 0 || year > 2200) {
    System.out.println("Jahreszahl ist  nicht sinnvoll");
}
else {
int month = In.readInt();
switch (month)
    {case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    System.out.println("31");
    break;

    case 4: case 6: case 9: case 11:
    System.out.print("30");
    break;


    case 2:
        
        if (year%4 != 0 || year%100 == 0 && year%400 != 0 ) {
            System.out.println("28");
        }
        else {
            System.out.println("29");
        }
        break;

    default: 
            System.out.println("Kein gültiger Monat angegeben");
}

}
    

}

}
    
