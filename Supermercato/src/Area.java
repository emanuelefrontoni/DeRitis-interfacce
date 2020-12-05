public interface Area {

	public String GetNomeArea();
	
	public int GetCodiceArea();
	
	public void InserisciProdotto(String nome, double prezzo);
	
	public boolean RimuoviProdotto(String nome);
	
	public void VisualizzaProdotto();
	
	public boolean AcquistaOggetto(int posizione);
}
