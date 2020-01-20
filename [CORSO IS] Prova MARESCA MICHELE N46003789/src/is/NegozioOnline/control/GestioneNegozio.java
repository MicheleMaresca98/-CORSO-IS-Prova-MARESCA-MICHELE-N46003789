package is.NegozioOnline.control;

import java.util.ArrayList;

import is.NegozioOnline.entity.Cliente;
import is.NegozioOnline.entity.ClienteAbituale;
import is.NegozioOnline.entity.Prodotto;
import is.NegozioOnline.entity.Sconto;
import is.NegozioOnline.entity.Spesa;

public class GestioneNegozio {
	private ArrayList<Prodotto> listaProdotti = new ArrayList<Prodotto>();
	private ArrayList<Cliente> listaClienti = new ArrayList<Cliente>();
	private ArrayList<Sconto> listaSconti = new ArrayList<Sconto>();

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

	public ArrayList<Cliente> generaReport() {
		ArrayList<Cliente> listaClientiAbituali = new ArrayList<Cliente>();
		for (Cliente c : listaClienti) {
			if (c instanceof ClienteAbituale) {
				listaClientiAbituali.add(c);
				int numeroSpeseEffettuate = c.getNumeroSpeseEffettuate();
				double totaleSpeso = c.getTotaleSpeso();
				System.out.println("CLIENTE: " + c + " NUMERO SPESE EFFETTUATE=" + numeroSpeseEffettuate
						+ " IMPORTO COMPLESSIVO SPESO=" + totaleSpeso);
			}
		}
		return listaClientiAbituali;
	}

	/* Quale scegliere */
	public ArrayList<Cliente> generaReport(int numero) {

		ArrayList<Cliente> listaClientiN = new ArrayList<Cliente>();
		if (numero < 0) {
			System.out.println("Ingresso non valido\n");
			return listaClientiN;
		}
		for (Cliente c : listaClienti) {
			int numeroSpeseEffettuate = c.getNumeroSpeseEffettuate();
			if (numeroSpeseEffettuate >= numero) {
				listaClientiN.add(c);
				double totaleSpeso = c.getTotaleSpeso();
				System.out.println("CLIENTE: " + c + " NUMERO SPESE EFFETTUATE=" + numeroSpeseEffettuate
						+ " IMPORTO COMPLESSIVO SPESO=" + totaleSpeso);
			}
		}
		return listaClientiN;
	}

	public void aggiungiProdotto(Prodotto prodotto) {
		this.listaProdotti.add(prodotto);
	}

	public void rimuoviProdotto(Prodotto prodotto) {
		this.listaProdotti.remove(prodotto);
	}

	public void registrazione(Cliente cliente) {
		listaClienti.add(cliente);
	}

	public ArrayList<Prodotto> visualizzaProdotti() {
		return getListaProdotti();
	}

	public void registraIDspesa(Spesa spesa, String id) {
		spesa.setId(id);
	}

	public void inserisciSconto(Sconto sconto) {
		this.listaSconti.add(sconto);
	}

	public void comunicaScontoCliente(ClienteAbituale cliente, Sconto sconto) {
		cliente.addSconto(sconto);
	}

	/* NON IMPLEMENTATE */

	public void aggiungiCarrello(Prodotto prodotto) {

	}

	public void rimuoviCarrello(Prodotto prodotto) {

	}

	public void effettuaAcquisto(Spesa spesa, Cliente cliente) {

	}

	public void notificaFattorino() {

	}

	public void aggiornaQuantitaDisponibile() {

	}

	public void richiediConsegnaAdomicilio() {

	}

	public void inviaMessaggioCliente() {

	}

	public void modificaProdotto(Prodotto prodotto) {

	}

}
