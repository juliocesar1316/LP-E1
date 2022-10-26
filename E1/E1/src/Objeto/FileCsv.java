package Objeto;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class FileCsv {
	public void File(ArrayList<String> capa) {
        try (PrintWriter writer = new PrintWriter(new File("capacete.csv"))) {

            writer.write("Marca,");
            writer.write("Material,");
            writer.write("Cor,");
            writer.write("Proteção,");
            writer.println("Preço");
            
            int i = 0;
            for (String dado : capa) {
            	if(i % 5 == 0){
            		writer.println();
            	}
            	writer.write(dado + ",");
                i++;
            };
            
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
	}
}