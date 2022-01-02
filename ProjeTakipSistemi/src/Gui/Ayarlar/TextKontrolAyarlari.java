
package Gui.Ayarlar;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TextKontrolAyarlari {
    
    
    public static boolean textAlanKontrol(JPanel panel)
    {
        Component[] components = panel.getComponents();
        
        for(Component c : components)
        {
            if( c instanceof JTextField )
            {
                JTextField textField = (JTextField)c;
                
                if(textField.getText().trim().equals("") && textField.isEnabled())
                {
                    return false; //yani alanlar dolu değil..
                }
            
            }
        }
        return true;
        
    }
        
    public static boolean UzunlukSiniri(int length, String str)
    {
        return (str.length()< length); //tc nonun en az 11 hane girilmesi icin yazilmiştir..
    }
    
}
