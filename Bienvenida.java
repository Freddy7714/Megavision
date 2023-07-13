import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JLabel label1, label2, label3, label4;
  private JTextField textfield1;
  private JButton boton1;
  public static String texto = "";

  public Bienvenida(){
    setLayout(null);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(4,33,93));
    setIconImage(new ImageIcon(getClass().getResource("images/megavision-logo.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/gmv.jfif");
    label1 = new JLabel(imagen);
    label1.setBounds(160,100,600,200);
    add(label1);

    label2 = new JLabel("Sistema de Control Vacacional");
    label2.setBounds(35,100,300,30);
    label2.setFont(new Font("Andale Mono", 2, 19));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese Su Nombre");
    label3.setBounds(45,180,200,30);
    label3.setFont(new Font("Andale Mono", 1, 12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("©2023 Grupo Megavisión");
    label4.setBounds(190,340,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField();
    textfield1.setBounds(45,210,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono", 1, 14));
    textfield1.setForeground(new Color(4,33,93));
    add(textfield1);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(125,250,100,30);
    boton1.setForeground(new Color(4,33,93));
    boton1.setFont(new Font("Andale Mono", 1, 14));
    boton1.addActionListener(this);
    add(boton1);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      texto = textfield1.getText().trim();
    
    if(texto.equals("")){
      JOptionPane.showMessageDialog(null, "Ingrese su contraseña");
    }else{
    	Licencia ventanalicencia = new Licencia();
    	ventanalicencia.setBounds(0,0,610,365);
    	ventanalicencia.setVisible(true);
    	ventanalicencia.setResizable(false);
    	ventanalicencia.setLocationRelativeTo(null);
    }
  }
}
  public static void main(String []args){

    Bienvenida ventanabienvenida = new Bienvenida();
    ventanabienvenida.setBounds(0,0,630,420);
    ventanabienvenida.setVisible(true);
    ventanabienvenida.setResizable(false);
    ventanabienvenida.setLocationRelativeTo(null);

  }
}






