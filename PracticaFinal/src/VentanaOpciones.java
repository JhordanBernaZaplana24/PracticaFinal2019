import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaOpciones extends JDialog {
    private ListaGrupos lista = new ListaGrupos();
    private String tipoGrupo = lista.tipoGrupo();
    JButton creaGrupo = new JButton("Añadir grupo");
    private GrupoMusica g;

    VentanaOpciones(){
        setLayout(new BorderLayout());
        if (tipoGrupo.equals("BANDA")){
            setTitle("Panel de banda");
            PanelBanda panel = new PanelBanda();
            add(panel, BorderLayout.CENTER);
            creaGrupo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try{
                        String genero = panel.getGeneroG().getText();
                        String nombre = panel.getNombreG().getText();
                        int discosPublicados = Integer.parseInt(panel.getDiscosPublicadosG().getText());
                        int numeroIntegrantes = Integer.parseInt(panel.getIntegrantesG().getText());
                        dispose();
                    }catch (NullPointerException npe){
                        JOptionPane.showMessageDialog(null,"ERROR. Uno o más campos están vacios.");
                    }catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Introduce un precio válido");
                    }
                }
            });
            add(creaGrupo,BorderLayout.SOUTH);
        }else{
            setTitle("Panel de duo");
            PanelDuo panel = new PanelDuo();
            add(panel,BorderLayout.CENTER);
            creaGrupo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try{
                        String nombreDuo = panel.getNombreG().getText();
                        String nombre = panel.getNombreG().getText();
                        int discosPublicados = Integer.parseInt(panel.getDiscosPublicadosG().getText());
                        dispose();
                    }catch (NullPointerException npe){
                        JOptionPane.showMessageDialog(null,"ERROR. Uno o más campos están vacios.");
                    }catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Introduce un precio válido");
                    }
                }
            });
            add(creaGrupo,BorderLayout.SOUTH);
        }
        setModal(true);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public GrupoMusica getGrupoMusica(){
        return g;
    }
}