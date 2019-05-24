import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal extends JPanel {
    public static void main(String[] args) {
        JFrame miFrame=new JFrame("Inicio.");
        miFrame.setLayout(new FlowLayout());
        JTextField usuario= new JTextField(20);
        JLabel textoInicial = new JLabel("Pasa la tarjeta por el lector.");
        JButton registrarse =new JButton("¿No tienes cuenta? Registrate.");
        JButton inicio =new JButton("Inicia sesión.");

        miFrame.add(textoInicial);
        miFrame.add(usuario);
        miFrame.add(inicio);
        miFrame.add(registrarse);
        miFrame.setVisible(true);
        miFrame.setLocationRelativeTo(null);
        miFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miFrame.pack();
        miFrame.setLocationRelativeTo(null);
        miFrame.setResizable(false);
        miFrame.setSize(300,200);


        usuario.setText("");
        usuario.setEditable(true);
        usuario.setHorizontalAlignment(JTextField.LEFT);

        registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame registro = new JFrame("Registrate.");
                JButton botoncrearCuenta = new JButton("Crear mi cuenta.");
                JButton botonSinMas = new JButton("<---------   :) ");
                registro.setLayout(new GridLayout(0,2));
                JLabel nombre = new JLabel("Nombre : ");
                JTextField campoNombre = new JTextField(30);
                JLabel apellidos = new JLabel("Apellidos : ");
                JTextField campoApellidos = new JTextField(30);
                JLabel correo = new JLabel("Correo electronico : ");
                JTextField campoCorreo = new JTextField(30);
                JLabel fechaNacimiento = new JLabel("Fecha de nacimiento(dd/mm/yy) : ");
                JTextField campoFechaNacimiento = new JTextField(30);
                registro.setVisible(true);
                registro.add(nombre);
                registro.add(campoNombre);
                registro.add(apellidos);
                registro.add(campoApellidos);
                registro.add(correo);
                registro.add(campoCorreo);
                registro.add(fechaNacimiento);
                registro.add(campoFechaNacimiento);
                registro.add(botoncrearCuenta);
                registro.add(botonSinMas);
                registro.setLocationRelativeTo(null);
                registro.setSize(400,300);
                registro.setResizable(false);
//                String [] usuario = new String[4];
//                usuario[0] =
//                usuario[1]
//                usuario[2]
//                usuario[3]
            }
        });
    }
}
