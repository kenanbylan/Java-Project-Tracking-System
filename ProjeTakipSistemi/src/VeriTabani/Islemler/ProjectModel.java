package VeriTabani.Islemler;

public class ProjectModel {

    private final String proje_ad;
    private final String baslangic;
    private final String bitis;
    private final String icerik;

    public ProjectModel(String proje_ad, String baslangic, String bitis, String icerik) {

        this.proje_ad = proje_ad;
        this.baslangic = baslangic;
        this.bitis = bitis;
        this.icerik = icerik;
    }

    //get and setter ;
    public String getProje_ad() {
        return proje_ad;
    }

    public String getBaslangic() {
        return baslangic;
    }

    public String getBitis() {
        return bitis;
    }

    public String getIcerik() {
        return icerik;
    }
}
