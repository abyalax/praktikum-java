package vars.graph.dijkstra;

public class Kota {
    private String name;
    private String wilayah;
    private String bahasa;
    private String suku;

    public Kota(String name) {
        this.name = name;
    }

    public Kota(String name, String wilayah) {
        this.name = name;
        this.wilayah = wilayah;
    }

    public Kota(String name, String wilayah, String bahasa) {
        this.name = name;
        this.wilayah = wilayah;
        this.bahasa = bahasa;
    }

    public String getBahasa() {
        return bahasa;
    }

    public String getName() {
        return name;
    }

    public String getSuku() {
        return suku;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuku(String suku) {
        this.suku = suku;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    @Override
    public String toString() {
        return name;
    }
}
