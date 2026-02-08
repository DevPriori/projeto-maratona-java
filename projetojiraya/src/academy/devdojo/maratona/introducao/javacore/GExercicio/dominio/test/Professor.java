package academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test;

public class Professor {
    private String nome;
    private String materia;
    private Seminario [] seminarios;
    private Aluno [] aluno;

    public Professor(String nome, String materia){
        this.nome = nome;
        this.materia = materia;
    }

    public Professor(String nome, String materia, Seminario[] seminarios){
        this.nome = nome;
        this.seminarios = seminarios;
        this.materia = materia;
    }

    public void imprime(){
        System.out.println(getNome());
        System.out.println("##### cadastro concluido #####");
        System.out.println(getMateria());

        if(seminarios == null) return;

            for (Seminario seminario : seminarios) {
                System.out.println(seminario.getTitulo());
                System.out.println(seminario.getLocal().getEndereco());
                if (seminario.getAluno() == null) continue;
                System.out.println("ALUNOSSSS");
                for (Aluno aluno1 : seminario.getAluno()) {
                    System.out.println(aluno1.getNome());
                    System.out.println(aluno1.getIdade());
                }
            }
    }

    public void setSeminarios(Seminario [] seminarios){
        this.seminarios = seminarios;
    }
    public Seminario[] getSeminario(){
        for(Seminario seminario : seminarios){
            System.out.println(seminario.getTitulo());
        }

        return this.seminarios;
    }
    public void setAluno(Aluno[] aluno){
        this.aluno = aluno;
    }
    public Aluno []getAluno(){
        return this.aluno;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return this.materia;
    }
}
