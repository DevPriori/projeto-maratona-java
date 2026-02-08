package academy.devdojo.maratona.introducao.javacore.Uresoucebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResouseBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("fuck_you"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle2.getString("ola"));
        System.out.println(bundle2.getString("foda_se"));

    }
}
