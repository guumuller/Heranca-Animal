package heranca;

public class Gato extends Animal{
    String Raca;
    String Pelo;
    String Porte;

    public void setRaca(String raca){
        Raca = raca;
    }
    public String getTurma(){
        return Raca;
    }

    public void setPelo(String pelo){
        Pelo = pelo;
    }
    public String getPelo(){
        return Pelo;
    }

    public void setPorte(String porte){
        Porte = porte;
    }
    public String getPorte(){
        return Porte;
    }

    public void exibirDadosGato(){
        System.out.println("Raca: " + Raca);
        System.out.println("Pelo: " + Pelo);
        System.out.println("Porte: " + Porte);
    }
}