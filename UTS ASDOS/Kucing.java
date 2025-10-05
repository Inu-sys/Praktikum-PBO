public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Bersuara: Meong Meong");
    }
}