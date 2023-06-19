package heranca;

public class Aplicacao{

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.salvarCachorro();
        cachorro.exibirDados();
        cachorro.exibirDadosCachorro();    
    }

   // public static void main(String[] args) {
   //     Gato gato = new Gato();
   //     gato.setRaca("Persa");
   //     gato.setPelo("Preto");
   //     gato.setPorte("Médio");
        
   //     gato.exibirDados();
   //     gato.exibirDadosGato();  
   // }
}