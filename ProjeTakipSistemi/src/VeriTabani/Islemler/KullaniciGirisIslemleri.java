package VeriTabani.Islemler;

import VeriTabani.IBosAlanKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class KullaniciGirisIslemleri extends VeriTabani.Baglanti implements IBosAlanKontrol {

    private String musteri_tc = null;
    private String musteri_sifre = null;

    public boolean GirisBilgileriKontrol() {
        if (bilgilerGecerlimi()) {
            if (GirisOnayi()) {
                this.getGİGirisBilgileri().GirisYap(musteri_tc);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean bilgilerGecerlimi() {

        return !(this.musteri_tc == null || this.musteri_sifre == null);

    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {

        return GirisBilgileri.getInstance();

    }

    private boolean GirisOnayi()//veritabanından Kontrol Edilir.
    {
        String sorgu = "SELECT tcno,Sifre FROM kullanicilar"
                + " WHERE "
                + "(tcno='" + this.musteri_tc + "'"
                + " AND "
                + "Sifre = '" + this.musteri_sifre + "')";

        try {

            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu); //sorgu calistirilir.

            while (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciGirisIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    //musteri_tc ve musteri_sifre degiskenlerinin giris ekrani clasında kullanmak icin get and sett methodları olsutruldu..
    public String getMusteri_tc() {
        return musteri_tc;
    }

    public void setMusteri_tc(String musteri_tc) {
        this.musteri_tc = musteri_tc;
    }

    public String getMusteri_sifre() {
        return musteri_sifre;
    }

    public void setMusteri_sifre(String musteri_sifre) {
        this.musteri_sifre = musteri_sifre;
    }

}
