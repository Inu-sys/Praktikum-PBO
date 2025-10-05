public class Burung extends Hewan {

    public Burung(String nama) {
        super(nama, "Burung");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Bersuara: Cuit Cuit ");
    }
}