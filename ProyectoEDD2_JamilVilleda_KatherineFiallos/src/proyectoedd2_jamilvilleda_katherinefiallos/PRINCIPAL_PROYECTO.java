/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_jamilvilleda_katherinefiallos;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KATHERINE
 */
public class PRINCIPAL_PROYECTO extends javax.swing.JFrame {
    private TDA_ArchivoFijo archivo;
    ArrayList<Personas> lista_personas=new ArrayList();

    /**
     * Creates new form PRINCIPAL_PROYECTO
     */
    public PRINCIPAL_PROYECTO() {
        initComponents();
        //bloquear campos de la busqueda
        tf_nombre2.setEditable(false);
        tf_fecha2.setEditable(false);
        tf_lugar2.setEditable(false);
        tf_nombrepadre2.setEditable(false);
        tf_nombremadre2.setEditable(false);
        
        try {
            archivo=new TDA_ArchivoFijo(new File("./ArchivoFijo.dat"));
            if(archivo.cargarArbol()){
                
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_ID1 = new javax.swing.JTextField();
        tf_nombre1 = new javax.swing.JTextField();
        tf_nombrepadre1 = new javax.swing.JTextField();
        tf_lugar1 = new javax.swing.JTextField();
        tf_nombremadre1 = new javax.swing.JTextField();
        bt_Agregarpersona = new javax.swing.JToggleButton();
        tf_fecha1 = new javax.swing.JTextField();
        jd_modificar = new javax.swing.JDialog();
        jd_eliminar = new javax.swing.JDialog();
        jd_buscar = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_ID2 = new javax.swing.JTextField();
        tf_nombre2 = new javax.swing.JTextField();
        tf_nombrepadre2 = new javax.swing.JTextField();
        tf_lugar2 = new javax.swing.JTextField();
        tf_nombremadre2 = new javax.swing.JTextField();
        tf_fecha2 = new javax.swing.JTextField();
        jb_buscar = new javax.swing.JButton();
        jd_listar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tabla_personas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bt_agregar = new javax.swing.JToggleButton();
        bt_modificar = new javax.swing.JToggleButton();
        bt_eliminar = new javax.swing.JToggleButton();
        bt_buscar = new javax.swing.JToggleButton();
        bt_listar = new javax.swing.JToggleButton();

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setText("Lugar");

        jLabel5.setText("Nombre del padre");

        jLabel6.setText("Nombre de la madre");

        bt_Agregarpersona.setText("AGREGAR");
        bt_Agregarpersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarpersonaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_agregarLayout = new javax.swing.GroupLayout(jd_agregar.getContentPane());
        jd_agregar.getContentPane().setLayout(jd_agregarLayout);
        jd_agregarLayout.setHorizontalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombremadre1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombrepadre1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_lugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(183, 183, 183)
                        .addComponent(tf_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarLayout.createSequentialGroup()
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(bt_Agregarpersona)
                .addGap(54, 54, 54))
        );
        jd_agregarLayout.setVerticalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bt_Agregarpersona)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_lugar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombrepadre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombremadre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_eliminarLayout = new javax.swing.GroupLayout(jd_eliminar.getContentPane());
        jd_eliminar.getContentPane().setLayout(jd_eliminarLayout);
        jd_eliminarLayout.setHorizontalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_eliminarLayout.setVerticalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel7.setText("ID");

        jLabel8.setText("Nombre");

        jLabel9.setText("Fecha de nacimiento");

        jLabel10.setText("Lugar");

        jLabel11.setText("Nombre del padre");

        jLabel12.setText("Nombre de la madre");

        jb_buscar.setText("BUSCAR");
        jb_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_buscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_buscarLayout = new javax.swing.GroupLayout(jd_buscar.getContentPane());
        jd_buscar.getContentPane().setLayout(jd_buscarLayout);
        jd_buscarLayout.setHorizontalGroup(
            jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_buscarLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombremadre2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_buscarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombrepadre2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_buscarLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_lugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_buscarLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(183, 183, 183)
                        .addComponent(tf_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_buscarLayout.createSequentialGroup()
                        .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fecha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jb_buscar)
                .addGap(35, 35, 35))
        );
        jd_buscarLayout.setVerticalGroup(
            jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_buscarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_lugar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_buscarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_buscar)
                        .addGap(40, 40, 40)))
                .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_nombrepadre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_nombremadre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jt_tabla_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha de Nacimiento", "Lugar", "Nombre Padre", "Nombre Madre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_tabla_personas);

        javax.swing.GroupLayout jd_listarLayout = new javax.swing.GroupLayout(jd_listar.getContentPane());
        jd_listar.getContentPane().setLayout(jd_listarLayout);
        jd_listarLayout.setHorizontalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_listarLayout.setVerticalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_agregar.setText("Agregar");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });

        bt_modificar.setText("Modificar");
        bt_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarMouseClicked(evt);
            }
        });

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });

        bt_buscar.setText("Buscar");
        bt_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarMouseClicked(evt);
            }
        });

        bt_listar.setText("Listar");
        bt_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(bt_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(bt_modificar)
                .addGap(112, 112, 112)
                .addComponent(bt_eliminar)
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(bt_buscar)
                .addGap(139, 139, 139)
                .addComponent(bt_listar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_eliminar)
                    .addComponent(bt_modificar)
                    .addComponent(bt_agregar))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_buscar)
                    .addComponent(bt_listar))
                .addContainerGap(199, Short.MAX_VALUE))
        );

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
        
        tf_nombre2.setText("");
        tf_lugar2.setText("");
        tf_ID2.setText("");
        tf_fecha2.setText("");
        tf_nombremadre2.setText("");
        tf_nombrepadre2.setText("");
    }//GEN-LAST:event_bt_buscarMouseClicked

    private void bt_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarMouseClicked
        // TODO add your handling code here:
        jd_listar.setModal(true);
        jd_listar.pack();
        jd_listar.setLocationRelativeTo(this);
        jd_listar.setVisible(true);
        
        archivo.listar((DefaultTableModel)this.jt_tabla_personas.getModel());
        
    }//GEN-LAST:event_bt_listarMouseClicked

    private void bt_AgregarpersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarpersonaMouseClicked
        // TODO add your handling code here:
        int ID;
        ID=Integer.parseInt(tf_ID1.getText());
        String nombre=tf_nombre1.getText();
        String fecha=tf_fecha1.getText();
        String lugar=tf_lugar1.getText();
        String nombre_p=tf_nombrepadre1.getText();
        String nombre_m=tf_nombremadre1.getText();
        
        try {
            if(archivo.insert(new Personas(ID,nombre,fecha,lugar,nombre_p,nombre_m))){
                JOptionPane.showMessageDialog(jd_agregar, "Agregado exitosamente");
            }
           
              
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_agregar, "error");
        }
        
        tf_ID1.setText("");
        tf_nombre1.setText("");
        tf_fecha1.setText("");
        tf_lugar1.setText("");
        tf_nombrepadre1.setText("");
        tf_nombremadre1.setText("");
               
        
    }//GEN-LAST:event_bt_AgregarpersonaMouseClicked

    private void jb_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_buscarMouseClicked
        // TODO add your handling code here:
        int ID=Integer.parseInt(tf_ID2.getText());
        try {
            if(archivo.search(ID)!=null){
                Personas p=archivo.search(ID);
                tf_nombre2.setText(p.getName());
                tf_fecha2.setText(p.getBirthdate());
                tf_lugar2.setText(p.getPlace());
                tf_nombrepadre2.setText(p.getName_father());
                tf_nombremadre2.setText(p.getName_mother());
                
                
            }else{
                JOptionPane.showMessageDialog(jd_buscar, "Error, no se encontro la persona.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_buscar, e.toString());
        }
        
        
    }//GEN-LAST:event_jb_buscarMouseClicked

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
    private javax.swing.JToggleButton bt_eliminar;
    private javax.swing.JToggleButton bt_listar;
    private javax.swing.JToggleButton bt_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JDialog jd_buscar;
    private javax.swing.JDialog jd_eliminar;
    private javax.swing.JDialog jd_listar;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JTable jt_tabla_personas;
    private javax.swing.JTextField tf_ID1;
    private javax.swing.JTextField tf_ID2;
    private javax.swing.JTextField tf_fecha1;
    private javax.swing.JTextField tf_fecha2;
    private javax.swing.JTextField tf_lugar1;
    private javax.swing.JTextField tf_lugar2;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_nombre2;
    private javax.swing.JTextField tf_nombremadre1;
    private javax.swing.JTextField tf_nombremadre2;
    private javax.swing.JTextField tf_nombrepadre1;
    private javax.swing.JTextField tf_nombrepadre2;
    // End of variables declaration//GEN-END:variables
    
}
