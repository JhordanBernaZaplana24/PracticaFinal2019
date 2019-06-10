import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ListaGruposUsuario extends JDialog {

    ListaGrupos lista = new ListaGrupos();
    JButton anyadir = new JButton("Añadir grupo");
    JButton ver = new JButton("Ver lista");
    JButton guardar = new JButton("Guardar lista");

    ListaGruposUsuario() {
        lista.existeFichero(VentanaUsuarios.getDatosLeidos());
        JOptionPane.showMessageDialog(null, lista.muestraTodos());
        setLayout(new GridLayout(0, 2));
        add(anyadir);
        add(ver);
        add(guardar);

        anyadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lista.anyadeGrupo();
            }
        });
        ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, lista.muestraTodos());
            }
        });
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    lista.guardaListaFichero(VentanaUsuarios.getDatosLeidos());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        pack();
        setVisible(true);

    }
}