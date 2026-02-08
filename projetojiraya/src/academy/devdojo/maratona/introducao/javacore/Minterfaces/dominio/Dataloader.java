package academy.devdojo.maratona.introducao.javacore.Minterfaces.dominio;

public interface Dataloader {
    void Load();

    default void checkingData(){
        System.out.println("checagem de dados");
    }
}
