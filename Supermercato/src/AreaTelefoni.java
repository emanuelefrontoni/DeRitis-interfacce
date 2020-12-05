public class AreaTelefoni implements Area{
	private String nomeArea;
	private int codiceArea;
	private static int ultimaArea=1100;
	public static Telefono[] telefoni = new Telefono[100];
	public Scontrino s = new Scontrino();
	
	public AreaTelefoni(String nomeArea) {
		this.nomeArea=nomeArea;
		this.ultimaArea++;
		this.codiceArea=this.ultimaArea;
	}
	
	public int GetCodiceArea() {
		return this.codiceArea;
	}
	public String GetNomeArea() {
		return this.nomeArea;
	}
	
	public void InserisciProdotto(String nomeTelefono, double prezzo) {
		Telefono t = new Telefono();
		for(int i=0;i<telefoni.length;i++) {
			if(telefoni[i]==null) {
				telefoni[i]=t;
				telefoni[i].SetDescrizione(nomeTelefono);
				telefoni[i].SetPrezzo(prezzo);
				break;
			}
		}
	}
	
	public boolean RimuoviProdotto(String nomeTelefono) {
		String estr;
		for(int i=0;i<telefoni.length;i++) {
			if(telefoni[i].GetDescrizione().equals(nomeTelefono)) {
				estr=telefoni[i].GetDescrizione();
				System.out.println("Hai rimosso il salume : "+estr);
				telefoni[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public void VisualizzaProdotto() {
		for(int i=0;i<telefoni.length;i++)
			if(telefoni[i]!=null)
				System.out.println("Descrizione telefono "+(i+1)+": "+telefoni[i].GetDescrizione()+" ------ costo : "+telefoni[i].GetPrezzo()+"€");
	}
	
	public boolean AcquistaOggetto(int posizione) {
		if(telefoni[posizione]!=null) {
			s.InserisciLista(telefoni[posizione], telefoni[posizione].GetPrezzo());
			return true;
		}
		else return false;
	}
	
}
