public class Responsabile extends Persona{
	private String nomecognome;
	private String indirizzo;
	private int codiceArea;
	
	public Responsabile(String nomecognome, String indirizzo, int codiceArea) {
		super(nomecognome,indirizzo);
		this.SetCodiceArea(codiceArea);
	}

	public String GetIndirizzo() {
		return this.indirizzo;
	}

	public void SetIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int GetCodiceArea() {
		return this.codiceArea;
	}

	public void SetCodiceArea(int codiceArea) {
		this.codiceArea = codiceArea;
	}

	public String GetNome() {
		return this.nomecognome;
	}
	
}
