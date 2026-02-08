package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste02;

import java.util.ArrayList;

public class Empresa {

    String name;
    int capital;
    Funcionario funcionario;
    bancoDeTalentos bancoDeTalentos;

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<bancoDeTalentos> bancoDeTalentos1 = new ArrayList<>();

    public Empresa(String name, int capital) {
        this.name = name;
        this.capital = capital;
    }

    public void imprimir(){
            System.out.println(funcionarios);
    }

    public void contratar(bancoDeTalentos bancoDeTalentos){
        if(bancoDeTalentos==null)return;
        if(funcionarios.add(bancoDeTalentos)){
            System.out.println("Funcionario contratado "+ bancoDeTalentos.getNome());
        }else {
            System.out.println("Banco de talentos " + getName() + "não encontrado");
        }
        }

    public void demitir(Funcionario funcionario){
        if(funcionario==null)return;
        if(funcionarios.remove(funcionario)){
            System.out.println("Funcionario removido: "+ funcionario.getName());
        }else{
        System.out.println("funcionario não encontrado : "+ getName() );
        }

    }
    public void alterar(int id, String newName, String newSetor){

            for (Funcionario f : funcionarios) {
                if(id== f.getId()){
                    String nomeAntigo = f.getName();
                    f.setName(newName);
                    f.setSetor(newSetor);
                    System.out.println(" funcionario "+ nomeAntigo+ " alterado para "+ newName);
                }
            }
        }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
