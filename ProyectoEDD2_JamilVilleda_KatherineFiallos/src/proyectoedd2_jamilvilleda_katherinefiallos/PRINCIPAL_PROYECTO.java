/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_jamilvilleda_katherinefiallos;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author KATHERINE
 */
public class PRINCIPAL_PROYECTO extends javax.swing.JFrame {

    private TDA_ArchivoFijo archivo;

    /**
     * Creates new form PRINCIPAL_PROYECTO
     */
    public PRINCIPAL_PROYECTO()  {
        initComponents();
        ImageIcon fondoPrincipal = new ImageIcon(getClass().getResource("/Imagenes/rnp.jpg"));
        ImageIcon nave = new ImageIcon(fondoPrincipal.getImage().getScaledInstance(624, 407, Image.SCALE_DEFAULT));
        jl_fondoPrincipal.setIcon(nave);
        
        ImageIcon fondoAgregar = new ImageIcon(getClass().getResource("/Imagenes/white2.jpg"));
        ImageIcon blanco = new ImageIcon(fondoAgregar.getImage().getScaledInstance(454, 484, Image.SCALE_DEFAULT));
        jl_fondoAgregar.setIcon(blanco);
        
        ImageIcon agregarIcon = new ImageIcon(getClass().getResource("/Imagenes/add.png"));
        ImageIcon add = new ImageIcon(agregarIcon.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        jl_addIcon.setIcon(add);
        
        
        
        try {
            archivo = new TDA_ArchivoFijo(new File("./ArchivoFijo.dat"));
            if (archivo.cargarArbol()) {

            }
        } catch (Exception e) {
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

        jd_agregar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_ID1 = new javax.swing.JTextField();
        tf_nombre1 = new javax.swing.JTextField();
        bt_Agregarpersona = new javax.swing.JToggleButton();
        tf_fecha1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jl_addIcon = new javax.swing.JLabel();
        jl_fondoAgregar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_salario = new javax.swing.JTextField();
        jd_eliminar = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        tf_id_eliminar = new javax.swing.JTextField();
        bt_eliminar_persona = new javax.swing.JButton();
        jd_buscar = new javax.swing.JDialog();
        jd_listar = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_listar = new javax.swing.JTable();
        bt_cargarListado = new javax.swing.JButton();
        jd_modificar = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_idModificar = new javax.swing.JTextField();
        tf_nuevoID = new javax.swing.JTextField();
        tf_nuevaFecha = new javax.swing.JTextField();
        tf_nuevoNombre = new javax.swing.JTextField();
        bt_confirmar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_nuevoSalario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bt_agregar = new javax.swing.JToggleButton();
        bt_modificar = new javax.swing.JToggleButton();
        bt_eliminar = new javax.swing.JToggleButton();
        bt_buscar = new javax.swing.JToggleButton();
        bt_listar = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        jl_fondoPrincipal = new javax.swing.JLabel();

        jd_agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID");
        jd_agregar.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 20, 20));

        jLabel2.setText("Nombre");
        jd_agregar.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel3.setText("Fecha de nacimiento");
        jd_agregar.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jd_agregar.getContentPane().add(tf_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 226, 278, -1));
        jd_agregar.getContentPane().add(tf_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 267, 278, -1));

        bt_Agregarpersona.setText("Agregar al Archivo");
        bt_Agregarpersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarpersonaMouseClicked(evt);
            }
        });
        jd_agregar.getContentPane().add(bt_Agregarpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));
        jd_agregar.getContentPane().add(tf_fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 312, 278, -1));

        jButton1.setText("Cargar Archivos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jd_agregar.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));
        jd_agregar.getContentPane().add(jl_addIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 200, 200));
        jd_agregar.getContentPane().add(jl_fondoAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel17.setText("Salario");
        jd_agregar.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 60, 30));
        jd_agregar.getContentPane().add(tf_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 280, -1));

        jLabel15.setText("ID:");

        bt_eliminar_persona.setText("ELIMINAR");
        bt_eliminar_persona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminar_personaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarLayout = new javax.swing.GroupLayout(jd_eliminar.getContentPane());
        jd_eliminar.getContentPane().setLayout(jd_eliminarLayout);
        jd_eliminarLayout.setHorizontalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel15)
                        .addGap(32, 32, 32)
                        .addComponent(tf_id_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(bt_eliminar_persona)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jd_eliminarLayout.setVerticalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_id_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(bt_eliminar_persona)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_buscarLayout = new javax.swing.GroupLayout(jd_buscar.getContentPane());
        jd_buscar.getContentPane().setLayout(jd_buscarLayout);
        jd_buscarLayout.setHorizontalGroup(
            jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_buscarLayout.setVerticalGroup(
            jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel14.setText("Lista de personas en el sistema");

        jt_listar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha de Nacimiento", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_listar);

        bt_cargarListado.setText("Cargar Listado");
        bt_cargarListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cargarListadoMouseClicked(evt);
            }
        });
        bt_cargarListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cargarListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_listarLayout = new javax.swing.GroupLayout(jd_listar.getContentPane());
        jd_listar.getContentPane().setLayout(jd_listarLayout);
        jd_listarLayout.setHorizontalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarLayout.createSequentialGroup()
                .addGroup(jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_listarLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(bt_cargarListado))
                    .addGroup(jd_listarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(157, 157, 157))
        );
        jd_listarLayout.setVerticalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_cargarListado)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel7.setText("Nº de ID a modificar:");

        jLabel8.setText("Nuevo numero de ID: ");

        jLabel9.setText("Nombre: ");

        jLabel10.setText("Fecha de Nacimiento:");

        bt_confirmar.setText("Confirmar");
        bt_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_confirmarMouseClicked(evt);
            }
        });

        jLabel4.setText("Salario");

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tf_idModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nuevoID, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(bt_confirmar))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nuevoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_idModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nuevoID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_nuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_nuevoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(bt_confirmar)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_agregar.setText("Agregar");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        bt_modificar.setText("Modificar");
        bt_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        bt_buscar.setText("Buscar");
        bt_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, 30));

        bt_listar.setText("Listar");
        bt_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel16.setText("Registro Nacional de las Personas");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        jPanel1.add(jl_fondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 624, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked
        // TODO add your handling code here:
        jd_agregar.setModal(true);
        jd_agregar.pack();
        jd_agregar.setLocationRelativeTo(this);
        jd_agregar.setVisible(true);
    }//GEN-LAST:event_bt_agregarMouseClicked

    private void bt_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarMouseClicked
        // TODO add your handling code here:
        jd_modificar.setModal(true);
        jd_modificar.pack();
        jd_modificar.setLocationRelativeTo(this);
        jd_modificar.setVisible(true);
    }//GEN-LAST:event_bt_modificarMouseClicked

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
        // TODO add your handling code here:
        jd_eliminar.setModal(true);
        jd_eliminar.pack();
        jd_eliminar.setLocationRelativeTo(this);
        jd_eliminar.setVisible(true);
    }//GEN-LAST:event_bt_eliminarMouseClicked

    private void bt_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarMouseClicked
        // TODO add your handling code here:
        jd_buscar.setModal(true);
        jd_buscar.pack();
        jd_buscar.setLocationRelativeTo(this);
        jd_buscar.setVisible(true);
    }//GEN-LAST:event_bt_buscarMouseClicked

    private void bt_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarMouseClicked
        // TODO add your handling code here:
        jd_listar.setModal(true);
        jd_listar.pack();
        jd_listar.setLocationRelativeTo(this);
        jd_listar.setVisible(true);
    }//GEN-LAST:event_bt_listarMouseClicked

    private void bt_AgregarpersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarpersonaMouseClicked
        // TODO add your handling code here:
        int ID = Integer.parseInt(tf_ID1.getText());
        String nombre = tf_nombre1.getText();
        String fecha = tf_fecha1.getText();
        String salario = tf_salario.getText();
        
        if (archivo.insert(new Personas(ID, nombre, fecha, salario))) {
             archivo.escribir();
            JOptionPane.showConfirmDialog(jd_agregar, "Agregado exitosamente");

        } else {
            JOptionPane.showConfirmDialog(jd_agregar, "Error");
        }
        tf_ID1.setText("");
        tf_nombre1.setText("");
        tf_fecha1.setText("");
        tf_salario.setText("");


    }//GEN-LAST:event_bt_AgregarpersonaMouseClicked


    
    private void bt_cargarListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cargarListadoMouseClicked


         archivo.listar((DefaultTableModel) this.jt_listar.getModel());

        DefaultTableModel modelo=(DefaultTableModel)jt_listar.getModel();
        for (int i = 0; i < jt_listar.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        archivo.listar((DefaultTableModel) this.jt_listar.getModel());


        
    }//GEN-LAST:event_bt_cargarListadoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     
        try {
            FileReader in =new FileReader(new File("personas.txt"));
            BufferedReader reader=new BufferedReader(in);
            String line;
            while((line=reader.readLine())!=null){
                if(line.contains(",")){
                    String[] personas=line.split(",");
                    int id;
                    String nombre="",fecha="",lugar="",nombre_padre="",nombre_madre="";
                    id=Integer.parseInt(personas[0]);
                    nombre=personas[1];
                    fecha=personas[2];
                    lugar=personas[3];
                    nombre_padre=personas[4];
                    nombre_madre=personas[5];
                    archivo.insert(new Personas(id,nombre,fecha,lugar,nombre_padre,nombre_madre));
                }
            }
            JOptionPane.showMessageDialog(jd_agregar, "Archivos Agregados");
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void bt_eliminar_personaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminar_personaMouseClicked
        int id;
        id=Integer.parseInt(tf_id_eliminar.getText());
        try {
            if(archivo.delete(id)){
                JOptionPane.showMessageDialog(jd_eliminar, "Eliminado");
            }else{
                JOptionPane.showMessageDialog(jd_eliminar, "Error al eliminar");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(jd_eliminar, "error");
        }
        tf_id_eliminar.setText("");
    }//GEN-LAST:event_bt_eliminar_personaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        archivo.escribir();
    }//GEN-LAST:event_formWindowClosing

    private void bt_cargarListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cargarListadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cargarListadoActionPerformed

    private void bt_confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_confirmarMouseClicked

        int idModificar;
        int idNuevo;
        String nuevoNombre;
        String nuevaFechaNacimiento;
        Float salario;
        
        idModificar = Integer.parseInt(this.tf_idModificar.getText());
        idNuevo = Integer.parseInt(this.tf_nuevoID.getText());
        nuevoNombre = this.tf_nuevoNombre.getText();
        nuevaFechaNacimiento = this.tf_nuevaFecha.getText();
        salario = Float.parseFloat(this.tf_salario.getText());
        

        try {
            if (archivo.modify(new Personas(idNuevo, nuevoNombre, nuevaFechaNacimiento, salario), idModificar)) {

                JOptionPane.showMessageDialog(jd_modificar, "Se ha modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(jd_modificar, "Ocurrio un error al modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_modificar, "Error");
        }

        tf_idModificar.setText("");
        tf_nuevoID.setText("");
        tf_nuevoNombre.setText("");
        tf_nuevaFecha.setText("");
        tf_salario.setText("");
    }//GEN-LAST:event_bt_confirmarMouseClicked

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
            java.util.logging.Logger.getLogger(PRINCIPAL_PROYECTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL_PROYECTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL_PROYECTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL_PROYECTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL_PROYECTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bt_Agregarpersona;
    private javax.swing.JToggleButton bt_agregar;
    private javax.swing.JToggleButton bt_buscar;
    private javax.swing.JButton bt_cargarListado;
    private javax.swing.JButton bt_confirmar;
    private javax.swing.JToggleButton bt_eliminar;
    private javax.swing.JButton bt_eliminar_persona;
    private javax.swing.JToggleButton bt_listar;
    private javax.swing.JToggleButton bt_modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JDialog jd_buscar;
    private javax.swing.JDialog jd_eliminar;
    private javax.swing.JDialog jd_listar;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JLabel jl_addIcon;
    private javax.swing.JLabel jl_fondoAgregar;
    private javax.swing.JLabel jl_fondoPrincipal;
    private javax.swing.JTable jt_listar;
    private javax.swing.JTextField tf_ID1;
    private javax.swing.JTextField tf_fecha1;
    private javax.swing.JTextField tf_idModificar;
    private javax.swing.JTextField tf_id_eliminar;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_nuevaFecha;
    private javax.swing.JTextField tf_nuevoID;
    private javax.swing.JTextField tf_nuevoNombre;
    private javax.swing.JTextField tf_nuevoSalario;
    private javax.swing.JTextField tf_salario;
    // End of variables declaration//GEN-END:variables
}
