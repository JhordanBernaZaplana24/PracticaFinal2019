import javax.swing.*;

public class PanelBanda extends PanelDeGrupo {

    Banda b;
    JLabel nombreBanda = new JLabel("Nombre Banda: ");
    JLabel nombreCantante = new JLabel("Nombre Cantante: ");
    JLabel numeroIntegrantes = new JLabel("Numero Integrantes: ");
    JTextField nombreB = new JTextField();
    JTextField nombreCantanteB = new JTextField();
    JTextField numeroIntegrantesB = new JTextField();

    PanelBanda(){
        panelEtiquetas.add(nombreB);
        panelEtiquetas.add(nombreCantanteB);
        panelEtiquetas.add(numeroIntegrantesB);
    }

}