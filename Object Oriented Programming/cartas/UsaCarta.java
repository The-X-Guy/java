import java.util.Scanner;
class UsaCarta { 
    public static void main(String[] args) {
        Baraja original = new Baraja();
        Baraja baraja = new Baraja();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Juego de cartas.");
            System.out.println("----------------");
            String[] menu = {
                "0. Salir.",
                "1. Mostrar baraja.",
                "2. Barajar.",
                "3. Repartir una carta."
            };
            for (int i = 0; i < menu.length; i++)
                System.out.println(menu[i]);

            System.out.print("Escoge una opcion:");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    baraja = new Baraja();
                    original = baraja;
                    System.out.println(original);
                    break;
                case 2:
                    baraja.barajar();
                    System.out.println(baraja);
                    break;
                case 3:
                    System.out.println(baraja.repartirCartas());
                    break;
                    
            }
            sc.close();
            
            // Baraja baraja= new Baraja();
            // Baraja original = baraja;
            // System.out.println("Mazo original y ordenado.");
            // System.out.println("-------------------------");
            // System.out.println(original);
            // baraja.barajar();
            
            // System.out.println("Mazo barajado.");
            // System.out.println("--------------");
            // System.out.println(baraja);

            // System.out.println(baraja.repartirCartas());
        }
        
        
    }
}