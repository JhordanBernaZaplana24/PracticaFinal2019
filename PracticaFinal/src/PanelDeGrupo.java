import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;




public class PanelDeGrupo extends JPanel {
    private Usuario usuarioActual;
    JTextField nombreGrupo=new JTextField(10);
    JTextField numeroDiscosPublicados=new JTextField(10);
    JTextField numeroIntegrantes=new JTextField(10);
    JComboBox<GeneroMusical> generoMusicalJComboBox = new JComboBox<GeneroMusical>(GeneroMusical.values());

    PanelDeGrupo(Usuario usuarioActual){
        inicializa();
    }
    PanelDeGrupo(GrupoMusica miGrupo){
        inicializa();
        this.setGrupoMusica(miGrupo);
    }

    public void setGrupoMusica(GrupoMusica miGrupo) {
            this.nombreGrupo.setText(miGrupo.getNombreGrupo());
            this.numeroDiscosPublicados.setText(""+miGrupo.getNumeroDiscosPublicados());
        this.numeroDiscosPublicados.setCaretPosition(0);
        this.numeroIntegrantes.setText(""+miGrupo.getNumeroIntegrantes());
        //Tengo que meter la scroll-bar del enum

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

    private void inicializa() {
        List<Component> ponerVisible= new ArrayList<>();
        ponerVisible.add(new JLabel("Nombre del Grupo"));
        ponerVisible.add(nombreGrupo);
        ponerVisible.add(new JLabel("Número de integrantes"));
        ponerVisible.add(numeroIntegrantes);
        ponerVisible.add(new JLabel("Numero de discos: "));
        ponerVisible.add(numeroDiscosPublicados);
        numeroDiscosPublicados.setCaretPosition(0);

        for (Component c :
                ponerVisible) {
            add(c);
        }
        setLayout(new GridLayout(0,2));
        setBorder(BorderFactory.createTitledBorder("GRUPO MUSICAL"));
        setVisible(true);
    }
    public void vaciarPanel(){
        this.nombreGrupo.setText("");
        this.numeroDiscosPublicados.setText("");
        this.numeroIntegrantes.setText("");
    }
    public static void main(String[] args) {
        JFrame miframe=new JFrame("GRUPO");
        miframe.setLayout(new GridLayout(0,1));
        PanelDeGrupo panelGrupo=new PanelDeGrupo(new GrupoMusica("ABBA",5,4));
        miframe.add(panelGrupo);
        JButton crear=new JButton("Crear");
        miframe.add(crear);
        crear.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(panelGrupo.getGrupoMusica().info());
            }
        });
        miframe.setLocationRelativeTo(null);
        miframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miframe.pack();
        miframe.setVisible(true);
    }
}


