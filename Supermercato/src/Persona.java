public abstract class Persona {
	private String nomecognome;
	private String indirizzo;
	
	public Persona(String nomecognome, String indirizzo) {
		this.nomecognome=nomecognome;
		this.indirizzo=indirizzo;
	}
	
	public abstract String GetNome();
	
	public abstract String GetIndirizzo();
	
	public abstract void SetIndirizzo(String indirizzo);
}
