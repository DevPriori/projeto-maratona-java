package academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test;

public class Seminario {
    private String titulo;
    private Aluno [] aluno;
    private Local local;

    public Seminario(String titulo, Local local){
        this.aluno = getAluno();
        this.local = getLocal();
    }

    public Seminario(String titulo, Aluno [] aluno, Local local){
        this.aluno = aluno;
        this.titulo = titulo;
        this.local = local;
    }

    public void setLocal(Local local){
        this.local = local;
    }
    public Local getLocal(){
        return this.local;
    }

    public void setAluno(Aluno [] aluno){
        this.aluno = aluno;
    }
    public Aluno[] getAluno(){
        return this.aluno;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
