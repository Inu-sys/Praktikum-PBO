abstract class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void makan() {
        System.out.println(this.nama + " (" + this.jenis + ") Sedang Makan.");
    }

    public void tidur() {
        System.out.println(this.nama + " (" + this.jenis + ") Sedang Tidur... Zzz");
    }

    public abstract void bersuara();

    public String getNama() {
        return this.nama;
    }

    public String getJenis() {
        return this.jenis;
    }

    @Override
    public String toString() {
        return "Nama: " + this.nama + ", Jenis: " + this.jenis;
    }
}