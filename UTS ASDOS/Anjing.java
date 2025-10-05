public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Bersuara: Guk Guk");
    }
}