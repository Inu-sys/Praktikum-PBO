public class MatematikaInheritance {

	public static void main(String[] args) {
		Matematika Mtk1 = new Matematika();
		System.out.println("Pertambahan: 10 + 10 = " + Mtk1.pertambahan(10, 10));
		System.out.println("Pengurangan: 50 - 40 = " + Mtk1.pengurangan(50, 40));
		System.out.println("Perkalian  : 4 x 3   = " + Mtk1.perkalian(4, 3));
		System.out.println("Pembagian  : 50 / 10 = " + Mtk1.pembagian(50, 10));
		
		Matematika2 Mtk2 = new Matematika2 ();
		System.out.println("Pertambahan (Matematika2): 5 + 10 = " + Mtk2.pertambahan(5, 10));
		System.out.println("Modulus: 26 % 2 = " + Mtk2.modulus(26, 2));
	}

}
