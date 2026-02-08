package academy.devdojo.maratona.introducao.javacore.Minterfaces.test;

import academy.devdojo.maratona.introducao.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratona.introducao.javacore.Minterfaces.dominio.DataFileLoader;

public class Interfacetest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        DataFileLoader dataFileLoader = new DataFileLoader();

        dataFileLoader.Load();
        dataBaseLoader.Load();

        dataFileLoader.remove();
        dataBaseLoader.remove();

        dataFileLoader.checkingData();
        dataBaseLoader.checkingData();
    }
}
