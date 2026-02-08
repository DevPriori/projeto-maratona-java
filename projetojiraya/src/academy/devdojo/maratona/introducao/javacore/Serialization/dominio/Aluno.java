package academy.devdojo.maratona.introducao.javacore.Serialization.dominio;


public class Aluno {
    private Long id;
    private String nome;
    private String password;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
}
