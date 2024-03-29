
import java.awt.HeadlessException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauri
 */
public class plataforma extends javax.swing.JFrame {

    /**
     * Creates new form plataforma
     */
    public plataforma() {
        initComponents();
        this.setLocationRelativeTo(null);
        au.cargarArchivo();
    }
    
    public void ReiniciarTabla (JTable tabla){
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }
    
    public void Amigos (){
        jl_amigos.setModel(new DefaultListModel());
        DefaultListModel modelo = (DefaultListModel) jl_amigos.getModel();
        for (Usuario t : au.getUsuarios().get(pos).getAmigos()) {
            modelo.addElement(t);
        }
    }
    
    public void Usuarios (){
        jl_usuarios.setModel(new DefaultListModel());
        DefaultListModel modelo = (DefaultListModel) jl_usuarios.getModel();
        for (Usuario t : au.getUsuarios()) {
            modelo.addElement(t);
        }
    }
    
    public void llenarArbol(){
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Chats");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Privado");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Grupo");
        treeNode1.add(treeNode2);
        jt_chats.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        
        DefaultTreeModel modelo = (DefaultTreeModel) jt_chats.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        for (int i = 0; i < au.getUsuarios().get(pos).getChats().size(); i++) {
            if (au.getUsuarios().get(pos).getChats().get(i) instanceof Privado){
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(au.getUsuarios().get(pos).getChats().get(i));
                ((DefaultMutableTreeNode) raiz.getChildAt(0)).add(p);
            }
            else{
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(au.getUsuarios().get(pos).getChats().get(i));
                ((DefaultMutableTreeNode) raiz.getChildAt(1)).add(p);
            }
        }
        modelo.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_nuevo = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ff_telefono = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_nuevousuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pf_nuevo = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        sp_conexion = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jd_chat = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_chats = new javax.swing.JTree();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_log = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_message = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_amigos = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_usuarios = new javax.swing.JList<>();
        popup_usuario = new javax.swing.JPopupMenu();
        jm_agregar = new javax.swing.JMenuItem();
        popup_amigos = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        tf_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Telefono");

