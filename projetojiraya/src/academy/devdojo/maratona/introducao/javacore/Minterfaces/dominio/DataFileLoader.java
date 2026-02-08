package academy.devdojo.maratona.introducao.javacore.Minterfaces.dominio;

public class DataFileLoader implements Dataloader, RemoveData{
    @Override
    public void Load() {
        System.out.println("carregando dados de um arquivo");
    }
    @Override
    public void remove(){
        System.out.println("removendo dados dos arquivos");
    }
    @Override
    public void checkingData(){
        System.out.println("Checando dos arquivos");
    }
}
