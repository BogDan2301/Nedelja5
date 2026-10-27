
public class Broker {

	public static double Saldo(String a) {
		
		double saldo = 0;
		String [] transakcije = a.trim().split(" ");
		
		for(int i = 0; i < transakcije.length; i++) {
			String vrijednost = transakcije[i].substring(1);
			if(transakcije[i].charAt(0) == 'S') {
	     saldo += Double.parseDouble(vrijednost);
		} else  {
				saldo -= Double.parseDouble(vrijednost);
			}
		}
		return saldo;
		
	}
	public static void main(String[] args) {
		
		String ulaz = "S50 S40 B50 B100";
		
		double rezultat = Saldo(ulaz);
		System.out.println("Saldo je: " + rezultat);
	}

}
