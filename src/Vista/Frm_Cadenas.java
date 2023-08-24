/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;
/**
 *
 * @author User
 */
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Frm_Cadenas extends javax.swing.JFrame {
     int longitud,a=0,e=0,i=0,o=0,u=0;
     String palabra,murcielago="",mostrar="",lugar="";
     
   
 
    public Frm_Cadenas() {
        initComponents();
        this.setTitle("Programación ll");
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        areaTexto = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        tituloGrande1 = new javax.swing.JLabel();
        procesar = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        titulo5 = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        titulo8 = new javax.swing.JLabel();
        titulo9 = new javax.swing.JLabel();
        titulo10 = new javax.swing.JLabel();
        titulo11 = new javax.swing.JLabel();
        titulo12 = new javax.swing.JLabel();
        titulo13 = new javax.swing.JLabel();
        titulo14 = new javax.swing.JLabel();
        titulo15 = new javax.swing.JLabel();
        tituloGrande2 = new javax.swing.JLabel();
        areaTexto1 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();
        respuesta = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JLabel();
        respuesta2 = new javax.swing.JLabel();
        respuesta3 = new javax.swing.JLabel();
        respuesta4 = new javax.swing.JLabel();
        respuesta5 = new javax.swing.JLabel();
        respuesta6 = new javax.swing.JLabel();
        respuesta7 = new javax.swing.JLabel();
        respuesta8 = new javax.swing.JLabel();
        respuesta9 = new javax.swing.JLabel();
        respuesta10 = new javax.swing.JLabel();
        respuesta11 = new javax.swing.JLabel();
        respuesta12 = new javax.swing.JLabel();
        respuesta13 = new javax.swing.JLabel();
        respuesta14 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        guardarComo = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenu();
        copiar = new javax.swing.JMenuItem();
        cortar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        buscar = new javax.swing.JMenuItem();
        reemplazar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N

        texto1.setColumns(20);
        texto1.setRows(5);
        areaTexto.setViewportView(texto1);

        tituloGrande1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloGrande1.setForeground(new java.awt.Color(0, 0, 0));
        tituloGrande1.setText("MANEJO DE CADENAS");

        procesar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        procesar.setText("Procesar");
        procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarActionPerformed(evt);
            }
        });

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setText("Longitud del texto..");

        titulo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo2.setForeground(new java.awt.Color(0, 0, 0));
        titulo2.setText("Total de Palabras..");

        titulo3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo3.setForeground(new java.awt.Color(0, 0, 0));
        titulo3.setText("Primera letra del Texto..");

        titulo4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo4.setForeground(new java.awt.Color(0, 0, 0));
        titulo4.setText("Última letra del Texto..");

        titulo5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo5.setForeground(new java.awt.Color(0, 0, 0));
        titulo5.setText("Letra central del Texto..");

        titulo6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo6.setForeground(new java.awt.Color(0, 0, 0));
        titulo6.setText("Primera palabra..");

        titulo7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo7.setForeground(new java.awt.Color(0, 0, 0));
        titulo7.setText("Palabra Central..");

        titulo8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo8.setForeground(new java.awt.Color(0, 0, 0));
        titulo8.setText("Última palabra..");

        titulo9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo9.setForeground(new java.awt.Color(0, 0, 0));
        titulo9.setText("Repeticiones de \"A\", \"a\" ó \"á\":");

        titulo10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo10.setForeground(new java.awt.Color(0, 0, 0));
        titulo10.setText("Repeticiones de \"E\", \"e\" ó \"é\":");

        titulo11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo11.setForeground(new java.awt.Color(0, 0, 0));
        titulo11.setText("Repeticiones de \"I\", \"i\" ó \"í\":");

        titulo12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo12.setForeground(new java.awt.Color(0, 0, 0));
        titulo12.setText("Repeticiones de \"O\", \"o\" ú \"ó\":");

        titulo13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo13.setForeground(new java.awt.Color(0, 0, 0));
        titulo13.setText("Repeticiones de \"U\", \"u\" ó \"ú\":");

        titulo14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo14.setForeground(new java.awt.Color(0, 0, 0));
        titulo14.setText("Palabras con cantidad de caracteres Par:");

        titulo15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo15.setForeground(new java.awt.Color(0, 0, 0));
        titulo15.setText("Palabras con cantidad de caracteres Inpar:");

        tituloGrande2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloGrande2.setForeground(new java.awt.Color(0, 0, 0));
        tituloGrande2.setText("TRADUCCIÓN A CLAVE MURCIELAGO");

        texto2.setColumns(20);
        texto2.setRows(5);
        areaTexto1.setViewportView(texto2);

        respuesta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta.setForeground(new java.awt.Color(0, 0, 0));
        respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta1.setForeground(new java.awt.Color(0, 0, 0));
        respuesta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta2.setForeground(new java.awt.Color(0, 0, 0));
        respuesta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta3.setForeground(new java.awt.Color(0, 0, 0));
        respuesta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta4.setForeground(new java.awt.Color(0, 0, 0));
        respuesta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta5.setForeground(new java.awt.Color(0, 0, 0));
        respuesta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta6.setForeground(new java.awt.Color(0, 0, 0));
        respuesta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta7.setForeground(new java.awt.Color(0, 0, 0));
        respuesta7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta8.setForeground(new java.awt.Color(0, 0, 0));
        respuesta8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta9.setForeground(new java.awt.Color(0, 0, 0));
        respuesta9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta10.setForeground(new java.awt.Color(0, 0, 0));
        respuesta10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta11.setForeground(new java.awt.Color(0, 0, 0));
        respuesta11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta12.setForeground(new java.awt.Color(0, 0, 0));
        respuesta12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta13.setForeground(new java.awt.Color(0, 0, 0));
        respuesta13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        respuesta14.setForeground(new java.awt.Color(0, 0, 0));
        respuesta14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(tituloGrande2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaTexto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(titulo8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titulo7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titulo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titulo5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titulo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titulo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(procesar)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(titulo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titulo10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titulo12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titulo11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titulo13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titulo15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titulo14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respuesta8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 23, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(tituloGrande1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaTexto1)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloGrande1)
                .addGap(18, 18, 18)
                .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(procesar)
                .addGap(46, 46, 46)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo1)
                    .addComponent(titulo9)
                    .addComponent(respuesta)
                    .addComponent(respuesta8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo2)
                    .addComponent(titulo10)
                    .addComponent(respuesta1)
                    .addComponent(respuesta9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo3)
                    .addComponent(titulo11)
                    .addComponent(respuesta2)
                    .addComponent(respuesta10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo4)
                    .addComponent(titulo12)
                    .addComponent(respuesta3)
                    .addComponent(respuesta11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo5)
                    .addComponent(titulo13)
                    .addComponent(respuesta4)
                    .addComponent(respuesta12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo6)
                    .addComponent(titulo14)
                    .addComponent(respuesta5)
                    .addComponent(respuesta13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo7)
                    .addComponent(titulo15)
                    .addComponent(respuesta6)
                    .addComponent(respuesta14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo8)
                    .addComponent(respuesta7))
                .addGap(41, 41, 41)
                .addComponent(tituloGrande2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(areaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        archivo.setText("Archivo");

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivo.add(abrir);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivo.add(guardar);

        guardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        guardarComo.setText("Guardar como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });
        archivo.add(guardarComo);

        menu.add(archivo);

        editar.setText("Editar");

        copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        editar.add(copiar);

        cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cortar.setText("Cortar");
        cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarActionPerformed(evt);
            }
        });
        editar.add(cortar);

        pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        editar.add(pegar);

        buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        editar.add(buscar);

        reemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        reemplazar.setText("Reemplazar");
        reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemplazarActionPerformed(evt);
            }
        });
        editar.add(reemplazar);

        menu.add(editar);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarActionPerformed
        // TODO add your handling code here:
        texto2.setText("");
        palabra = texto1.getText(); 
        longitud = palabra.length(); 
        
        respuesta.setText(String.valueOf(longitud)); 
        
         StringTokenizer contador = new StringTokenizer(palabra);
        respuesta1.setText(String.valueOf(contador.countTokens()));
        respuesta2.setText( String.valueOf(palabra.charAt(0)));
        respuesta3.setText( String.valueOf(palabra.charAt(longitud-1)));
        respuesta4.setText( String.valueOf(palabra.charAt((longitud -1)/2) ));
        
        respuesta5.setText( String.valueOf(contador.nextToken()) );
        respuesta8.setText( String.valueOf( contarA() ) );
        respuesta9.setText( String.valueOf( contarE() ) );
        respuesta10.setText( String.valueOf( contarI() ) );
        respuesta11.setText( String.valueOf( contarO() ) );
        respuesta12.setText( String.valueOf( contarU() ) );
        
        texto2.setText(ClaveMurcielago());
        
    }//GEN-LAST:event_procesarActionPerformed

    private void cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarActionPerformed
             texto1.cut();
    }//GEN-LAST:event_cortarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
     
        
        String buscar = JOptionPane.showInputDialog("Digite la palabra a buscar..");
      
        if(palabra.contains(buscar)){
         JOptionPane.showMessageDialog(null,"La palabra "+buscar+" si se encuentra en el texto");
        }else{
         JOptionPane.showMessageDialog(null,"La palabra "+buscar+" no se encuentra en el texto");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemplazarActionPerformed
        
        String buscar = JOptionPane.showInputDialog("Digite la palabra a buscar.. ");
        String cambio = JOptionPane.showInputDialog("Digite la palabra para reemplazar..");
        
        String temporal = palabra.replace(buscar, cambio);
        
        JOptionPane.showMessageDialog(null,"La palabra "+buscar+" fue reemplazada por "+cambio +" con éxito!!");
        
        reiniciar();
        palabra = temporal;
        texto1.setText(palabra);
        
        
    }//GEN-LAST:event_reemplazarActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        texto1.copy();
    }//GEN-LAST:event_copiarActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        // TODO add your handling code here:
        texto1.paste();
    }//GEN-LAST:event_pegarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed

         try {
             String contenido="";
            File archivo;
           String ruta;

           JFileChooser buscarArchivo;

           buscarArchivo= new JFileChooser();

           buscarArchivo.showOpenDialog(null);

           archivo = buscarArchivo.getSelectedFile();
           ruta = archivo.getAbsolutePath();
           FileReader leer = new FileReader(ruta);
           BufferedReader lectura = new BufferedReader(leer);
           lugar= ruta;
           
             while(contenido != null){
                
                
                //if(contenido!="\n"){
                    //mostrar+="\r\n";
                    mostrar+=contenido;
                 contenido= lectura.readLine();
                 mostrar+="\n";
                //}
             }
            
         } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null,"Error al abrir el archivo "+ex);
         }catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,"Error al abrir el archivo "+ex);
             }
         
         texto1.setText(mostrar);
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
      
        JFileChooser jfc= new JFileChooser(); 
            String direc = ""; 
            try{ 
            if(jfc.showSaveDialog(null)==jfc.APPROVE_OPTION){ 
            direc = jfc.getSelectedFile().getAbsolutePath();
            lugar=direc;
                File archivo = new File(direc);
                 FileWriter ec = new FileWriter(archivo);
                 ec.write("Palabra ingresada: ");
                 ec.write(texto1.getText());   
                 ec.write("\r\n");
                 ec.write("Clave Murcielago: ");
                 ec.write(texto2.getText()); 
                 ec.close();
                 JOptionPane.showMessageDialog(null,"Archivo guardado con exito!! ");
 
            } 
            }catch (Exception ex){ 
            ex.printStackTrace(); 
            } 
    }//GEN-LAST:event_guardarComoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
            try{ 
            //if(jfc.showSaveDialog(null)==jfc.APPROVE_OPTION){ 
            //direc = jfc.getSelectedFile().getAbsolutePath();
                File archivos = new File(lugar);
                 FileWriter ec1 = new FileWriter(archivos,true);
                 ec1.write("\r\n\n");
                 ec1.write("Palabra ingresada: ");
                 ec1.write(texto1.getText());   
                 ec1.write("\r\n");
                 ec1.write("Clave Murcielago: ");
                 ec1.write(texto2.getText()); 
                 JOptionPane.showMessageDialog(null,"Guardado con Exito");
                 ec1.close();
                 reiniciar();
 
            //} 
            }catch (Exception ex){ 
                JOptionPane.showMessageDialog(null,"Erro al guardar los cambios.. "+ex);
            } 
    }//GEN-LAST:event_guardarActionPerformed

     
 public void reiniciar(){
     a=e=i=o=u=0;
     texto1.setText("");
     texto2.setText("");
     respuesta.setText("");
     respuesta1.setText("");
     respuesta2.setText("");
     respuesta3.setText("");
     respuesta4.setText("");
     respuesta5.setText("");
     respuesta6.setText("");
     respuesta7.setText("");
     respuesta8.setText("");
     respuesta9.setText("");
     respuesta10.setText("");
     respuesta11.setText("");
     respuesta12.setText("");
     respuesta13.setText("");
     respuesta14.setText("");
     
 }
    
    public int contarA(){
        
        for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'A':  
                case 'a': 
                case 'á': a++; break;
            }  
        }
      
        return a;
    }
    
    public int contarE(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'E' :
                case 'e' :
                case 'é' : e++; break;
            }  
            
        }
        
        return e;
    }
    
    public int contarI(){
        
         for(int j=0; j<longitud;j++){
           
            char letra = palabra.charAt(j);
            
            switch(letra){
                case 'I' :
                case 'i' :
                case 'í' : i++; break;
            }  
        }
        return i;
    }
    
    public int contarO(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'O' :
                case 'o' :
                case 'ó' : o++; break;
            }   
        }
        return o;
    }
    
    public int contarU(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'U' :
                case 'u' :
                case 'ú' : u++; break;
            }  
        }
        return u;
    }
    
    
    public String ClaveMurcielago( ){
        for(int J =0; J<longitud;J++){
           
            char letra = palabra.charAt(J);
            
            switch(letra){
                
                case 'M':  
                case 'm': murcielago += "0"; break;
                
                case 'U' :
                case 'u' :
                case 'ú' : murcielago += "1"; break;
                
                case 'R':  
                case 'r': murcielago += "2"; break;
                
                case 'C':  
                case 'c': murcielago += "3"; break;
                
                case 'I' :
                case 'i' :
                case 'í' : murcielago += "4"; break;
                
                case 'E' :
                case 'e' :
                case 'é' : murcielago += "5"; break;
                
                case 'L':  
                case 'l': murcielago += "6"; break;
                
                case 'A':  
                case 'a': 
                case 'á': murcielago += "7"; break;
                
                case 'G':  
                case 'g': murcielago += "8"; break;
               
                case 'O' :
                case 'o' :
                case 'ó' : murcielago += "9"; break;
                
                
                default : murcielago += String.valueOf(letra); break;
                
            }  
        }
        
        return murcielago;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Cadenas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenu archivo;
    private javax.swing.JScrollPane areaTexto;
    private javax.swing.JScrollPane areaTexto1;
    private javax.swing.JMenuItem buscar;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem cortar;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem guardarComo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JButton procesar;
    private javax.swing.JMenuItem reemplazar;
    private javax.swing.JLabel respuesta;
    private javax.swing.JLabel respuesta1;
    private javax.swing.JLabel respuesta10;
    private javax.swing.JLabel respuesta11;
    private javax.swing.JLabel respuesta12;
    private javax.swing.JLabel respuesta13;
    private javax.swing.JLabel respuesta14;
    private javax.swing.JLabel respuesta2;
    private javax.swing.JLabel respuesta3;
    private javax.swing.JLabel respuesta4;
    private javax.swing.JLabel respuesta5;
    private javax.swing.JLabel respuesta6;
    private javax.swing.JLabel respuesta7;
    private javax.swing.JLabel respuesta8;
    private javax.swing.JLabel respuesta9;
    private javax.swing.JTextArea texto1;
    private javax.swing.JTextArea texto2;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo11;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo13;
    private javax.swing.JLabel titulo14;
    private javax.swing.JLabel titulo15;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JLabel titulo9;
    private javax.swing.JLabel tituloGrande1;
    private javax.swing.JLabel tituloGrande2;
    // End of variables declaration//GEN-END:variables
}
