package academy.devdojo.maratona.introducao.javacore.Jmodifcadorfinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString(){
       return "Nome =" + this.nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
