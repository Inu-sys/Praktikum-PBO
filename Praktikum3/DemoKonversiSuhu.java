
public class DemoKonversiSuhu {

	public static void main(String[] args) {
		KonversiSuhu suhu1 = new KonversiSuhu();
		System.out.println("Celcius 50 ke Frenheit = " + suhu1.celciusToFarenheit(50));
		System.out.println("Celcius 50 ke Reamur = " + suhu1.celciusToReamur(50)); 
	
		KonversiSuhu2 suhu2 = new KonversiSuhu2();
		System.out.println("Celcius 135 ke Farenheit = " + suhu2.celciusToFarenheit(135));
		System.out.println("Celcius 135 ke Reamur 	 = " + suhu2.celciusToReamur(135));
		System.out.println("Farenheit 212 Reamur     = " + suhu2.FarenheitToReamur(212));
	}
}