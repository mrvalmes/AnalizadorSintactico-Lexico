/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/Spectre/Documents/Analizador/AnalizadorSintactico-Lexico/src/codigo/Lexer.flex";
        String ruta2 = "C:/Users/Spectre/Documents/Analizador/AnalizadorSintactico-Lexico/src/codigo/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "C:/Users/Spectre/Documents/Analizador/AnalizadorSintactico-Lexico/src/codigo/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo;
        
        // Generar archivo léxico con JFlex
        archivo = new File(ruta1);
        System.out.println("Generando Lexer desde: " + ruta1);
        JFlex.Main.generate(archivo);
        
        archivo = new File(ruta2);
        System.out.println("Generando LexerCup desde: " + ruta2);
        JFlex.Main.generate(archivo);
        
        // Generar archivo de sintaxis con CUP
        System.out.println("Generando Sintax con CUP desde: " + rutaS[2]);
        java_cup.Main.main(rutaS);
        
        // Mover sym.java a la carpeta correcta
        Path rutaSym = Paths.get("C:/Users/Spectre/Documents/Analizador/AnalizadorSintactico-Lexico/src/codigo/sym.java");
        if (Files.exists(rutaSym)) {
            System.out.println("Eliminando archivo existente: " + rutaSym);
            Files.delete(rutaSym);
        }
        Files.move(
            Paths.get("C:/Users/Spectre/Documents/Analizador/AnalizadorSintactico-Lexico/sym.java"),
            rutaSym
        );
        System.out.println("sym.java movido correctamente.");
        
        // Mover Sintax.java a la carpeta correcta
        Path rutaSin = Paths.get("C:/Users/Spectre/Documents/Analizador/AnalizadorSintactico-Lexico/src/codigo/Sintax.java");
        if (Files.exists(rutaSin)) {
            System.out.println("Eliminando archivo existente: " + rutaSin);
            Files.delete(rutaSin);
        }
        Files.move(
            Paths.get("C:/Users/Spectre/Documents/Analizador/AnalizadorSintactico-Lexico/Sintax.java"),
            rutaSin
        );
        System.out.println("Sintax.java movido correctamente.");
    }
}

