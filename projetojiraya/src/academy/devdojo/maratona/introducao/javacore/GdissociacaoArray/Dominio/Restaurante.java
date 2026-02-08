package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio;

public class Restaurante {
    private String nome;
    private Entregadores [] entregadores;


    public Restaurante(String nome){
        this.nome = nome;
    }
    public Restaurante(String nome, Entregadores [] entregadores){
        this.nome = nome;
        this.entregadores = entregadores;
    }

    public void imprime(){
        System.out.println(this.getNome());

        if (entregadores == null) return;
       for(Entregadores entregadores1 : entregadores){
           System.out.println(entregadores1.getNome());
           System.out.println(entregadores1.getTurno());
       }

    }

    public String getRestaurante(){
        return this.nome;
    }
    public void setRestaurante(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
