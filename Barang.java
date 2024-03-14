public class Barang {
    String namaMataKuliah;
    String namaTugas;
    private String deadlineTugas;
    public Object mataKuliah;
    public Barang(String namaMataKuliah, String namaTugas, String deadlineTugas) {
        this.namaMataKuliah = namaMataKuliah;
        this.namaTugas = namaTugas;
        this.deadlineTugas = deadlineTugas;
    }
    
    @Override
    public String toString() {
        return "Barang [namaMataKuliah=" + namaMataKuliah + ", namaTugas=" + namaTugas + ", deadlineTugas="
                + deadlineTugas + "]";
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }
    public String getNamaTugas() {
        return namaTugas;
    }
    public String getDeadlineTugas() {
        return deadlineTugas;
    }
}
