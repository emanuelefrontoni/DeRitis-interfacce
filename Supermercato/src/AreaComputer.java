public class AreaComputer implements Area{
	private String nomeArea;
	private int codiceArea;
	private static int ultimaArea=1300;
	public static Computer[] pc = new Computer[100];
	public Scontrino s = new Scontrino();
	
	public AreaComputer(String nomeArea) {
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
	
	public void InserisciProdotto(String nomePc, double prezzo) {
		Computer c = new Computer();
		for(int i=0;i<pc.length;i++) {
			if(pc[i]==null) {
				pc[i]=c;
				pc[i].SetDescrizione(nomePc);
				pc[i].SetPrezzo(prezzo);
				break;
			}
		}
	}
	
	public boolean RimuoviProdotto(String nomePc) {
		String estr;
		for(int i=0;i<pc.length;i++) {
			if(pc[i].GetDescrizione().equals(nomePc)) {
				estr=pc[i].GetDescrizione();
				System.out.println("Hai rimosso il computer : "+estr);
				pc[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public void VisualizzaProdotto() {
		for(int i=0;i<pc.length;i++)
			if(pc[i]!=null)
				System.out.println("Descrizione Pc "+(i+1)+": "+pc[i].GetDescrizione()+" ------ costo : "+pc[i].GetPrezzo()+"€");
	}
	
	public boolean AcquistaOggetto(int posizione) {
		if(pc[posizione]!=null) {
			s.InserisciLista(pc[posizione], pc[posizione].GetPrezzo());
			return true;
		}
		else return false;
	}

}
