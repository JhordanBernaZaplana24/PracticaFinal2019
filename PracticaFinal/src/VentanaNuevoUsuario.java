import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class VentanaNuevoUsuario extends JDialog {
    PanelCrearUsuario panel = new PanelCrearUsuario();
    ListaUsuarios lista = new ListaUsuarios();
    JButton anyadir = new JButton("Añadir usuario");

    VentanaNuevoUsuario(){
        setTitle("Añadir nuevo usuario");
        setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);
        add(anyadir, BorderLayout.SOUTH);
        anyadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lista.anyadeUsuario(VentanaUsuarios.getDatosLeidos(),panel.getNombreU().getText(),panel.getApellidosU().getText(),panel.getEmailU().getText());
                dispose();
                ListaGruposUsuario l = new ListaGruposUsuario();
            }
        });
        pack();
        setVisible(true);
    }
}



class PanelFecha extends JDialog{
    JDialog panelFecha;
    private JTextField dia=new JTextField();
    private JTextField mes=new JTextField();
    private JTextField anyo=new JTextField();
    PanelFecha(){
        panelFecha=this;
        setLayout(new GridLayout(1,6));
        evitaLetras(dia);
        evitaLetras(mes);
        evitaLetras(anyo);
        add(dia);
        add(new JLabel("/"));
        add(mes);
        add(new JLabel("/"));
        add(anyo);

    }
    public String getFecha(){
        return dia.getText()+"/"+mes.getText()+"/"+anyo.getText();
    }

    private static  void evitaLetras(JTextField textField){
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char entrada=e.getKeyChar();
                if(entrada<'0' || entrada>'9' ){
                    e.consume();
                }

            }
        });
    }
}