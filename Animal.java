package heranca;

public class Animal{
    String Nome;
    int Idade;
    String Genero;
    int Peso;
    String Cor;
    String Tutor;

    public void setNome(String nome){
        Nome = nome;
    }
    public String getNome(){
        return Nome;
    }

    public void setIdade(int idade){
        Idade = idade;
    }
    public int getIdade(){
        return Idade;
    }

    public void setGenero(String genero){
        Genero = genero;
    }
    public String getGenero(){
        return Genero;
    }

    public void setPeso(int peso){
        Peso = peso;
    }
    public int getPeso(){
        return Peso;
    }

    public void setCor(String cor){
        Cor = cor;
    }
    public String getCor(){
        return Cor;
    }

    public void setTutor(String tutor){
        Tutor = tutor;
    }
    public String getTutor(){
        return Tutor;
    }

    public void exibirDados(){
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Gênero: " + Genero);
        System.out.println("Peso: " + Peso);
        System.out.println("Cor: " + Cor);
        System.out.println("Tutor: " + Tutor);
    }

    
}

