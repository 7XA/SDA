package temeSDA;

public class Main {

    public static void main(String[] args) {
        try {
            Adress adresaIon = new Adress(211, "Zambilelor", "Brasov");
            Adress adresaTeo = new Adress(7, "Smecheriei", "Tandarei");
            PaymentMethod plataIon = new PaymentMethod("Camile");
            PaymentMethod plataTeo = new PaymentMethod("Protectie");
            Customer Ion = new Customer(21, "Popescu", "Ion", adresaIon, plataIon);
            Customer Teo = new Customer(27, "Mercedes", "Teodor", adresaTeo, plataTeo);

            System.out.println(Teo.getNumeComplet());
            System.out.println(Ion.getMetodaDePlata());
            System.out.println(Teo.getAdresa());
            System.out.println(Ion);
            System.out.println(Teo);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Un argument introdus este invalid");
        }
        catch(Exception e)
        {
            System.out.println("Ceva nu a mers bine");
        }
    }
}
