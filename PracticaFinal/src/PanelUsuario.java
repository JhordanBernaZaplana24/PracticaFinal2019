import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelUsuario extends JDialog {
    private Usuario usuarioActual;
    private PanelIdentificacionUsuario panelIntroduccionUsuario =new PanelIdentificacionUsuario();
    private CrearNuevoUsuario panelNuevoUsuario=new CrearNuevoUsuario();
    private ListaDeUsuario listaDeUsuario=new ListaDeUsuario();
    private PanelBotonSiNo siYNo= new PanelBotonSiNo() {
        @Override
        public ActionListener aceptar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!numeroDeIdentificacionValido(panelIntroduccionUsuario.getNumeroUsuario())){
                        JOptionPane.showMessageDialog(null,"El número de usuario ha de ser de "+ Usuario.CANTIDAD_DE_NUMEROS_IDENTIFICACION+" números.","Error",JOptionPane.ERROR_MESSAGE);
                    } else if(!listaDeUsuario.estaElUsuario(panelIntroduccionUsuario.getNumeroUsuario())){
                        nuevoUsuario();
                    }else{
                        usuarioActual=listaDeUsuario.elegirUsuario(panelIntroduccionUsuario.getNumeroUsuario());
                        dispose();
                    }

                }
            };
        }
        private void nuevoUsuario(){
            PanelUsuario.this.remove(panelIntroduccionUsuario);
            setTitle("Nuevo Usuario");
            PanelUsuario.this.add(panelNuevoUsuario, BorderLayout.CENTER);
            setVisible(false);
            PanelUsuario.this.remove(siYNo);
            siYNo=new PanelBotonSiNo() {
                @Override
                public ActionListener aceptar() {
                    return new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try{
                                usuarioActual=new Usuario(panelIntroduccionUsuario.getNumeroUsuario(),
                                        panelNuevoUsuario.getNombre(),
                                        panelNuevoUsuario.getApellidos(),
                                        panelNuevoUsuario.getCorreoElectronico(),
                                        panelNuevoUsuario.getFechaDeNacimiento());
                                listaDeUsuario.anyadirUsuario(usuarioActual);
                                listaDeUsuario.escribir();
                                dispose();
                            }catch (IllegalArgumentException iae){
                                JOptionPane.showMessageDialog(null,iae.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    };

                }

                @Override
                public ActionListener cancelar() {
                    return new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dispose();
                        }
                    };
                }
            };
            PanelUsuario.this.add(siYNo, BorderLayout.SOUTH);

            setVisible(true);
        }

        @Override
        public ActionListener cancelar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            };
        }
    };

    PanelUsuario(){
        setModal(true);
        setTitle("Usuario");
        setLayout(new BorderLayout());
        setBounds(0,0,400,125);
        add(panelIntroduccionUsuario,BorderLayout.CENTER);
        add(siYNo,BorderLayout.SOUTH);

        setModal(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    private static boolean numeroDeIdentificacionValido(String numeroDeValidacion){
        return numeroDeValidacion.length()==Usuario.CANTIDAD_DE_NUMEROS_IDENTIFICACION;
    }

    public Usuario getUsuario() {
        return usuarioActual;
    }
}