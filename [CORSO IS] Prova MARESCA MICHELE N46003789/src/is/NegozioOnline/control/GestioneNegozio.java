package is.NegozioOnline.control;

import java.util.ArrayList;

import is.NegozioOnline.entity.Cliente;
import is.NegozioOnline.entity.Prodotto;
import is.NegozioOnline.entity.Sconto;

public class GestioneNegozio {
private ArrayList<Prodotto> listaProdotti=new ArrayList<Prodotto>();
private ArrayList<Cliente> listaClienti=new ArrayList<Cliente>();
private ArrayList<Sconto> listaSconti=new ArrayList<Sconto>();

public GestioneNegozio() {
	
}

public ArrayList<Prodotto> getListaProdotti() {
	return listaProdotti;
}

public void setListaProdotti(ArrayList<Prodotto> listaProdotti) {
	this.listaProdotti = listaProdotti;
}

public ArrayList<Cliente> getListaClienti() {
	return listaClienti;
}

public void setListaClienti(ArrayList<Cliente> listaClienti) {
	this.listaClienti = listaClienti;
}

public ArrayList<Sconto> getListaSconti() {
	return listaSconti;
}

public void setListaSconti(ArrayList<Sconto> listaSconti) {
	this.listaSconti = listaSconti;
}
}
