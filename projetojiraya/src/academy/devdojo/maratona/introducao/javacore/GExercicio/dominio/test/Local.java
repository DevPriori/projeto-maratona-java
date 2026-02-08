package academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test;

public class Local {
    private String endereco;

    public Local(String endereco){
        this.endereco = endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
}