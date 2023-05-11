/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploescrituratexto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Pablo
 */
public class EjemploEscrituraTexto {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try 
        {
            fichero = new FileWriter("prueba.txt");
            pw = new PrintWriter(fichero);
            
            for (int i = 0; i < 10; i++) 
            {
                pw.println("Línea " + i);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error leyendo el fichero: " + e.toString());
        } 
        finally 
        {
            try 
            {
                pw.close();
                fichero.close();
            } 
            catch (IOException e2) 
            {
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }
    }

}
