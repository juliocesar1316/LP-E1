package Objeto;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class FileCsv {
	public void File(String modelo, String mat, String corCapa, String prot, double valor) {
        try (PrintWriter writer = new PrintWriter(new File("capacete.csv"))) {

            writer.write("Marca, ");
            writer.write("Material, ");
            writer.write("Cor, ");
            writer.write("Proteção, ");
            writer.println("Preço ");
            
            writer.write(modelo + ", ");
            writer.write(mat + ", ");
            writer.write(corCapa + ", ");
            writer.write(prot + ", ");
            writer.println(valor);
        
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
	}
}