/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;


/**
 *
 * @author Spectre
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEjecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReSintactico = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnArchivo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSemantic = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEjecutar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        txtResultado.setEnabled(false);
        jScrollPane1.setViewportView(txtResultado);

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar Log");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Entrada:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Salida:");

        jLabel3.setText("Analizador Lexico Henry Valmes");

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane2.setViewportView(txtEntrada);

        txtReSintactico.setEditable(false);
        txtReSintactico.setColumns(20);
        txtReSintactico.setRows(5);
        jScrollPane3.setViewportView(txtReSintactico);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Analisis Sintactico:");

        btnArchivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnArchivo.setText("Abrir Archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        txtSemantic.setColumns(20);
        txtSemantic.setRows(5);
        txtSemantic.setEnabled(false);
        jScrollPane4.setViewportView(txtSemantic);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Analisis Semantico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane3))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(btnArchivo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEjecutar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEjecutar)
                        .addComponent(btnLimpiar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizadorSintactico() throws Exception{
        String SA = txtEntrada.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(SA)));
        
        try{
            s.parse();
            txtReSintactico.setText("0 Errores, codigo correcto!");
            txtReSintactico.setForeground(new Color(25, 111, 61));
            
        }catch (Exception ex) {
            Symbol sym = s.getS();
            txtReSintactico.setText("Error de sintaxis. Linea " + (sym.right + 1) + "\t" + "Columna: " + (sym.left + 1) + "\t" + ", en: \"" + sym.value + "\"");
            txtReSintactico.setForeground(Color.red);            
            } 
    }
    private void analizadorLexico() throws IOException{
        int count = 1;       
        String expr = (String) txtEntrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "Linea "+ count +"\t\tSIMBOLO\n";
        while(true){
            Tokens token = lexer.yylex();
            if(token == null){
                txtResultado.setText(resultado);
                return;
            }
            switch (token){
                case Linea:
                    count++;
                    resultado += "Linea "+ count +"\n";
                    break;
                case Int:
                    resultado += "<Reservada int>\t"+ lexer.lexeme +"\n";
                    break;
                case If:
                    resultado += "<Reservada if>\t"+ lexer.lexeme +"\n";
                    break;
                case Else:
                    resultado += "<Reservada else>\t"+ lexer.lexeme +"\n";
                    break;
                case While:
                    resultado += "<Reservada while>\t"+ lexer.lexeme +"\n";
                    break;
                case Igual:
                    resultado += "<Operador igual>\t"+ lexer.lexeme +"\n";
                    break;
                case Suma:
                    resultado += "<Operador suma>\t"+ lexer.lexeme +"\n";
                    break;
                case Resta:
                    resultado += "<Operador Resta>\t"+ lexer.lexeme +"\n";
                    break;
                case Multiplicacion:
                    resultado += "<Operador multiplicacion>\t"+ lexer.lexeme +"\n";
                    break; 
                case Division:
                    resultado += "<Operador Division>\t"+ lexer.lexeme +"\n";
                    break;
                case Parentesis_a:
                    resultado += "<Parentesis Apertura>\t"+ lexer.lexeme +"\n";
                    break;
                case Parentesis_c:
                    resultado += "<Parentesis Cierre>\t"+ lexer.lexeme +"\n";
                    break;
                case Llave_a:
                    resultado += "<Llave Apertura>\t"+ lexer.lexeme +"\n";
                    break;
                case Llave_c:
                    resultado += "<Llave Cierre>\t"+ lexer.lexeme +"\n";
                    break;  
                case P_coma:
                    resultado += "<Punto y Coma>\t"+ lexer.lexeme +"\n";
                    break;    
                case Main:
                    resultado += "<Reservada main>\t"+ lexer.lexeme +"\n";
                    break;  
                case Identificador:
                    resultado += "<Identificador>\t\t"+ lexer.lexeme +"\n";
                    break;
                case Numero:
                    resultado += "<Numero>\t\t" + lexer.lexeme +"\n";
                    break;
                case ERROR:
                    resultado += "<Simbolo no definido>\n";
                    break;
                default:
                    resultado += "<" + lexer.lexeme + ">\n";
                    break;
            }
        }
    }    
    //Analisis semantico
    private void realizarAnalisisSemantico(Map<String, String> tablaSimbolos, List<String> instrucciones, JTextArea txtSemantic) {
        StringBuilder erroresSemanticos = new StringBuilder();

        for (String instruccion : instrucciones) {
            instruccion = instruccion.trim();

            // Ignorar llaves de apertura y cierre
            if (instruccion.equals("{") || instruccion.equals("}")) {
                continue; // Saltar a la siguiente instrucción si es una llave
            }

            System.out.println("Procesando instrucción: " + instruccion); // Debug para ver la instrucción
            if (instruccion.startsWith("int ")) { // Ejemplo para tipo de declaración, ajusta según el formato de tus instrucciones
                verificarDeclaracion(instruccion, tablaSimbolos, erroresSemanticos);
            } else if (instruccion.contains("=")) { // Ejemplo para asignación
                verificarAsignacion(instruccion, tablaSimbolos, erroresSemanticos);
            } else {
                verificarUso(instruccion, tablaSimbolos, erroresSemanticos);
            }
        }

        // Mostrar los errores en el JTextArea
        if (erroresSemanticos.length() > 0) {
            txtSemantic.setText(erroresSemanticos.toString());
        } else {
            txtSemantic.setText("Análisis semántico completado sin errores.");
        }
    }

    // Métodos de verificación modificados
    private void verificarDeclaracion(String instruccion, Map<String, String> tablaSimbolos, StringBuilder erroresSemanticos) {
        String[] partes = instruccion.split(" ");
        if (partes.length < 2) {
            erroresSemanticos.append("Error de sintaxis en declaración: ").append(instruccion).append("\n");
            return;
        }
        String nombreVariable = partes[1].replace(";", "").trim();

        if (tablaSimbolos.containsKey(nombreVariable)) {
            erroresSemanticos.append("Error: La variable '").append(nombreVariable).append("' ya está declarada.\n");
        } else {
            tablaSimbolos.put(nombreVariable, "int"); // Suponiendo tipo int, ajusta según tu lógica
        }
    }

    private void verificarUso(String instruccion, Map<String, String> tablaSimbolos, StringBuilder erroresSemanticos) {
        String nombreVariable = instruccion.replace(";", "").trim();

        if (!tablaSimbolos.containsKey(nombreVariable)) {
            erroresSemanticos.append("Error: La variable '").append(nombreVariable).append("' no está declarada.\n");
        }
    }

    private void verificarAsignacion(String instruccion, Map<String, String> tablaSimbolos, StringBuilder erroresSemanticos) {
        String[] partes = instruccion.split("=");
        if (partes.length < 2) {
            erroresSemanticos.append("Error de sintaxis en asignación: ").append(instruccion).append("\n");
            return;
        }

        String nombreVariable = partes[0].trim();
        if (!tablaSimbolos.containsKey(nombreVariable)) {
            erroresSemanticos.append("Error: La variable '").append(nombreVariable).append("' no está declarada antes de asignarse.\n");
        }
    }

    private void extraerInstrucciones(List<String> instrucciones) {
        String[] lineas = txtEntrada.getText().split("\n");
        instrucciones.clear();
        for (String linea : lineas) {
            if (!linea.trim().isEmpty()) { // Omitir líneas vacías
                instrucciones.add(linea.trim());
                System.out.println("Extrajo Instrucción: " + linea.trim());
            }
        }
    }
    
    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
       try {
            analizadorLexico();
            analizadorSintactico();            
            // Inicializa tabla de símbolos e instrucciones para el análisis semántico
            Map<String, String> tablaSimbolos = new HashMap<>();
            List<String> instrucciones = new ArrayList<>();
            // Extrae las instrucciones desde el análisis léxico y sintáctico
            extraerInstrucciones(instrucciones);            
            // Realiza el análisis semántico
            realizarAnalisisSemantico(tablaSimbolos, instrucciones, txtSemantic);            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        //txtResultado.setText("");
        txtReSintactico.setText("");
        txtSemantic.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try{
            
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtEntrada.setText(ST);
            
        }catch (FileNotFoundException ex) {
            
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtReSintactico;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtSemantic;
    // End of variables declaration//GEN-END:variables
}
