import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal extends JPanel {
    public static void main(String[] args) {
        JFrame miFrame=new JFrame("Inicio.");
        miFrame.setLayout(new FlowLayout());
        JTextField usuario= new JTextField(20);
        JLabel textoInicial = new JLabel("Escriba su nombre.");
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
    //AÑADIR FUNCION BOTON INICIO
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JFrame panelPrincipalGrupos = new JFrame("Elija la opción que desee.");
            panelPrincipalGrupos.setLayout(new GridLayout(0,2));
            JButton botonAnyadir = new JButton("Añadir grupo");
            JButton botonEliminar = new JButton("Eliminar grupo");
            JButton botonMostrar = new JButton("Mostrar los grupos añadidos");
            panelPrincipalGrupos.setVisible(true);
            panelPrincipalGrupos.add(botonAnyadir);
            panelPrincipalGrupos.add(botonEliminar);
            panelPrincipalGrupos.add(botonMostrar);
            panelPrincipalGrupos.setLocationRelativeTo(null);
            panelPrincipalGrupos.setSize(400,300);
            panelPrincipalGrupos.setResizable(false);
            }
        });

        registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame registro = new JFrame("Registrate.");
                JButton botoncrearCuenta = new JButton("Crear mi cuenta.");
                JButton botonSinMas = new JButton("<---------   :) ");
                registro.setLayout(new GridLayout(0,2));
                JLabel nombre = new JLabel("Nombre : ");
                nombre.setHorizontalAlignment(JTextField.CENTER);
                JTextField campoNombre = new JTextField(30);
                campoNombre.setHorizontalAlignment(JTextField.CENTER);
                JLabel apellidos = new JLabel("Apellidos : ");
                apellidos.setHorizontalAlignment(JTextField.CENTER);
                JTextField campoApellidos = new JTextField(30);
                campoApellidos.setHorizontalAlignment(JTextField.CENTER);
                JLabel correo = new JLabel("Correo electronico : ");
                correo.setHorizontalAlignment(JTextField.CENTER);
                JTextField campoCorreo = new JTextField(30);
                campoCorreo.setHorizontalAlignment(JTextField.CENTER);
                JLabel fechaNacimiento = new JLabel("Fecha de nacimiento(dd/mm/yy) : ");
                fechaNacimiento.setHorizontalAlignment(JTextField.CENTER);
                JTextField campoFechaNacimiento = new JTextField(30);
                campoFechaNacimiento.setHorizontalAlignment(JTextField.CENTER);
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
                    botoncrearCuenta.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                try{
                                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Usuarios.txt"),true));
                                    bw.write((campoNombre.getText()+" "+campoApellidos.getText()+" "+campoCorreo.getText()+" "+campoFechaNacimiento.getText()+"\n"));
                                    bw.close();{
                                    }
                                    } catch (IOException e1) {
                                    e1.printStackTrace();
                                }
                                registro.dispose();
                            }
                    });
            }
        });
    }
}
