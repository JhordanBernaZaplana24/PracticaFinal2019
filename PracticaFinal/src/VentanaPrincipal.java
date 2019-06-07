import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    Usuario usuarioActual;
    PanelUsuario pedirUsuario;
    PanelDeGrupo panelDelUsuarioAcutal;
    JButton salir = new JButton("Salir");

    VentanaPrincipal() {
        setBounds(0, 0, 500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        pedirUsuario = new PanelUsuario();
        usuarioActual = pedirUsuario.getUsuario();
        panelDelUsuarioAcutal = new PanelDeGrupo(usuarioActual);
        add(panelDelUsuarioAcutal);
        try {
            panelDelUsuarioAcutal = new PanelDeGrupo(pedirUsuario.getUsuario());
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "No se ha introducido ningún usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
        setVisible(true);

    }




}