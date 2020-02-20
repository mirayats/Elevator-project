
package Gui;

import Logic.ButtonActions;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public class TelephoneGui {
    ButtonActions TG = new ButtonActions();
    JPanel jp = null;
    JButton telephone = null;

    public TelephoneGui() {
        
    getJp().add(getTelephone());


    }
    
    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setBounds(695, 15, 300, 200);
            jp.setLayout(null);
            //jp.setBackground(Color.ORANGE);
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }
    
     public JButton getTelephone() {
        if (telephone == null) {
            telephone= new JButton();
            telephone.setBackground(Color.white);
            telephone.setBounds(105, -12, 195, 200);
            Icon telephoneb = new ImageIcon(getClass().getResource("telefon.png"));
            telephone.setIcon(telephoneb);
            telephone.setName("TG");
            telephone.addActionListener(TG);

        }
        return telephone;
    }

    public void setTelephone(JButton telephone) {
        this.telephone= telephone;
    }
    
    
    
}
