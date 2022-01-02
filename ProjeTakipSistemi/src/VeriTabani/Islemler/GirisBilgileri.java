package VeriTabani.Islemler;

import VeriTabani.IBosAlanKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class GirisBilgileri extends VeriTabani.sqlIslemleri implements IBosAlanKontrol {

    private static GirisBilgileri hesapBilgi = null;

    //singleton  ; kullanıcının bilgilerine tum ekranlarda erişmek icin kullanırız.  
    public static GirisBilgileri getInstance() {
        if (hesapBilgi == null) {
            hesapBilgi = new GirisBilgileri();
        }
        return hesapBilgi;
    }

    //implament edildi..
    @Override
    public boolean bilgilerGecerlimi() {

        return !(super.tc == 0);
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {
        return GirisBilgileri.getInstance();

    }

    public void GirisYap(String musteri_tc) {
        this.KullaniciAl(musteri_tc);
    }

    public void CikisYap() //kullanici cikis yaparken tüm bilgiler sıfırlanması icin..
    {

        //kullanicilar tablosu.
        super.kullanici_id = 0;
        super.ad = null;
        super.soyad = null;
        super.yas = 0;
        super.sifre = null;
        super.meslek = null;
        super.tc = 0;

    }

    private void KullaniciAl(String musteri_tc) //veriTabanından giris yapan kullanıcı cekilir...
    {
        String sorgu = "SELECT * FROM kullanicilar WHERE "
                + "tcno = '" + musteri_tc + "'";

        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                super.kullanici_id = rs.getInt("kullanici_id");
                super.ad = rs.getNString("Ad");
                super.soyad = rs.getNString("Soyad");
                super.tc = rs.getInt("tcno");
                super.sifre = rs.getNString("Sifre");
                super.yas = rs.getInt("Yas");
                super.meslek = rs.getNString("Meslek");

            }

        } catch (SQLException ex) {

            Logger.getLogger(GirisBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //kullaniciya ait proje db'den alindi..
    private void kullaniciProjeAl(String musteri_tc) {
        if (this.bilgilerGecerlimi()) {

            try {
                String sorgu = "SELECT * FROM kullanici_projeler"
                        + "WHERE "
                        + "tcno ='" + musteri_tc + "'";
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(sorgu);

                while (rs.next()) {
                    super.olusturanTc = rs.getInt("olusturan_tc");
                    super.projeAd = rs.getNString("projeAd");
                    super.Baslangic = rs.getNString("Baslangic");
                    super.Bitis = rs.getNString("Bitis");
                    super.Proje_icerik = rs.getNString("Proje_icerik");

                }
            } catch (SQLException ex) {
                Logger.getLogger(GirisBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //projeEkibi bilgileri db'den alındı..
    private void ProjeEkibiAl() {
        if (this.bilgilerGecerlimi()) {
            try {
                String sorgu = "SELECT * FROM projeekibi"
                        + "WHERE "
                        + "olusturan_tc = '" + super.getTc() + "'";

                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(sorgu);

                while (rs.next()) {
                    super.ekipArkasi_id = rs.getNString("kullanici_id");
                    super.adEkip = rs.getNString("ad");
                    super.SoyadEkip = rs.getNString("soyad");
                    super.projeAdEkip = rs.getNString("projeAd");
                    super.gorevEkip = rs.getNString("gorev");

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
