import javax.swing.*;
import java.awt.*;

public abstract class PanelDeGrupo extends JPanel {
    private JLabel generoGrupo  = new JLabel("Genero del grupo: ");
    private JFormattedTextField generoG = new JFormattedTextField("");
    private JLabel nombreGrupo = new JLabel("Nombre del grupo: ");
    private JFormattedTextField nombreG = new JFormattedTextField("");
    private JLabel discosPublicadosDelGrupo = new JLabel("Discos publicados del grupo: ");
    private JFormattedTextField discosPublicadosG = new JFormattedTextField("");
    private JLabel integrantesGrupo = new JLabel("Número de integrantes del grupo: ");
    private JFormattedTextField integrantesG = new JFormattedTextField("");
    protected JPanel panelEtiquetas = new JPanel();

    PanelDeGrupo(){
        panelEtiquetas.setLayout(new GridLayout(0,2));
        panelEtiquetas.add(generoGrupo);
        panelEtiquetas.add(generoG);
        panelEtiquetas.add(nombreGrupo);
        panelEtiquetas.add(nombreG);
        panelEtiquetas.add(discosPublicadosDelGrupo);
        panelEtiquetas.add(discosPublicadosG);
        panelEtiquetas.add(integrantesGrupo);
        panelEtiquetas.add(integrantesG);
        setLayout(new BorderLayout());
        add(panelEtiquetas,BorderLayout.CENTER);
    }

    public JFormattedTextField getGeneroG(){
        return this.generoG;
    }
    public JFormattedTextField getNombreG(){
        return this.nombreG;
    }
    public JFormattedTextField getDiscosPublicadosG(){
        return this.discosPublicadosG;
    }
    public JFormattedTextField getIntegrantesG(){
        return this.integrantesG;
    }

}