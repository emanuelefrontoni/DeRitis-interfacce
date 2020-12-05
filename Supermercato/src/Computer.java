public class Computer implements ProdottoPrezzabile{
	private String descrizione;
	private double prezzo;
	
	public String GetDescrizione() {
		return this.descrizione;
	}

	public double GetPrezzo() {
		return this.prezzo;
	}
	
	public void SetDescrizione(String descrizione) {
		this.descrizione=descrizione;
	}
	
	public void SetPrezzo(double prezzo) {
		this.prezzo=prezzo;
	}
	
	public String toString() {
		return this.descrizione+", prezzo : "+this.prezzo+"€";
		
	}
	
}
