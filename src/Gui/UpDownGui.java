
package Gui;

import Logic.ButtonActions;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author hp
 */
public class UpDownGui {
    ButtonActions UD = new ButtonActions();
    JPanel jp = null;
    JButton UpDown=null;
    
    public UpDownGui(){
      getJp().add(getUpDown());
    
    }
    
    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setBounds(1100,230, 200,250);
            jp.setLayout(null);
            jp.setBackground(Color.WHITE);
        }
        return jp;
    }
    
    public void setJp(JPanel jp) {
        this.jp = jp;
    }


    public JButton getUpDown() {
        if (UpDown == null) {
            UpDown = new JButton();
            UpDown.setBounds(45, 50,105, 150);// 3.kalınlık 4.iç dikey uzunluk
            Icon UpDownb = new ImageIcon(getClass().getResource("drop-down.png"));
            UpDown.setIcon(UpDownb);
            UpDown.setBackground(Color.white);
            UpDown.setName("UD");
            UpDown.addActionListener(UD);
            
          
            
        }
        return UpDown;
    }

    public void setUpDown(JButton UpDown) {
        this.UpDown = UpDown;
    }

}
