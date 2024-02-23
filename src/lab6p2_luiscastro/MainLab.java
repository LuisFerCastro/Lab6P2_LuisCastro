/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6p2_luiscastro;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author lfern
 */
public class MainLab extends javax.swing.JFrame {

    /**
     * Creates new form MainLab
     */
    public MainLab() {
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

        jd_equipos = new javax.swing.JDialog();
        pn_crearequipos = new javax.swing.JPanel();
        lb_tituloCrear = new javax.swing.JLabel();
        lb_pais = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_ciudad = new javax.swing.JLabel();
        lb_estadio = new javax.swing.JLabel();
        bt_agregarEq = new javax.swing.JButton();
        tf_pais = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_ciudad = new javax.swing.JTextField();
        tf_estadio = new javax.swing.JTextField();
        jd_jugadores = new javax.swing.JDialog();
        pn_jugadores = new javax.swing.JPanel();
        lb_titulocrearJug = new javax.swing.JLabel();
        lb_nombreJug = new javax.swing.JLabel();
        lb_edad = new javax.swing.JLabel();
        lb_posicion = new javax.swing.JLabel();
        tf_nombreJug = new javax.swing.JTextField();
        sp_edad = new javax.swing.JSpinner();
        cb_posicion = new javax.swing.JComboBox<>();
        btn_crearJug = new javax.swing.JButton();
        jd_transferencias = new javax.swing.JDialog();
        pn_transferencias = new javax.swing.JPanel();
        lb_tituloTransferencias = new javax.swing.JLabel();
        lb_jug = new javax.swing.JLabel();
        lb_equipos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_equipos = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_jugadores = new javax.swing.JList<>();
        bt_transferencia = new javax.swing.JButton();
        pp_jugadores = new javax.swing.JPopupMenu();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        pn_principal = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        bt_equipos = new javax.swing.JButton();
        bt_jugadores = new javax.swing.JButton();
        bt_transferencias = new javax.swing.JButton();
        lb_titulo = new javax.swing.JLabel();
        lb_image = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menu_opciones = new javax.swing.JMenu();
        jmi_equipos = new javax.swing.JMenuItem();
        jmi_jugadores = new javax.swing.JMenuItem();
        jmi_transferencias = new javax.swing.JMenuItem();
        menu_ayuda = new javax.swing.JMenu();

        pn_crearequipos.setBackground(new java.awt.Color(153, 255, 153));

        lb_tituloCrear.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb_tituloCrear.setForeground(new java.awt.Color(0, 0, 0));
        lb_tituloCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tituloCrear.setText("Crear Equipos");

        lb_pais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_pais.setForeground(new java.awt.Color(0, 0, 153));
        lb_pais.setText("Pais del equipo");

        lb_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(0, 0, 153));
        lb_nombre.setText("Nombre del equipo");

        lb_ciudad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_ciudad.setForeground(new java.awt.Color(0, 0, 153));
        lb_ciudad.setText("Ciudad");

        lb_estadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_estadio.setForeground(new java.awt.Color(0, 0, 153));
        lb_estadio.setText("Estadio");

