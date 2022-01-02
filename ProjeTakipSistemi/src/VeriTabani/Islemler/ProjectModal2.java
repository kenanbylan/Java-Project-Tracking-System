package VeriTabani.Islemler;

public class ProjectModal2 {

    private String proje_ad;
    private String adSoyad;
    private String gorev;

    public ProjectModal2(String proje_ad, String adSoyad, String gorev) {
        this.proje_ad = proje_ad;
        this.adSoyad = adSoyad;
        this.gorev = gorev;
    }

    //get and setter ; 
    public String getProje_ad() {
        return proje_ad;
    }

    public void setProje_ad(String proje_ad) {
        this.proje_ad = proje_ad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

}
