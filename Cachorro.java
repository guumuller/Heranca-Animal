package heranca;
import java.util.Scanner;

public class Cachorro extends Animal{
    String Raca;
    String Pelo;

    public void setRaca(String raca){
        Raca = raca;
    }
    public String getRaca(){
        return Raca;
    }

    public void setPelo(String pelo){
        Pelo = pelo;
    }
    public String getPelo(){
        return Pelo;
    }

    public void exibirDadosCachorro(){
        System.out.println("Raca: " + Raca);
        System.out.println("Pelo: " + Pelo);
    }

    public void salvarCachorro(){
            Scanner input = new Scanner(System.in);
            System.out.println("Informe a raça do cachorro: ");
            setRaca( input.next());
            System.out.println("Informe a cor do pelo do cachorro: ");
            setCor( input.next());
            System.out.println("Informe nome do cachorro: ");
            setNome( input.next());
            System.out.println("Informe a idade do cachorro: ");
            setIdade( input.nextInt());
            System.out.println("Informe o peso do cachorro: ");
            setPeso( input.nextInt());
            System.out.println("Informe o nome do tutor do cachorro: ");
            setTutor( input.next());
            System.out.println("Informe o gênero do cachorro: ");
            setGenero( input.next());
            System.out.println("Informe o pelo do cachorro: ");
            setPelo( input.next());
    }
}