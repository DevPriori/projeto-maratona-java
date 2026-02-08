package academy.devdojo.maratona.introducao.javacore.EintroducaoBlocosDeInicializacao.Dominio;

public class Anime {
  private  String nome;
  private  int[] episodios;

    {
        System.out.println("Dreto do bloco de init");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios [i] = i+1;
        }
    }

  public Anime(String nome){
      this.nome = nome;
  }

  public Anime(){

      for (int episodio = 0; episodio < episodios.length; episodio++) {
          System.out.print(episodio + " ");
      }
  }

  public int [] getEpisodios(){
    return episodios;
  }


  public String getNome(){
      return nome;
  }



}
