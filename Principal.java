import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miVacaciones, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
      labelDepartamento, labelAntiguedad, labelResultado, labelFooter, label21, label19, labelCorazon, labelFuego;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombreAdministrador = "";

  public Principal() {
    setLayout(null);
    // setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Principal");
    getContentPane().setBackground(new Color(4, 33, 93));
    setIconImage(new ImageIcon(getClass().getResource("images/megavision-logo.png")).getImage());
    Bienvenida ventanaprincipal = new Bienvenida();
    nombreAdministrador = ventanaprincipal.texto;

    mb = new JMenuBar();
    mb.setBackground(new Color(4, 33, 93)); // Barra Que Contiene los Menú
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones"); // Menú Opciones
    menuOpciones.setBackground(new Color(4, 33, 93));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(255, 255, 255));
    mb.add(menuOpciones);

    menuColorFondo = new JMenu("Color de fondo");
    menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorFondo.setForeground(new Color(4, 33, 93));
    menuOpciones.add(menuColorFondo);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono", 1, 14));
    miRojo.setForeground(new Color(4, 33, 93));
    miRojo.addActionListener(this);
    menuColorFondo.add(miRojo);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono", 1, 14));
    miNegro.setForeground(new Color(4, 33, 93));
    miNegro.addActionListener(this);
    menuColorFondo.add(miNegro);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono", 1, 14));
    miMorado.setForeground(new Color(4, 33, 93));
    miMorado.addActionListener(this);
    menuColorFondo.add(miMorado);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 14));
    miNuevo.setForeground(new Color(4, 33, 93));
    miNuevo.addActionListener(this);
    menuOpciones.add(miNuevo);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(4, 33, 93));
    miSalir.addActionListener(this);
    menuOpciones.add(miSalir);

    menuCalcular = new JMenu("Calcular"); // Menu Calcular
    menuCalcular.setBackground(new Color(4, 33, 93));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(255, 255, 255));
    mb.add(menuCalcular);

    miVacaciones = new JMenuItem("Vacaciones");
    miVacaciones.setFont(new Font("Andale Mono", 1, 14));
    miVacaciones.setForeground(new Color(4, 33, 93));
    miVacaciones.addActionListener(this);
    menuCalcular.add(miVacaciones);

    menuAcercaDe = new JMenu("Acerca de"); // Menu Acerca De
    menuAcercaDe.setBackground(new Color(4, 33, 93));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
    menuAcercaDe.setForeground(new Color(255, 255, 255));
    mb.add(menuAcercaDe);

    miElCreador = new JMenuItem("El Creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 14));
    miElCreador.setForeground(new Color(4, 33, 93));
    miElCreador.addActionListener(this);
    menuAcercaDe.add(miElCreador);

    ImageIcon imagen = new ImageIcon("images/fondo-coca.jpg"); // Label Imagen Coca-Cola
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5, 10, 240, 80);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador); // label Bienvenida
    labelBienvenido.setBounds(227, 10, 600, 70);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 30));
    labelBienvenido.setForeground(new Color(255, 255, 255));
    add(labelBienvenido);

    labelTitle = new JLabel("DATOS DEL TRABAJADOR PARA EL CALCULO DE VACACIONES"); // Titulo
    labelTitle.setBounds(25, 100, 600, 80);
    labelTitle.setFont(new Font("Andale Mono", 1, 15));
    labelTitle.setForeground(new Color(255, 255, 255));
    add(labelTitle);

    labelNombre = new JLabel("Nombre Completo:"); // Nombre Trabajador
    labelNombre.setBounds(10, 170, 100, 30);
    labelNombre.setFont(new Font("Andale Mono", 1, 10));
    labelNombre.setForeground(new Color(255, 255, 255));
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(10, 200, 120, 20);
    txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
    txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 10));
    txtNombreTrabajador.setForeground(new java.awt.Color(4, 33, 93));
    add(txtNombreTrabajador);

    labelAPaterno = new JLabel("Apellido Paterno:"); // Apellido Paterno
    labelAPaterno.setBounds(10, 220, 100, 30);
    labelAPaterno.setFont(new Font("Andale Mono", 1, 10));
    labelAPaterno.setForeground(new Color(255, 255, 255));
    add(labelAPaterno);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(10, 250, 120, 20);
    txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
    txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 10));
    txtAPaternoTrabajador.setForeground(new java.awt.Color(4, 33, 93));
    add(txtAPaternoTrabajador);

    labelAMaterno = new JLabel("Apellido Materno:"); // Apellido Materno
    labelAMaterno.setBounds(10, 270, 100, 30);
    labelAMaterno.setFont(new Font("Andale Mono", 1, 10));
    labelAMaterno.setForeground(new Color(255, 255, 255));
    add(labelAMaterno);

    txtAMaternoTrabajador = new JTextField();
    txtAMaternoTrabajador.setBounds(10, 300, 120, 20);
    txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
    txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 10));
    txtAMaternoTrabajador.setForeground(new java.awt.Color(4, 33, 93));
    add(txtAMaternoTrabajador);

    labelDepartamento = new JLabel("Selecciona el Departamento:"); // Seleccion Departamento
    labelDepartamento.setBounds(170, 170, 150, 30);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 10));
    labelDepartamento.setForeground(new Color(255, 255, 255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(170, 200, 180, 20);
    comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
    comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 10));
    comboDepartamento.setForeground(new java.awt.Color(4, 33, 93));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atencion al Cliente");
    comboDepartamento.addItem("Departamento de Logística");
    comboDepartamento.addItem("Departamento de Gerencia");

    labelAntiguedad = new JLabel("Selecciona la Antigüedad:"); // Seleccion Antiguedad
    labelAntiguedad.setBounds(170, 220, 150, 30);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 10));
    labelAntiguedad.setForeground(new Color(255, 255, 255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(170, 250, 180, 20);
    comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
    comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 10));
    comboAntiguedad.setForeground(new java.awt.Color(4, 33, 93));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de Servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años o mas de servicio");

    labelResultado = new JLabel("Resultado del Cálculo:"); // Muestra Resultado
    labelResultado.setBounds(170, 270, 150, 30);
    labelResultado.setFont(new Font("Andale Mono", 1, 10));
    labelResultado.setForeground(new Color(255, 255, 255));
    add(labelResultado);

    textarea1 = new JTextArea("   \n\n Resultado Cálculo");
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 1, 10));
    textarea1.setForeground(new Color(4, 33, 93));
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(170, 300, 300, 140);
    add(scrollpane1);

    labelFooter = new JLabel("©2023 Grupo Megavisión | Derechos Reservados");
    labelFooter.setBounds(270, 580, 400, 30);
    labelFooter.setFont(new Font("Andale Mono", 1, 10));
    labelFooter.setForeground(new Color(255, 255, 255));
    add(labelFooter);

    ImageIcon imagen21 = new ImageIcon("images/canal-21.png");
    label21 = new JLabel(imagen21);
    label21.setBounds(20, 500, 100, 100);
    add(label21);

  }

  public void actionPerformed(ActionEvent e) { // Boton Calcular
    if (e.getSource() == miVacaciones) {

      String nombreTrabajador = txtNombreTrabajador.getText();
      String AP = txtAPaternoTrabajador.getText();
      String AM = txtAMaternoTrabajador.getText();
      String Departamento = comboDepartamento.getSelectedItem().toString();
      String Antiguedad = comboAntiguedad.getSelectedItem().toString();

      if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
          Departamento.equals("") || Antiguedad.equals("")) {

        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
      } else {

        if (Departamento.equals("Atencion al Cliente")) {

          if (Antiguedad.equals("1 año de Servicio")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 6 días de Vacaciones.");
          }
          if (Antiguedad.equals("2 a 6 años de servicios")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien Labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 14 días de vacaciones.");
          }
          if (Antiguedad.equals("7 años o mas de servicio")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 20 días de vacaciones.");
          }
        }
        if (Departamento.equals("Departamento de Logística")) {

          if (Antiguedad.equals("1 año de Servicio")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 7 días de Vacaciones.");
          }
          if (Antiguedad.equals("2 a 6 años de servicios")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien Labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 15 días de vacaciones.");
          }
          if (Antiguedad.equals("7 años o mas de servicio")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 22 días de vacaciones.");
          }
        }
        if (Departamento.equals("Departamento de Gerencia")) {

          if (Antiguedad.equals("1 año de Servicio")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 10 días de Vacaciones.");
          }
          if (Antiguedad.equals("2 a 6 años de servicios")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien Labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 20 días de vacaciones.");
          }
          if (Antiguedad.equals("7 años o mas de servicio")) {
            textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 30 días de vacaciones.");
          }
        }
      }
    }
    if (e.getSource() == miRojo) {
      getContentPane().setBackground(new Color(4, 33, 93));
    }
    if (e.getSource() == miNegro) {
      getContentPane().setBackground(new Color(0, 0, 0));
    }
    if (e.getSource() == miMorado) {
      getContentPane().setBackground(new Color(51, 0, 51));
    }
    if (e.getSource() == miNuevo) {
      txtNombreTrabajador.setText("");
      txtAPaternoTrabajador.setText("");
      txtAMaternoTrabajador.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      textarea1.setText("   \n\n Resultado del Cálculo");

    }
    if (e.getSource() == miSalir) {

      Bienvenida ventanabienvenida = new Bienvenida();
      ventanabienvenida.setBounds(0, 0, 350, 500);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      ventanabienvenida.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if (e.getSource() == miElCreador) {

      JOptionPane.showMessageDialog(null, "Desarrollado por:  Ing.Fredy_Bonilla \n" +
          "Contacto: jfbonilla7714@gmail.com \n" +
          "	instagram/fredy_bonilla99 \n" +
          "facebook/FreddyBLovo ");
    }
  }

  public static void main(String[] args) {
    Principal ventanaprincipal = new Principal();
    ventanaprincipal.setBounds(0, 0, 800, 700);
    ventanaprincipal.setVisible(true);
    ventanaprincipal.setResizable(false);
    ventanaprincipal.setLocationRelativeTo(null);
  }
}
