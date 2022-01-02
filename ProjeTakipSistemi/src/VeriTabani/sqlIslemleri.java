
package VeriTabani;


public class sqlIslemleri extends Baglanti {
    
    //kullanicilar tablosu bilgileri
    protected int kullanici_id=0;
    protected String ad,soyad,sifre,meslek;
    protected int  yas,tc;
    protected String projeEkibi;
    
    
    //kullanicilar_projeler tablosu bilgileri icin;
    protected int olusturanTc;
    protected String projeAd,Baslangic,Bitis,Proje_icerik;

    //projeEkibi tablosu icerigi :
    protected String projeAdEkip,ekipArkasi_id, adEkip,SoyadEkip,gorevEkip;
    
    
    
    
    
    //get and set methodlari   :
    public int getOlusturanTc() {
        return olusturanTc;
    }

    public void setOlusturanTc(int olusturanTc) {
        this.olusturanTc = olusturanTc;
    }

    public String getProjeAd() {
        return projeAd;
    }

    public void setProjeAd(String projeAd) {
        this.projeAd = projeAd;
    }

    public String getBaslangic() {
        return Baslangic;
    }

    public void setBaslangic(String Baslangic) {
        this.Baslangic = Baslangic;
    }

    public String getBitis() {
        return Bitis;
    }

    public void setBitis(String Bitis) {
        this.Bitis = Bitis;
    }

    public String getProje_icerik() {
        return Proje_icerik;
    }

    public void setProje_icerik(String Proje_icerik) {
        this.Proje_icerik = Proje_icerik;
    }
    
    
    
    
    
    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

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

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getProjeEkibi() {
        return projeEkibi;
    }
    
    

    public void setProjeEkibi(String projeEkibi) {
        this.projeEkibi = projeEkibi;
    }
    
    
    
    
    
    
    
    
    
}
