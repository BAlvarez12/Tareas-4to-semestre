/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

//Controla los eventos del teclado
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import javax.swing.JFrame;

//Maneja la reproduccion de sonido en la computadora
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

//Crear un archivo txt
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Bomiki
 * 

 */


public class Cal extends javax.swing.JFrame {

    public float primernumero;
    public float segundonumero;
    public String operador;
    public String resu;
    
    
    public String sincero(float resultado){
        String retorno="";
        
        retorno=Float.toString(resultado);
        
        if(resultado%1==0){ 
            retorno=retorno.substring(0, retorno.length()-2);
        
        }  //retorna el resultado dado en entero si este tiene decimales en 0
        resu = retorno; //retorna el resultado en la variable resu
        return retorno; //retorna el resultado de la clase sincero
    }
    
    /**
     * Creates new form Cal
     * @param numeros
     */
   public void bitacora(String numeros){
        String filePath = "bitacoraCalculadora.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
        writer.write(numeros);
        writer.newLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
   
    
    private void beep(String Sonido) {
        try {
            File soundPath = new File(Sonido);
            if (soundPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
          } else {
                System.out.println("Archivo no encontrado");
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    
    private List<Double> calculatedNumbers = new ArrayList<>();

    public void addCalculatedNumber(double number) {
    calculatedNumbers.add(number);
}
        
    public Cal() {
        
        this.setLocationRelativeTo(null);
        initComponents();
          addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                beep("C:\\Users\\Bomiki\\Music\\beep.wav");
                if (Character.isDigit(c) || c == '.') {
                    ventana.setText(ventana.getText() + c);
                } else if (c == '+') {
                    executeOperation("+");
                    beep("C:\\Users\\Bomiki\\Music\\beep.wav");
                } else if (c == '-') {
                    executeOperation("-");
                    beep("C:\\Users\\Bomiki\\Music\\beep.wav");
                } else if (c == '*') {
                    executeOperation("*");
                    beep("C:\\Users\\Bomiki\\Music\\beep.wav");
                } else if (c == '/') {
                    executeOperation("/");
                    beep("C:\\Users\\Bomiki\\Music\\beep.wav");
                } else if (c == KeyEvent.VK_ENTER) {
                    executeEquals();
                } else if (c == 'C' || c == 'c') {
                    ventana.setText("");
                    beep("C:\\Users\\Bomiki\\Music\\beep.wav");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
            
        });
        setFocusable(true);
    }

    private void executeOperation(String operation) {
        primernumero = Float.parseFloat(ventana.getText());
        operador = operation;
        ventana.setText("");

    }

    private void executeEquals() {
        segundonumero = Float.parseFloat(ventana.getText());
        switch (operador) {
            case "+":
                ventana.setText(sincero(primernumero + segundonumero));
                break;
            case "-":
                ventana.setText(sincero(primernumero - segundonumero));
                break;
            case "*":
                ventana.setText(sincero(primernumero * segundonumero));
                break;
            case "/":
                ventana.setText(sincero(primernumero / segundonumero));
                break;
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ventana = new javax.swing.JLabel();
        Button_C = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        button_0 = new javax.swing.JButton();
        Button_4 = new javax.swing.JButton();
        Button_7 = new javax.swing.JButton();
        Button_8 = new javax.swing.JButton();
        Button_M = new javax.swing.JButton();
        Button_D = new javax.swing.JButton();
        Button_9 = new javax.swing.JButton();
        Button_p = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        Button_R = new javax.swing.JButton();
        Button_Suma = new javax.swing.JButton();
        Button_i = new javax.swing.JButton();
        Button_1 = new javax.swing.JButton();
        Button_2 = new javax.swing.JButton();
        Button_3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Nuevo_txt = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        ventana.setBackground(new java.awt.Color(255, 255, 255));
        ventana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ventana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ventana.setOpaque(true);

        Button_C.setText("C");
        Button_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CActionPerformed(evt);
            }
        });

        jButton3.setText("5");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        button_0.setText("0");
        button_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_0ActionPerformed(evt);
            }
        });

        Button_4.setText("4");
        Button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_4ActionPerformed(evt);
            }
        });

        Button_7.setText("7");
        Button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_7ActionPerformed(evt);
            }
        });

        Button_8.setText("8");
        Button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_8ActionPerformed(evt);
            }
        });

        Button_M.setText("*");
        Button_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MActionPerformed(evt);
            }
        });

        Button_D.setText("/");
        Button_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DActionPerformed(evt);
            }
        });

        Button_9.setText("9");
        Button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_9ActionPerformed(evt);
            }
        });

        Button_p.setText(".");
        Button_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_pActionPerformed(evt);
            }
        });

        jButton13.setText("6");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        Button_R.setText("-");
        Button_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RActionPerformed(evt);
            }
        });

        Button_Suma.setText("+");
        Button_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SumaActionPerformed(evt);
            }
        });

        Button_i.setText("=");
        Button_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_iActionPerformed(evt);
            }
        });

        Button_1.setText("1");
        Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1ActionPerformed(evt);
            }
        });

        Button_2.setText("2");
        Button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_2ActionPerformed(evt);
            }
        });

        Button_3.setText("3");
        Button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_p, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_C, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_D, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_M, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_R, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(Button_i, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Button_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_C, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_D, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_M, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_R, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_p, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Button_i, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones");

        Nuevo_txt.setText("Nuevo");
        Nuevo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_txtActionPerformed(evt);
            }
        });
        jMenu1.add(Nuevo_txt);

        jMenuItem2.setText("Historial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem3.setText("Manual de usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_3ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"3");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
        
    }//GEN-LAST:event_Button_3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"6");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
       
    }//GEN-LAST:event_jButton13ActionPerformed

    private void button_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_0ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"0");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
        
    }//GEN-LAST:event_button_0ActionPerformed

    private void Button_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_pActionPerformed
        // TODO add your handling code here:
        if(!(this.ventana.getText().contains("."))){
            this.ventana.setText(this.ventana.getText()+".");
            beep("C:\\Users\\Bomiki\\Music\\beep.wav");
           
    }//GEN-LAST:event_Button_pActionPerformed
    }
    private void Button_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_iActionPerformed
        // TODO add your handling code here:
        this.segundonumero=Float.parseFloat(this.ventana.getText());
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
        
        switch(this.operador){
            case "+":this.ventana.setText(sincero(primernumero+this.segundonumero));
            bitacora(+primernumero+" + "+segundonumero+ " = " + resu); break;//escribe el primer numero + el segundo numero = el resultado "resu" en el archivo txt
            case "-":this.ventana.setText(sincero(primernumero-this.segundonumero));
              bitacora(+primernumero+" - "+segundonumero+ " = " + resu); break;
            case "*":this.ventana.setText(sincero(primernumero*this.segundonumero));
              bitacora(+primernumero+" * "+segundonumero+ " = " + resu); break;
            case "/":this.ventana.setText(sincero(primernumero/this.segundonumero));
              bitacora(+primernumero+" / "+segundonumero+ " = " + resu); break;
       
            
    }//GEN-LAST:event_Button_iActionPerformed
    }
    private void Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"1");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
          
    }//GEN-LAST:event_Button_1ActionPerformed

    private void Button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_2ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"2");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
        
    }//GEN-LAST:event_Button_2ActionPerformed

    private void Button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_4ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"4");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_Button_4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"5");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_7ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"7");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_Button_7ActionPerformed

    private void Button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_8ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"8");
       beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_Button_8ActionPerformed

    private void Button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_9ActionPerformed
        // TODO add your handling code here:
        this.ventana.setText(this.ventana.getText()+"9");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_Button_9ActionPerformed

    private void Button_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CActionPerformed
        // TODO add your handling code here:
        this.ventana.setText("");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_Button_CActionPerformed

    private void Button_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SumaActionPerformed
        // TODO add your handling code here:
        this.primernumero=Float.parseFloat(this.ventana.getText());
        this.operador="+";
        this.ventana.setText("");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
        
    }//GEN-LAST:event_Button_SumaActionPerformed

    private void Button_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RActionPerformed
        // TODO add your handling code here:
        this.primernumero=Float.parseFloat(this.ventana.getText());
        this.operador="-";
        this.ventana.setText("");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_Button_RActionPerformed

    private void Button_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MActionPerformed
        // TODO add your handling code here:
        this.primernumero=Float.parseFloat(this.ventana.getText());
        this.operador="*";
        this.ventana.setText("");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
    }//GEN-LAST:event_Button_MActionPerformed

    private void Button_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DActionPerformed
    
        this.primernumero=Float.parseFloat(this.ventana.getText());
        this.operador="/";
        this.ventana.setText("");
        beep("C:\\Users\\Bomiki\\Music\\beep.wav");
     

    }//GEN-LAST:event_Button_DActionPerformed

    private void Nuevo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_txtActionPerformed
        // TODO add your handling code here:
    this.ventana.setText("");
    }//GEN-LAST:event_Nuevo_txtActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("C:\\Users\\Bomiki\\Documents\\NetBeansProjects\\Calculadora\\bitacoraCalculadora.txt");
            
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while((cadena = lector.readLine())!=null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("Error al leer el archivo");
            }
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("C:\\Users\\Bomiki\\Documents\\NetBeansProjects\\Calculadora\\Manual de usuario.txt");
            
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while((cadena = lector.readLine())!=null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("Error al leer el archivo");
            }
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_1;
    private javax.swing.JButton Button_2;
    private javax.swing.JButton Button_3;
    private javax.swing.JButton Button_4;
    private javax.swing.JButton Button_7;
    private javax.swing.JButton Button_8;
    private javax.swing.JButton Button_9;
    private javax.swing.JButton Button_C;
    private javax.swing.JButton Button_D;
    private javax.swing.JButton Button_M;
    private javax.swing.JButton Button_R;
    private javax.swing.JButton Button_Suma;
    private javax.swing.JButton Button_i;
    private javax.swing.JButton Button_p;
    private javax.swing.JMenuItem Nuevo_txt;
    private javax.swing.JButton button_0;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ventana;
    // End of variables declaration//GEN-END:variables

}