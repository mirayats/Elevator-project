
package Gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.applet.*;
import java.awt.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class EkranGui {
    
     JPanel jp = null;
    JLabel ekran;
    KumandaGui kg=null;
    PervaneGui ud=null;
    TelephoneGui ab=null;
    
    
    public EkranGui() {
       getJp().add(getEkran());
       getJp().add(getKg().getJp());
       getJp().add(getUd().getJp());
       getJp().add(getTg().getJp());


    }

    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setBounds(0, 0, 1000, 650);
            jp.setLayout(null);
     
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }


    public JLabel getEkran() {
        if (ekran == null) {
            ekran = new JLabel();
            ekran.setBounds(0, 0, 1000, 650);
            Icon ekr = new ImageIcon(getClass().getResource("elevator.jpg"));
           ekran.setIcon(ekr);
            
        }
        return ekran;
    }

    public void setEkran(JLabel ekran) {
        this.ekran = ekran;
    }
 public KumandaGui getKg() {
        if(kg==null){
        kg=new KumandaGui();
        }
        return kg;
    }

    public void setKg(KumandaGui kg) {
        this.kg = kg;
    }

    public PervaneGui getUd() {
        if(ud==null){
            ud=new PervaneGui();
        }
        return ud;
    }

    public void setUd(PervaneGui ud) {
        this.ud = ud;
    }
    
     public TelephoneGui getTg() {
        if(ab==null){
            ab=new TelephoneGui();
        }
        return ab;
    }

    public void setTg(TelephoneGui ab) {
        this.ab= ab;
    }

  
    

    
}
