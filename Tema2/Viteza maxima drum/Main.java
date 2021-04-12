package temeSDA;
import java.util.Scanner;
import java.lang.String;

public class Main {

    static int vitezaDrum1(String s)
    {
        if(s.toLowerCase().equals("zona rezidentiala"))
            return 30;
        else
        if(s.toLowerCase().equals("oras"))
            return 50;
        else
        if(s.toLowerCase().equals("drum express"))
            return 100;
        else
        if(s.toLowerCase().equals("autostrada"))
            return 130;
        else
            return 0;
    }

    static int vitezaDrum2(String s)
    {
        if(s.toLowerCase().equals("zona rezidentiala"))
            return 30;
        else {
            if(s.toLowerCase().equals("oras"))
                return 50;
            else {
                if(s.toLowerCase().equals("drum express"))
                    return 100;
                else {
                    if(s.toLowerCase().equals("autostrada"))
                        return 130;
                    else
                        return 0;
                }
            }
        }
    }

    static int vitezaDrum3(String s)
    {
        int viteza;
        switch(s.toLowerCase()) {
            case "zona rezidentiala":
                viteza = 30;
            break;
            case "oras":
                viteza = 50;
            break;
            case "drum express":
                viteza = 100;
            break;
            case "autostrada":
                viteza = 130;
            break;
            default:
                viteza = 0;
        }
        return viteza;
    }

    public static void main(String[] args) {
        String tipDrum;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Introduceti tipul de drum: ");
        tipDrum = stdin.nextLine();
        System.out.println("Viteza cu prima functie: " + vitezaDrum1(tipDrum));
        System.out.println("Viteza cu a doua functie: " + vitezaDrum2(tipDrum));
        System.out.println("Viteza cu a treia functie: " + vitezaDrum3(tipDrum));

    }
}


