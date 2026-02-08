package academy.devdojo.maratona.introducao.javacore.Minterfaces.dominio;

public class DataBaseLoader implements Dataloader, RemoveData{
    @Override
    public void Load(){
        System.out.println("carregando dados de um banco de dados");
    }
    @Override
    public void remove(){
        System.out.println("removendo dados do banco de dados");
    }
    @Override
    public void checkingData(){
        System.out.println("checando dados do banco");
    }
}