        try {
            ff_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Usuario");

        jLabel7.setText("Contraseña");

        jLabel8.setText("Calidad de Conexion");

        sp_conexion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jButton3.setText("Crear Cuenta");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_nuevoLayout = new javax.swing.GroupLayout(jd_nuevo.getContentPane());
        jd_nuevo.getContentPane().setLayout(jd_nuevoLayout);
        jd_nuevoLayout.setHorizontalGroup(
            jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_nuevoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_nuevoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_nuevoLayout.createSequentialGroup()
                        .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(75, 75, 75)
                        .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(ff_telefono)))
                    .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_nuevoLayout.createSequentialGroup()
                            .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_nuevoLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(80, 80, 80))
                                .addGroup(jd_nuevoLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(60, 60, 60)))
                            .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pf_nuevo)
                                .addComponent(tf_nuevousuario, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_nuevoLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                            .addComponent(sp_conexion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_nuevoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_nuevoLayout.setVerticalGroup(
            jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_nuevoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ff_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nuevousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pf_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_conexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jd_chat.setTitle("Leogram 2.0");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Chats");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Privado");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Grupo");
        treeNode1.add(treeNode2);
        jt_chats.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_chats);

        jLabel9.setText("Amigos");

        ta_log.setColumns(20);
        ta_log.setRows(5);
        jScrollPane3.setViewportView(ta_log);

        ta_message.setColumns(20);
        ta_message.setRows(5);
        jScrollPane4.setViewportView(ta_message);

        jButton4.setText("Enviar");

        jProgressBar1.setForeground(new java.awt.Color(0, 153, 51));

        jLabel10.setText("Lista de Usuarios no agregados");

        jButton5.setText("Crear grupo");

        jButton6.setText("Eliminar Cuenta");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jl_amigos.setModel(new DefaultListModel());
        jl_amigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_amigosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jl_amigos);

        jl_usuarios.setModel(new DefaultListModel());
        jl_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_usuariosMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jl_usuarios);

        javax.swing.GroupLayout jd_chatLayout = new javax.swing.GroupLayout(jd_chat.getContentPane());
        jd_chat.getContentPane().setLayout(jd_chatLayout);
        jd_chatLayout.setHorizontalGroup(
            jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_chatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_chatLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)))
                    .addGroup(jd_chatLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_chatLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(11, 11, 11))
                            .addGroup(jd_chatLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(95, 95, 95)
                                .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jd_chatLayout.createSequentialGroup()
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jd_chatLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40))
                                            .addGroup(jd_chatLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addGap(0, 65, Short.MAX_VALUE)))))))))
                .addContainerGap())
        );
        jd_chatLayout.setVerticalGroup(
            jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_chatLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_chatLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_chatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_chatLayout.createSequentialGroup()
                                    .addComponent(jButton5)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );

        jm_agregar.setText("Agregar a Amigos");
        jm_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_agregarActionPerformed(evt);
            }
        });
        popup_usuario.add(jm_agregar);

        jMenuItem1.setText("Iniciar Chat");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        popup_amigos.add(jMenuItem1);

        jMenuItem2.setText("Eliminar Amigo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        popup_amigos.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leogram 2.0");

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jButton1.setText("Log In");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Crear Cuenta");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pf_pass)
                            .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_nuevo.setModal(true);
        jd_nuevo.pack();
        jd_nuevo.setLocationRelativeTo(this);
        jd_nuevo.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        String nombre="";
        String apellido="";
        String telefono="";
        String usuario="";
        String pass="";
        int conn =0;
        try {
            nombre=tf_nombre.getText();
            apellido = tf_apellido.getText();
            telefono=ff_telefono.getText();
            usuario=tf_nuevousuario.getText();
            pass=pf_nuevo.getText();
            conn = (Integer) sp_conexion.getValue();
            au.cargarArchivo();
            au.getUsuarios().add(new Usuario(usuario, pass, conn, au.getUsuarios().size(), nombre, apellido, telefono));
            au.escribirArchivo();
            JOptionPane.showMessageDialog(jd_nuevo, "Usuario creado exitosamente");
            jd_nuevo.setVisible(false);
            jd_nuevo.setModal(false);
            tf_nombre.setText("");
            tf_apellido.setText("");
            ff_telefono.setText("");
            tf_nuevousuario.setText("");
            pf_nuevo.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        for (int i = 0; i < au.getUsuarios().size(); i++) {
            if (tf_usuario.getText().equals(au.getUsuarios().get(i).getUsuario()) && pf_pass.getText().equals(au.getUsuarios().get(i).getPassword())){
                pos=i;
                Amigos();
                Usuarios();
                try {
                    for (Usuario t : au.getUsuarios().get(pos).getSolicitudes()) {
                        int response = JOptionPane.showConfirmDialog(jd_chat,
                                "Tiene una solicitud de "+ t.getUsuario(),
                                "Confirm",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                        if (response == JOptionPane.OK_OPTION) {
                            au.cargarArchivo();
                            au.getUsuarios().get(pos).getAmigos().add(t);
                            au.getUsuarios().get(t.getID()).getAmigos().add(au.getUsuarios().get(pos));
                            au.escribirArchivo();
                            Amigos();
                        }
                        au.getUsuarios().get(pos).getSolicitudes().clear();
                    }
                    
                } catch (HeadlessException e) {
                }
                jd_chat.setModal(true);
                jd_chat.pack();
                jd_chat.setLocationRelativeTo(this);
                jd_chat.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        try {
            int response = JOptionPane.showConfirmDialog(jd_chat,
                    "Seguro que desea eliminar su cuenta?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                au.cargarArchivo();
                au.getUsuarios().remove(pos);
                au.escribirArchivo();
                
                jd_chat.setVisible(false);
                jd_chat.setModal(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jl_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_usuariosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()){
            popup_usuario.show(jd_chat, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_usuariosMouseClicked

    private void jm_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_agregarActionPerformed
        // TODO add your handling code here:
        if (jl_usuarios.getSelectedIndex() != pos){
            au.getUsuarios().get(jl_usuarios.getSelectedIndex()).getSolicitudes().add(au.getUsuarios().get(pos));
            Amigos();
            JOptionPane.showMessageDialog(jd_chat, "Solicitud enviada");
        }
        else{
            JOptionPane.showMessageDialog(jd_chat, "No se puede agregar a uno mismo como amigo");
        }
    }//GEN-LAST:event_jm_agregarActionPerformed

    private void jl_amigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_amigosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()){
            popup_amigos.show(jd_chat, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_amigosMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(jd_chat,
                    "Seguro que desea eliminar su amigo?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                au.cargarArchivo();
                au.getUsuarios().get(pos).getAmigos().remove(jl_amigos.getSelectedIndex());
                au.escribirArchivo();
                Amigos();
            }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_amigos.getModel();
        Usuario amigo = (Usuario) modelo.getElementAt(jl_amigos.getSelectedIndex());
        au.getUsuarios().get(pos).getChats().add(new Privado(au.getUsuarios().get(amigo.getID())));
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new plataforma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ff_telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JDialog jd_chat;
    private javax.swing.JDialog jd_nuevo;
    private javax.swing.JList<String> jl_amigos;
    private javax.swing.JList<String> jl_usuarios;
    private javax.swing.JMenuItem jm_agregar;
    private javax.swing.JTree jt_chats;
    private javax.swing.JPasswordField pf_nuevo;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPopupMenu popup_amigos;
    private javax.swing.JPopupMenu popup_usuario;
    private javax.swing.JSpinner sp_conexion;
    private javax.swing.JTextArea ta_log;
    private javax.swing.JTextArea ta_message;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nuevousuario;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
AdminUsuarios au = new AdminUsuarios("./Usuarios.ex");
int pos;

}
