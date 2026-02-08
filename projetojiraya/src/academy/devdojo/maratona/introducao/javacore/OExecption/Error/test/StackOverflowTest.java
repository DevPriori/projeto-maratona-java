package academy.devdojo.maratona.introducao.javacore.OExecption.Error.test;

//testando o erro de StackOverFlow utilizando toda a memoria

public class StackOverflowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
