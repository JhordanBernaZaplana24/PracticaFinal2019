import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaUsuarios extends JFrame {
    private JLabel usuario= new JLabel("Introduce el nombre de usuario: ");
    private JTextField nombre=new JTextField("");
    private static String datosLeidos;
    ListaUsuarios lista = new ListaUsuarios();

    VentanaUsuarios(){
        datosLeidos="";
        setTitle("Inicio");
        setLayout(new GridLayout(0,1));
        add(usuario);
        add(nombre);
        nombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                pulsacion(e);
            }
        });
        dispose();
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static String getDatosLeidos() {
        return datosLeidos;
    }

    private void pulsacion(KeyEvent e) {

        this.datosLeidos+=e.getKeyChar();
        if (this.datosLeidos.length()==10){
            setVisible(false);
            if (lista.compruebaLista(this.datosLeidos)==false){
                VentanaNuevoUsuario v = new VentanaNuevoUsuario();
            }else{
                ListaGruposUsuario l = new ListaGruposUsuario();
            }
        }
    }

}