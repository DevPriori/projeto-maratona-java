package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio;

public class Entregadores {
    private String nome;
    private String turno;
    private Restaurante restaurante;

    public Entregadores(String nome, String turno){
        this.nome = nome;
        this.turno = turno;

    }

    public Entregadores(String nome, String turno, Restaurante restaurante){
        this.nome = nome;
        this.turno = turno;
        this.restaurante = restaurante;
    }

    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getTurno());
        System.out.println(this.getRestaurante());
    }

    public Restaurante getRestaurante(){
        return this.restaurante;
    }
    public void setRestaurante(Restaurante restaurante){
        this.restaurante = restaurante;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTurno(){
        return turno;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
}
