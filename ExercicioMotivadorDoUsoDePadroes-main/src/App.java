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
        Esportivo mustang = new Esportivo();
        mustang.abastece(TipoCombustivel.GASOLINA,45);    
        mustang.viaja(90);
        System.out.println(mustang.toString());
        */

        
        Utilitario saveiro = new Utilitario();
        saveiro.abastece(TipoCombustivel.DIESEL, 70);
        saveiro.viaja(125);
        System.out.println(saveiro.toString());

    }

    

}
