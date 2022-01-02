package VeriTabani.Islemler;

import Gui.Ayarlar.TextKontrolAyarlari;
import VeriTabani.IBosAlanKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class KullaniciIslemleri extends VeriTabani.Baglanti implements IBosAlanKontrol {

    //kayit olusturma bilgileri. 
    private String ad = null, soyad = null, tcno = null, meslek = null, sifre = null, yas = null;

    public boolean KayitOnaylandimi() {
        if (bilgilerGecerlimi()) {
            if (this.tcNoTablodaVarmi()) {
                return false;
            } else {
                this.KayitiOnayla();
                return true;
            }
        } else {
            return false;
        }
    }

    private boolean tcNoTablodaVarmi() {

        String sorgu = "SELECT tcno FROM kullanicilar WHERE tcno ='" + this.tcno + "'";

        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu); //sslect sorgularından resultSet kullanılır.

            while (rs.next()) //rs.next sorguyu tabloda tarar.
            {
                return true;//eger tabloda tc bulunmussa true döner.
            }

        } catch (SQLException ex) {

            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    private void KayitiOnayla() {
        String Sorgu = "INSERT INTO kullanicilar (tcno,Ad,Soyad,Sifre,Yas,Meslek)"
                + " VALUES ("
                + "'" + this.tcno + "',"
                + "'" + this.ad + "',"
                + "'" + this.soyad + "',"
                + "'" + this.sifre + "',"
                + "'" + this.yas + "',"
                + "'" + this.meslek + "'"
                + ")";

        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(Sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean bilgilerGecerlimi() {

        return !(this.ad == null
                || this.soyad == null
                || this.tcno == null
                || this.meslek == null
                || this.sifre == null
                || this.yas == null);
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //get and setter..
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

}
