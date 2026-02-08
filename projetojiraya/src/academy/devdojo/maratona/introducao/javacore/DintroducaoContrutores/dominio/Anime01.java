package academy.devdojo.maratona.introducao.javacore.DintroducaoContrutores.dominio;

public class Anime01 {
    private String tipo;
    private int episodios;
    private String nome;
    private String protagonista;

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.protagonista);
    }

    public void init(int episodios, String nome, String tipo){
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public void init(String protagonista, int episodios, String nome, String tipo){
        this.init(episodios, nome, tipo);
        this.protagonista = protagonista;
    }



    public int getEpisodios(){
        return episodios;
    }

    public void setEpisodios(int episodios){
     this.episodios = episodios;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
      this.tipo = tipo;
    }
}
