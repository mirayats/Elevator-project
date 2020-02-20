package Gui;

import Logic.ButtonActions;
import java.awt.Color;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public final class KumandaGui {
    ButtonActions kg = new ButtonActions();
    JPanel jp = null;
    JButton  bir = null, iki = null, üç = null, dört = null, beş = null, altı = null, 
    yedi = null, sekiz = null, dokuz = null;
    

    public KumandaGui() {
        
        getJp().add(getBir());
        getJp().add(getİki());
        getJp().add(getÜç());
        getJp().add(getDört());
        getJp().add(getBeş());
        getJp().add(getAltı());
        getJp().add(getYedi());
        getJp().add(getSekiz());
        getJp().add(getDokuz());
       

    }

    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setBounds(5, 5, 230, 200);
            jp.setLayout(null);
           //jp.setBackground(Color.white);
            
        }
        return jp;

    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }

  
    public JButton getBir() {
        if (bir == null) {
            bir = new JButton();
            bir.setName("Bir");
            bir.addActionListener(kg);
            bir.setBackground(Color.white);
            bir.setBounds(25, 10, 50, 50);
            Icon birb = new ImageIcon(getClass().getResource("bir.png"));
            bir.setIcon(birb);
            
        }
        return bir;
    }

    public void setBir(JButton bir) {
        this.bir = bir;
    }

    public JButton getİki() {
        if (iki == null) {
            iki = new JButton();
            iki.setName("İki");
            iki.addActionListener(kg);
 
            iki.setBackground(Color.white);
            iki.setBounds(85, 10, 50, 50);
            Icon ikib = new ImageIcon(getClass().getResource("iki.png"));
            iki.setIcon(ikib);
        }
        return iki;
    }

    public void setİki(JButton iki) {
        this.iki = iki;
    }

    
    public JButton getÜç() {
        if (üç == null) {
            üç = new JButton();
            üç.setBackground(Color.white);
            üç.setBounds(145, 10, 50, 50);
            Icon üçb = new ImageIcon(getClass().getResource("üç.png"));
            üç.setIcon(üçb);
            üç.setName("Üç");
            üç.addActionListener(kg);
        }
        return üç;
    }

    public void setÜç(JButton üç) {
        this.üç = üç;
    }

    public JButton getDört() {
        if (dört == null) {
            dört = new JButton();
            dört.setBackground(Color.white);
            dört.setBounds(25, 70, 50, 50);
            Icon dörtb = new ImageIcon(getClass().getResource("dört.png"));
            dört.setIcon(dörtb);
            dört.setName("Dört");
            dört.addActionListener(kg);
            
            
        }
        return dört;
    }

    public void setDört(JButton dört) {
        this.dört = dört;
    }

    public JButton getBeş() {
        if (beş == null) {
            beş = new JButton();
            beş.setBackground(Color.WHITE);
            beş.setBounds(85, 70, 50, 50);
            Icon beşb = new ImageIcon(getClass().getResource("beş.png"));
            beş.setIcon(beşb);
            beş.setName("Beş");
            beş.addActionListener(kg);
        }
        return beş;
    }

    public void setBeş(JButton beş) {
        this.beş = beş;
    }

    public JButton getAltı() {
        if (altı == null) {
            altı = new JButton();
            altı.setBackground(Color.WHITE);
            altı.setBounds(145, 70, 50, 50);
            Icon altıb = new ImageIcon(getClass().getResource("altı.png"));
            altı.setIcon(altıb);
            altı.setName("Altı");
            altı.addActionListener(kg);
        }
        return altı;
    }

    public void setAltı(JButton altı) {
        this.altı = altı;
    }

    public JButton getYedi() {
        if (yedi == null) {
            yedi = new JButton();
            yedi.setBackground(Color.white);
            yedi.setBounds(25, 130, 50, 50);
            Icon yedib = new ImageIcon(getClass().getResource("yedi.png"));
            yedi.setIcon(yedib);
            yedi.setName("Yedi");
            yedi.addActionListener(kg);
        }
        return yedi;
    }

    public void setYedi(JButton yedi) {
        this.yedi = yedi;
    }

    public JButton getSekiz() {
        if (sekiz == null) {
            sekiz = new JButton();
            sekiz.setBackground(Color.WHITE);
            sekiz.setBounds(85, 130, 50, 50);
            Icon sekizb = new ImageIcon(getClass().getResource("sekiz.png"));
            sekiz.setIcon(sekizb);
            sekiz.setName("Sekiz");
            sekiz.addActionListener(kg);
        }
        return sekiz;
    }

    public void setSekiz(JButton sekiz) {
        this.sekiz = sekiz;
    }

    public JButton getDokuz() {
        if (dokuz == null) {
            dokuz = new JButton();
            dokuz.setBackground(Color.white);
            dokuz.setBounds(145, 130, 50, 50);
            Icon dokuzb = new ImageIcon(getClass().getResource("dokuz.png"));
            dokuz.setIcon(dokuzb);
            dokuz.setName("Dokuz");
            dokuz.addActionListener(kg);
        }
        return dokuz;
    }

    public void setDokuz(JButton dokuz) {
        this.dokuz = dokuz;
    }


}
