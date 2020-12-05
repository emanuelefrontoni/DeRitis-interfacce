public class AreaAlimenti implements Area{
	private String nomeArea;
	private int codiceArea;
	private static int ultimaArea=1000;
	public static Alimento[] alimenti = new Alimento[100];
	public Scontrino s = new Scontrino();
	
	public AreaAlimenti(String nomeArea) {
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
	
	public void InserisciProdotto(String nomeAlimento, double prezzo) {
		Alimento a = new Alimento();
		for(int i=0;i<alimenti.length;i++) {
			if(alimenti[i]==null) {
				alimenti[i]=a;
				alimenti[i].SetDescrizione(nomeAlimento);
				alimenti[i].SetPrezzo(prezzo);
				break;
			}
		}
	}
	
	public boolean RimuoviProdotto(String nomeAlimento) {
		String estr;
		for(int i=0;i<alimenti.length;i++) {
			if(alimenti[i].GetDescrizione().equals(nomeAlimento)) {
				estr=alimenti[i].GetDescrizione();
				System.out.println("Hai rimosso l'alimento : "+estr);
				alimenti[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public void VisualizzaProdotto() {
		for(int i=0;i<alimenti.length;i++)
			if(alimenti[i]!=null)
				System.out.println("Alimento "+(i+1)+": "+alimenti[i].GetDescrizione()+" ------ costo : "+alimenti[i].GetPrezzo()+"€");
	}
	
	public boolean AcquistaOggetto(int posizione) {
		if(alimenti[posizione]!=null) {
			s.InserisciLista(alimenti[posizione], alimenti[posizione].GetPrezzo());
			return true;
		}
		return false;
	}
	
}
