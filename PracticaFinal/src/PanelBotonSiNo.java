import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class PanelBotonSiNo extends JPanel{
    JButton aceptar=new JButton("Aceptar");
    JButton cancelar=new JButton("Cancelar");

    PanelBotonSiNo(){
        setLayout(new GridLayout(1,2));
        add(aceptar);
        aceptar.addActionListener(aceptar());
        add(cancelar);
        cancelar.addActionListener(cancelar());
    }

    public abstract ActionListener aceptar();
    public abstract ActionListener cancelar();
}