import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;



public class PanelDeGrupo extends JPanel {
    public static final Font FUENTE_ARIAL_GRANDE = new Font("Arial", Font.ITALIC, 18);
    JTextField nombreGrupo=new JTextField(10);
    JTextField numeroDiscosPublicados=new JTextField(10);
    JTextField numeroIntegrantes=new JTextField(10);

    private void fuenteParaPoner(List<Component> ponerVisible, Font fuente) {
        for (Component c :
             ponerVisible) {
            c.setFont(fuente);
        }
    }

    PanelDeGrupo(){
        inicializar();
    }
    PanelDeGrupo(GrupoMusica miGrupo){
        inicializar();
        this.setGrupoMusica(miGrupo);
    }

    private void setGrupoMusica(GrupoMusica miGrupo) {
            this.nombreGrupo.setText(miGrupo.getNombreGrupo());
            this.numeroDiscosPublicados.setText(""+miGrupo.getNumeroDiscosPublicados());
        numeroDiscosPublicados.setCaretPosition(0);
        this.numeroIntegrantes.setText(""+miGrupo.getNumeroIntegrantes());
    }
    public GrupoMusica getGrupoMusica(){

        try {
            GrupoMusica salida = new GrupoMusica(
                    nombreGrupo.getText(),
                    Integer.parseInt(numeroDiscosPublicados.getText()),
                    Integer.parseInt(numeroIntegrantes.getText()));
            return salida;
        } catch (IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null,iae.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    private void inicializar() {
        List<Component> ponerVisible= new ArrayList<>();
        ponerVisible.add(new JLabel("Nombre del Grupo"));
        ponerVisible.add(nombreGrupo);
        ponerVisible.add(new JLabel("Número de integrantes"));
        ponerVisible.add(numeroIntegrantes);
        ponerVisible.add(new JLabel("Numero de discos: "));
        ponerVisible.add(numeroDiscosPublicados);
        numeroDiscosPublicados.setCaretPosition(0);
        ponerVisible.add(new JLabel("Genero: "));
        for (Component c :
                ponerVisible) {
            add(c);
        }
        fuenteParaPoner(ponerVisible, FUENTE_ARIAL_GRANDE);
        setLayout(new GridLayout(0,2));
        setBorder(BorderFactory.createTitledBorder("GRUPO MUSICAL"));
    }
    public GrupoMusica getGrupo(){

        try {
            GrupoMusica salida = new GrupoMusica(
                    nombreGrupo.getText(),
                    Integer.parseInt(numeroDiscosPublicados.getText()),
                    Integer.parseInt(numeroIntegrantes.getText()));
            return salida;
        } catch (IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null,iae.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}

