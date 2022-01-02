
package Gui.Ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButonAyarlari {
    
    private  static Color orijinalBgColor;
    
    public static void setBg(JButton button, Color bgcolor)
    {
        orijinalBgColor=button.getBackground();
        button.setBackground(bgcolor);
    }
    
    public static void setOrijinalBg(JButton button)
    {
        button.setBackground(orijinalBgColor);
    }
  
    
}
