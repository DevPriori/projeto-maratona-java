package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio;

public class Carro {
   public int ano;
   public String modelo;
   public float valor;

   public void imprimeCarro(){
       System.out.println(this.ano);
       System.out.println(this.modelo);
       System.out.println(this.valor);
   }
}
