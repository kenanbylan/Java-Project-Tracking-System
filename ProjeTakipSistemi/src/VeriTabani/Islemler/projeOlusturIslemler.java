package VeriTabani.Islemler;

import Gui.Ayarlar.YonlendirmeSettings;
import Gui.EkipArkadaslariKayit;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class projeOlusturIslemler extends VeriTabani.Baglanti {

    //degiskenler ;
    String olusturanTc, proje_ad, proje_baslangic, proje_bitis, proje_icerik;

    public boolean ProjeKayit() {

        String Sorgu = "INSERT INTO kullanici_projeler (olusturan_tc,proje_ad,baslangic,bitis,icerik)"
                + " VALUES ("
                + "'" + this.olusturanTc + "',"
                + "'" + this.proje_ad + "',"
                + "'" + this.proje_baslangic + "',"
                + "'" + this.proje_bitis + "',"
                + "'" + this.proje_icerik + "'"
                + ")";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(Sorgu);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(projeOlusturIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    //get and setter methodlar ;
    public String getOlusturanTc() {
        return olusturanTc;
    }

    public void setOlusturanTc(String olusturanTc) {
        this.olusturanTc = olusturanTc;
    }

    public String getProje_ad() {
        return proje_ad;
    }

    public void setProje_ad(String proje_ad) {
        this.proje_ad = proje_ad;
    }

    public String getProje_baslangic() {
        return proje_baslangic;
    }

    public void setProje_baslangic(String proje_baslangic) {
        this.proje_baslangic = proje_baslangic;
    }

    public String getProje_bitis() {
        return proje_bitis;
    }

    public void setProje_bitis(String proje_bitis) {
        this.proje_bitis = proje_bitis;
    }

    public String getProje_icerik() {
        return proje_icerik;
    }

    public void setProje_icerik(String proje_icerik) {
        this.proje_icerik = proje_icerik;
    }

}
