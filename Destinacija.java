import java.util.ArrayList;

public class Destinacija {
	
	private String naziv;
	private String drzava;
	private int ocjena;
	private double udaljenost;
	private int brojPosjeta;
	
	

	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getDrzava() {
		return drzava;
	}


	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}


	public int getOcjena() {
		return ocjena;
	}


	public void setOcjena(int ocjena) {
		if(ocjena > 10) {
			ocjena = 10;
		} else if (ocjena < 0) {
			ocjena = 0;
		}
		this.ocjena = ocjena;
	}


	public double getUdaljenost() {
		return udaljenost;
	}


	public void setUdaljenost(double udaljenost) {
		this.udaljenost = udaljenost;
	}



	public int getBrojPosjeta() {
		return brojPosjeta;
	}


	public void setBrojPosjeta(int brojPosjeta) {
		this.brojPosjeta = brojPosjeta;
	}
	
	
	public Destinacija(String naziv, String drzava, int ocjena, int udaljenost, int brojPosjeta) {
	
		this.naziv = naziv;
		this.drzava = drzava;
		this.ocjena = ocjena;
		this.udaljenost = udaljenost;
		this.brojPosjeta = brojPosjeta;
	}
	
	public Destinacija() {
		this.naziv = "deafult";
		this.drzava = "deafult";
		
	}

    class TestnaKlasa {
	
	public static ArrayList<Destinacija> filtriraj (ArrayList<Destinacija> destinacije) {
		
		ArrayList<Destinacija> rez = new ArrayList<Destinacija>();
		
		for(Destinacija a : destinacije) {		
			if(a.getOcjena() >= 8 && a.getUdaljenost() < 1000) {
				rez.add(a);
			}
		}
			return rez;
		}
	
	public static Destinacija najvecaPosj( ArrayList<Destinacija> destinacije) {
		
		Destinacija max = destinacije.get(0);
		for(Destinacija a : destinacije) {
			if( a.getBrojPosjeta() > max.getBrojPosjeta()) {
				max = a;
			}
			
		}
		return max;
	}
	
	public static ArrayList<Destinacija> sortiranje(ArrayList<Destinacija> destinacije) {
		
		destinacije.sort((d1, d2) -> Integer.compare(d2.getOcjena(), d1.getOcjena()));
		
		return destinacije;
	}
    
	public static void main(String[] args) {
		
		ArrayList<Destinacija> destinacije = new ArrayList<Destinacija>();
		Destinacija d1 = new Destinacija("Barcelona", "Spanija",5,2500,20000);
		Destinacija d2 = new Destinacija("Pariz", "Francuska",9,3000,500);
		Destinacija d3 = new Destinacija();
		d3.setOcjena(9);
		d3.setUdaljenost(500);
		d3.setNaziv("Budimpesta");
		
		destinacije.add(d1);
		destinacije.add(d2);
		destinacije.add(d3);
		
		ArrayList<Destinacija> rez = new ArrayList<Destinacija>();
		
		rez = filtriraj(destinacije);
		
		for(Destinacija a : rez) {
			System.out.println(a.getNaziv());
		}
		
		System.out.println(najvecaPosj(destinacije).getNaziv());
	
}
    }
}