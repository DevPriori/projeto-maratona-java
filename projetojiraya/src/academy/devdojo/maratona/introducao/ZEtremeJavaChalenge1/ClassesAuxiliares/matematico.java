package academy.devdojo.maratona.introducao.ZEtremeJavaChalenge1.ClassesAuxiliares;

public class matematico {

    public void multiplicador(int a, int b){
        System.out.println(a*b);
    }
    public void allContas(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    public void tabuada(int a){
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + "x" +i +"= "+ a*i);
        }
    }
    public void java1(){
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public void trocarVariaveis(int a,int b){
        int c =0;
        c =a;
        a = b;
        b = c;
        System.out.println("a: "+ a+ " b: "+ b);
    }
}
