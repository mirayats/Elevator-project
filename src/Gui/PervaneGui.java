package Gui;

import Logic.ButtonActions;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PervaneGui {
    ButtonActions PG = new ButtonActions();
    JPanel jp = null;
    JButton pervane = null;
    ButtonActions actions =null;
    public PervaneGui() {

        getJp().add(getPervane());
        actions =  new ButtonActions();
    }

    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setBounds(5, 210, 250, 200);
            jp.setLayout(null);
            //jp.setBackground(Color.BLUE);
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }

    public JButton getPervane() {
        if (pervane == null) {
            pervane = new JButton();
            pervane.setName("Pervane");
            pervane.addActionListener(actions);
            pervane.setBackground(Color.white);
            pervane.setBounds(25, 15, 190, 200);
            Icon pervaneb = new ImageIcon(getClass().getResource("fan.jpg"));
            pervane.setIcon(pervaneb);
            pervane.setName("PG");
            pervane.addActionListener(PG);

        }
        return pervane;
    }

    public void setPervane(JButton pervane) {
        this.pervane = pervane;
    }

}
