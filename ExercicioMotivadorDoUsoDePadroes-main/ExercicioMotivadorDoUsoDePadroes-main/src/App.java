public class App {
    public static void main(String[] args) throws Exception {

        /* Básico
        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);
        */

        /* Esportivo
        Esportivo corvette = new Esportivo();
        corvette.abastece(TipoCombustivel.GASOLINA, 45);
        corvette.viaja(60);
        System.out.print(corvette.toString() + "\n");
        */

        /* Utilitário 
        Utilitario hilux = new Utilitario();
        hilux.abastece(TipoCombustivel.DIESEL,70);
        hilux.viaja(150);
        System.out.println(hilux.toString());
        */

        Suv compass = new Suv();
        compass.abastece(TipoCombustivel.DIESEL, 25);
        compass.abastece(TipoCombustivel.GASOLINA, 30);
        compass.viaja(120);
        System.out.print(compass.toString());

        
    }
}