        bt_agregarEq.setText("Agregar");
        bt_agregarEq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarEqMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_crearequiposLayout = new javax.swing.GroupLayout(pn_crearequipos);
        pn_crearequipos.setLayout(pn_crearequiposLayout);
        pn_crearequiposLayout.setHorizontalGroup(
            pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_crearequiposLayout.createSequentialGroup()
                .addGroup(pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_crearequiposLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lb_tituloCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_crearequiposLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre)
                            .addComponent(lb_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_estadio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_pais, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tf_nombre)
                            .addComponent(tf_ciudad)
                            .addComponent(tf_estadio)))
                    .addGroup(pn_crearequiposLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(bt_agregarEq, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        pn_crearequiposLayout.setVerticalGroup(
            pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_crearequiposLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_tituloCrear)
                .addGap(31, 31, 31)
                .addGroup(pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pais)
                    .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ciudad)
                    .addComponent(tf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pn_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_estadio)
                    .addComponent(tf_estadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_agregarEq, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_equiposLayout = new javax.swing.GroupLayout(jd_equipos.getContentPane());
        jd_equipos.getContentPane().setLayout(jd_equiposLayout);
        jd_equiposLayout.setHorizontalGroup(
            jd_equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_equiposLayout.createSequentialGroup()
                .addComponent(pn_crearequipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_equiposLayout.setVerticalGroup(
            jd_equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_crearequipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_jugadores.setBackground(new java.awt.Color(0, 153, 153));

        lb_titulocrearJug.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb_titulocrearJug.setForeground(new java.awt.Color(0, 0, 0));
        lb_titulocrearJug.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulocrearJug.setText("Crear Jugadores");

        lb_nombreJug.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nombreJug.setForeground(new java.awt.Color(0, 0, 0));
        lb_nombreJug.setText("Nombre");

        lb_edad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_edad.setForeground(new java.awt.Color(0, 0, 0));
        lb_edad.setText("Edad");

        lb_posicion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_posicion.setForeground(new java.awt.Color(0, 0, 0));
        lb_posicion.setText("Posicion");

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));

        cb_posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero" }));

        btn_crearJug.setText("Agregar");
        btn_crearJug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearJugMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_jugadoresLayout = new javax.swing.GroupLayout(pn_jugadores);
        pn_jugadores.setLayout(pn_jugadoresLayout);
        pn_jugadoresLayout.setHorizontalGroup(
            pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_jugadoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nombreJug, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crearJug, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cb_posicion, 0, 301, Short.MAX_VALUE)
                        .addComponent(sp_edad)
                        .addComponent(tf_nombreJug)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_jugadoresLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(lb_titulocrearJug, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        pn_jugadoresLayout.setVerticalGroup(
            pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_jugadoresLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lb_titulocrearJug)
                .addGap(28, 28, 28)
                .addGroup(pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombreJug)
                    .addComponent(tf_nombreJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_edad)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pn_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_posicion)
                    .addComponent(cb_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btn_crearJug, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jd_jugadoresLayout = new javax.swing.GroupLayout(jd_jugadores.getContentPane());
        jd_jugadores.getContentPane().setLayout(jd_jugadoresLayout);
        jd_jugadoresLayout.setHorizontalGroup(
            jd_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jugadoresLayout.createSequentialGroup()
                .addComponent(pn_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_jugadoresLayout.setVerticalGroup(
            jd_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_jugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_transferencias.setBackground(new java.awt.Color(255, 153, 153));
        pn_transferencias.setForeground(new java.awt.Color(0, 0, 0));

        lb_tituloTransferencias.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb_tituloTransferencias.setForeground(new java.awt.Color(0, 0, 0));
        lb_tituloTransferencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tituloTransferencias.setText("Transferencias");

        lb_jug.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lb_jug.setForeground(new java.awt.Color(0, 0, 0));
        lb_jug.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_jug.setText("Jugadores");

        lb_equipos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lb_equipos.setForeground(new java.awt.Color(0, 0, 0));
        lb_equipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_equipos.setText("Equipos");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Equipos");
        jt_equipos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_equipos);

        jl_jugadores.setModel(new DefaultListModel());
        jl_jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_jugadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_jugadores);

        bt_transferencia.setText("Transferencia -->");

        javax.swing.GroupLayout pn_transferenciasLayout = new javax.swing.GroupLayout(pn_transferencias);
        pn_transferencias.setLayout(pn_transferenciasLayout);
        pn_transferenciasLayout.setHorizontalGroup(
            pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transferenciasLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lb_tituloTransferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_transferenciasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_transferenciasLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_transferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_jug, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_transferenciasLayout.createSequentialGroup()
                        .addComponent(lb_equipos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(29, 29, 29))
        );
        pn_transferenciasLayout.setVerticalGroup(
            pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transferenciasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lb_tituloTransferencias)
                .addGap(18, 18, 18)
                .addGroup(pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_jug)
                    .addComponent(lb_equipos))
                .addGroup(pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_transferenciasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(pn_transferenciasLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(bt_transferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_transferenciasLayout = new javax.swing.GroupLayout(jd_transferencias.getContentPane());
        jd_transferencias.getContentPane().setLayout(jd_transferenciasLayout);
        jd_transferenciasLayout.setHorizontalGroup(
            jd_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_transferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_transferenciasLayout.setVerticalGroup(
            jd_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_transferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jmi_modificar.setText("Modificar");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        pp_jugadores.add(jmi_modificar);

        jmi_eliminar.setText("Eliminar");
        pp_jugadores.add(jmi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principal.setBackground(new java.awt.Color(204, 204, 255));

        jToolBar1.setBackground(new java.awt.Color(153, 153, 255));
        jToolBar1.setRollover(true);

        bt_equipos.setBackground(new java.awt.Color(255, 51, 51));
        bt_equipos.setForeground(new java.awt.Color(0, 0, 0));
        bt_equipos.setText("Crear Equipos");
        bt_equipos.setFocusable(false);
        bt_equipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_equipos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_equiposMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_equipos);

        bt_jugadores.setBackground(new java.awt.Color(0, 0, 204));
        bt_jugadores.setText("Crear Jugadores");
        bt_jugadores.setFocusable(false);
        bt_jugadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_jugadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_jugadoresMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_jugadores);

        bt_transferencias.setBackground(new java.awt.Color(153, 255, 102));
        bt_transferencias.setForeground(new java.awt.Color(0, 0, 51));
        bt_transferencias.setText("Transferencias");
        bt_transferencias.setFocusable(false);
        bt_transferencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_transferencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_transferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_transferenciasMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_transferencias);

        lb_titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Bienvenido a Boroa League Fantasy");

        lb_image.setIcon(new javax.swing.ImageIcon("C:\\Users\\lfern\\OneDrive\\Imágenes\\futbol.jpg")); // NOI18N

        javax.swing.GroupLayout pn_principalLayout = new javax.swing.GroupLayout(pn_principal);
        pn_principal.setLayout(pn_principalLayout);
        pn_principalLayout.setHorizontalGroup(
            pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_principalLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_image, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(pn_principalLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_principalLayout.setVerticalGroup(
            pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_principalLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_image, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        getContentPane().add(pn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        menu_opciones.setText("Opciones");

        jmi_equipos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_equipos.setText("Crear Equipos");
        jmi_equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_equiposActionPerformed(evt);
            }
        });
        menu_opciones.add(jmi_equipos);

        jmi_jugadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_jugadores.setText("Crear Jugadores");
        jmi_jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_jugadoresActionPerformed(evt);
            }
        });
        menu_opciones.add(jmi_jugadores);

        jmi_transferencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_transferencias.setText("Transferencias");
        jmi_transferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_transferenciasActionPerformed(evt);
            }
        });
        menu_opciones.add(jmi_transferencias);

        jMenuBar2.add(menu_opciones);

        menu_ayuda.setText("Ayuda");
        jMenuBar2.add(menu_ayuda);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_equiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_equiposActionPerformed
        // TODO add your handling code here:
        abreCEquipo();
    }//GEN-LAST:event_jmi_equiposActionPerformed

    private void jmi_jugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_jugadoresActionPerformed
        // TODO add your handling code here:
        abreCJugador();
    }//GEN-LAST:event_jmi_jugadoresActionPerformed

    private void jmi_transferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_transferenciasActionPerformed
        // TODO add your handling code here:
        abreTrans();
    }//GEN-LAST:event_jmi_transferenciasActionPerformed

    private void bt_equiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_equiposMouseClicked
        // TODO add your handling code here:
        abreCEquipo();
    }//GEN-LAST:event_bt_equiposMouseClicked

    private void bt_jugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_jugadoresMouseClicked
        // TODO add your handling code here:
        abreCJugador();
    }//GEN-LAST:event_bt_jugadoresMouseClicked

    private void bt_transferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_transferenciasMouseClicked
        // TODO add your handling code here:
        abreTrans();
    }//GEN-LAST:event_bt_transferenciasMouseClicked

    private void btn_crearJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearJugMouseClicked
        // TODO add your handling code here:
        DefaultListModel m = (DefaultListModel) jl_jugadores.getModel();
        m.addElement(new Jugador(tf_nombreJug.getText(), (Integer)sp_edad.getValue(),(String) cb_posicion.getSelectedItem()));
        jl_jugadores.setModel(m);
        JOptionPane.showMessageDialog(jd_jugadores, "Se ha agregado exitosamente.");
        tf_nombreJug.setText("");
        sp_edad.setValue(15);
        cb_posicion.setSelectedItem("Portero");
    }//GEN-LAST:event_btn_crearJugMouseClicked

    private void bt_agregarEqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarEqMouseClicked
        // TODO add your handling code here:
        DefaultTreeModel m = (DefaultTreeModel)jt_equipos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)m.getRoot();
        
        String pais = tf_pais.getText();
        
        int centinela = -1;
        for (int i = 0; i < raiz.getChildCount(); i++) {
            if(raiz.getChildAt(i).toString().equals(pais)){
                DefaultMutableTreeNode nodo_equipo1;
                nodo_equipo1 = new DefaultMutableTreeNode(new Equipo(tf_nombre.getText(), tf_pais.getText(), tf_ciudad.getText(), tf_estadio.getText()));
                ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(nodo_equipo1);
                centinela = 1;
            }    
        }
        if(centinela == -1){
            DefaultMutableTreeNode nodo_pais;
            nodo_pais = new DefaultMutableTreeNode(tf_pais.getText());
            DefaultMutableTreeNode nodo_equipo;
            nodo_equipo = new DefaultMutableTreeNode(new Equipo(tf_nombre.getText(), tf_pais.getText(), tf_ciudad.getText(), tf_estadio.getText()));
            nodo_pais.add(nodo_equipo);
            raiz.add(nodo_pais);
        }
        m.reload();
        
        JOptionPane.showMessageDialog(jd_equipos, "Se ha agregado exitosamente.");
        tf_nombre.setText("");
        tf_pais.setText("");
        tf_ciudad.setText("");
        tf_estadio.setText("");
        
    }//GEN-LAST:event_bt_agregarEqMouseClicked

    private void jl_jugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_jugadoresMouseClicked
        // TODO add your handling code here:
        if(jl_jugadores.getSelectedIndex()>=0){
            if(evt.getButton()==3){
                pp_jugadores.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_jugadoresMouseClicked

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        // TODO add your handling code here:
        if(jl_jugadores.getSelectedIndex()>=0){
        DefaultListModel model = (DefaultListModel)jl_jugadores.getModel();
        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
        boolean estado;
        if(nombre.matches("[0-9]*")){
            estado = true;
            }else{
                estado = false;
            }
        while(estado == false){
                    nombre = JOptionPane.showInputDialog("No se permiten numeros. Ingrese el nombre: ");
                if(nombre.matches("[0-9]*")){
                    estado = true;
                }else{
                    estado = false;
                }
            }
        
        String edad = JOptionPane.showInputDialog("Ingrese la edad: ");
        
        boolean estado2;
            if(edad.matches("[0-9]*")){
                estado2 = true;
            }else{
                estado2 = false;
            }
            while(estado2 == false){
                    edad = JOptionPane.showInputDialog("No se permiten letras. Ingrese la edad: ");
                if(edad.matches("[0-9]*")){
                    estado2 = true;
                }else{
                    estado2 = false;
                }
            }
           int edad_final = Integer.parseInt(edad);
          ((Jugador)model.get(jl_jugadores.getSelectedIndex())).setNombreJugador(nombre);
          ((Jugador)model.get(jl_jugadores.getSelectedIndex())).setEdad(edad_final);
        }
    }//GEN-LAST:event_jmi_modificarActionPerformed
    
    
    public void abreCEquipo(){
        jd_equipos.pack();
        jd_equipos.setLocationRelativeTo(this);
        jd_equipos.setAlwaysOnTop(true);
        jd_equipos.setVisible(true);
    }
    public void abreCJugador(){
        jd_jugadores.pack();
        jd_jugadores.setLocationRelativeTo(this);
        jd_jugadores.setAlwaysOnTop(true);
        jd_jugadores.setVisible(true);
    }
    public void abreTrans(){
        jd_transferencias.pack();
        jd_transferencias.setLocationRelativeTo(this);
        jd_transferencias.setAlwaysOnTop(true);
        jd_transferencias.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarEq;
    private javax.swing.JButton bt_equipos;
    private javax.swing.JButton bt_jugadores;
    private javax.swing.JButton bt_transferencia;
    private javax.swing.JButton bt_transferencias;
    private javax.swing.JButton btn_crearJug;
    private javax.swing.JComboBox<String> cb_posicion;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_equipos;
    private javax.swing.JDialog jd_jugadores;
    private javax.swing.JDialog jd_transferencias;
    private javax.swing.JList<String> jl_jugadores;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_equipos;
    private javax.swing.JMenuItem jmi_jugadores;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JMenuItem jmi_transferencias;
    private javax.swing.JTree jt_equipos;
    private javax.swing.JLabel lb_ciudad;
    private javax.swing.JLabel lb_edad;
    private javax.swing.JLabel lb_equipos;
    private javax.swing.JLabel lb_estadio;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel lb_jug;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_nombreJug;
    private javax.swing.JLabel lb_pais;
    private javax.swing.JLabel lb_posicion;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_tituloCrear;
    private javax.swing.JLabel lb_tituloTransferencias;
    private javax.swing.JLabel lb_titulocrearJug;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_opciones;
    private javax.swing.JPanel pn_crearequipos;
    private javax.swing.JPanel pn_jugadores;
    private javax.swing.JPanel pn_principal;
    private javax.swing.JPanel pn_transferencias;
    private javax.swing.JPopupMenu pp_jugadores;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_estadio;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombreJug;
    private javax.swing.JTextField tf_pais;
    // End of variables declaration//GEN-END:variables
    DefaultMutableTreeNode nodo_seleccionado;
}
