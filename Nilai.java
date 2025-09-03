package prak2;

public class Nilai {
	String nim;
	String nama;
	double absen;
	double tugas;
	double uts;
	double uas;
	double akhir;
	
	Nilai(String nim, String nama, double absen, double tugas, double uts, double uas) {
		this.nim = nim;
		this.nama = nama;
		this.absen = absen;
		this.tugas = tugas;
		this.uts = uts;
		this.uas = uas;
		this.akhir = (this.absen*0.10) + (this.tugas*0.20) + (this.uts*0.30) + (this.uas*0.40);
		
	}
	
	public void CetakNilai () {
		System.out.println("Nim = " + this.nim);
		System.out.println("Nama = " + this.nama);
		System.out.println("Nilai Absen = " + this.absen);
		System.out.println("Nilai Tugas = " + this.tugas);
		System.out.println("Nilai UTS = " + this.uts);
		System.out.println("Nilai UAS = " + this.uas);
		
	}

}
