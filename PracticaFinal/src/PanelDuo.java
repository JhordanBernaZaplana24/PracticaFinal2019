import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDuo extends PanelDeGrupo {

    Duo d;
    JLabel nombreDuo = new JLabel("Nombre del Duo: ");
    JFormattedTextField nombreD = new JFormattedTextField();
    JLabel nombreCantante1 = new JLabel("Nombre del primer cantante: ");
    JFormattedTextField nombreCantanteD1 = new JFormattedTextField();
    JLabel nombreCantante2 = new JLabel("Nombre del segundo cantante: ");
    JFormattedTextField nombreCantanteD2 = new JFormattedTextField();

    PanelDuo(){
        panelEtiquetas.add(nombreD);
        panelEtiquetas.add(nombreCantanteD1);
        panelEtiquetas.add(nombreCantanteD2);
    }

}