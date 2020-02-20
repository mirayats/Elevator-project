
package Gui;

import java.awt.Color;
import javax.swing.*;

public class DMainGui {

    JFrame jf = null;
    JPanel jp = null;
    EkranGui eg = null;
    UpDownGui udg= null;
    
    


    public DMainGui() {
        getJp().setBackground(Color.GRAY);
       getJp().add(getEg().getJp());
       getJp().add(getUdg().getJp());
        

        
        getJf().setVisible(true);
    }

    public JFrame getJf() {
        if (jf == null) {//Eğer Jf yoksa oluştur
            jf = new JFrame("Elevator");//Pencere ismi
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// "X" e basıldığında Kapanma Düğmesi
            jf.setLocation(-7, 0); //Frame'in konumu
            jf.setSize(1950, 900); //Yükseklik ve genişlik
            jf.setContentPane(getJp());
        }
        return jf;

    }

    public void setJf(JFrame jf) {
        this.jf = jf;

    }

    public JPanel getJp() {
        if (jp == null) {// Eğer panel yoksa panel oluştur.
            jp = new JPanel();
            jp.setLayout(null);
            
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }

    public EkranGui getEg() {
        if (eg == null) {
            eg = new EkranGui();
        }
        return eg;
    }

    public void setEg(EkranGui eg) {
        this.eg = eg;
    }

    public UpDownGui getUdg() {
        if (udg == null) {
            udg = new UpDownGui();
        }
        return udg;
    }

    public void setUdg(UpDownGui udg) {
        this.udg = udg;
    }
    
   
    
}
