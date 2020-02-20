package Logic;

import Gui.KumandaGui;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class ButtonActions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent kge) {
           JButton button = (JButton)kge.getSource();
    
           if (button.getName().equalsIgnoreCase("Bir")) {
            
            try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
              showFloorInformation(button,"Şu an 1. kattasınız!");  
           }
           else if (button.getName().equalsIgnoreCase("İki")) {
               
               try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               showFloorInformation(button,"Şu an 2. kattasınız!");
           }
            else if (button.getName().equalsIgnoreCase("Üç")) {
             
             try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
             showFloorInformation(button,"Şu an 3. kattasınız!");
           }
             else if (button.getName().equalsIgnoreCase("Dört")) {
         
               try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
               
                       showFloorInformation(button,"Şu an 4. kattasınız!");
           }
             else if (button.getName().equalsIgnoreCase("Beş")) {
                
                 try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
                 
                  showFloorInformation(button,"Şu an 5. kattasınız!");
           }
           
             else if (button.getName().equalsIgnoreCase("Altı")) {
                 
                 
                 try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
                 
                 showFloorInformation(button,"Şu an 6. kattasınız!");
           }
           
             else if (button.getName().equalsIgnoreCase("Yedi")) {
                 
                 
                 try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
                 
                 showFloorInformation(button,"Şu an 7. kattasınız!");
           }
           
            else if (button.getName().equalsIgnoreCase("Sekiz")) {
               
                
                try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
                
                 showFloorInformation(button,"Şu an 8. kattasınız!");
           }
            else if (button.getName().equalsIgnoreCase("Dokuz")) {
              try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }  
              showFloorInformation(button,"Şu an 9. kattasınız!");
                
                
           }
            else if(button.getName().equalsIgnoreCase("UD")){
               try {
                   playSound("../Gui/elevatorsound.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               } 
              JOptionPane.showMessageDialog(null, "Asansör Çağırıldı..");
               
            }
            else if(button.getName().equalsIgnoreCase("PG")){
                 
                
                try {
            Image img = ImageIO.read(getClass().getResource("../Gui/fan.gif"));
            button.setIcon(new ImageIcon(img));
            } catch (Exception ex) {
                System.out.println(ex);
              }
                 
                 
                 JOptionPane.showMessageDialog(null, "Pervane Çalıştırıldı..");
   
            }
           
            else if(button.getName().equalsIgnoreCase("TG")){
               try {   
                   playSound("../Gui/phone.wav");
               } catch (Exception ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
                   try {
            Image img = ImageIO.read(getClass().getResource("../Gui/telefon.gif"));
            button.setIcon(new ImageIcon(img));
            } catch (Exception ex) {
                System.out.println(ex);
              }
                  JOptionPane.showMessageDialog(null, "Acil Çağrı Yapılıyor..");

            }
    }
    
    private void showFloorInformation(JButton button,String message){
        
                startThread(1);

                 button.setBackground(Color.red);  
                 
                JOptionPane.showMessageDialog(null, message);
                
                button.setBackground(Color.WHITE);

    }
    
    public void startThread(int s){
               try {
                   Thread.sleep(s * 500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ButtonActions.class.getName()).log(Level.SEVERE, null, ex);
               }
    }
    private void playSound(String filePath) throws Exception 

    {
  try
  {
 
    InputStream inputStream = getClass().getResourceAsStream(filePath);
    AudioStream audioStream = new AudioStream(inputStream);
    AudioPlayer.player.start(audioStream);
  }
  catch (Exception e)
  {
   
      throw new Exception(e.getMessage());
  }
}
    
    
}
