public class Salume implements ProdottoPrezzabile{
	private String descrizione;
	private double peso;
	private double prezzoAlKg;
	
	public String GetDescrizione() {
		return this.descrizione;
	}

	public double GetPrezzo() {
		return this.prezzoAlKg;
	}
	
	public void SetDescrizione(String descrizione) {
		this.descrizione=descrizione;
	}
	
	public void SetPeso(double peso) {
		this.peso=peso;
	}
	
	public void SetPrezzo(double prezzo) {
		this.prezzoAlKg=prezzo*(peso*0.01);
	}
	
	public String toString() {
		return this.descrizione+", prezzo : "+this.prezzoAlKg+"€";
		
	}
}
