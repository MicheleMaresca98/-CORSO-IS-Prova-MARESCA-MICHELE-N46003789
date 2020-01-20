package is.NegozioOnline.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import is.NegozioOnline.control.GestioneNegozio;
import is.NegozioOnline.entity.Cliente;
import is.NegozioOnline.entity.ClienteAbituale;
import is.NegozioOnline.entity.Spesa;
import is.NegozioOnline.entity.StatoSpesa;

public class NegozioOnlineTest {
	
GestioneNegozio gestione =new GestioneNegozio();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * ClienteAbituale co1 = new ClienteAbituale("NomeClienteo1","PasswordClienteo1","0818888080","4023 6006 55337428",null);
		Spesa spesa=new Spesa("IDSPESA1",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa);
		gestione.registrazione(co1);
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.size()==1);
		for(ClienteAbituale c:listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate()==1);
			assertTrue(c.getTotaleSpeso()==10);
			}
	 */
	
	
	@Test
	public void test1() {
		Cliente co1 = new Cliente("NomeClienteO1","PasswordClienteO1","0818888080","4023 6006 55337428");
		Spesa spesa=new Spesa("IDSPESA1",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa);
		gestione.registrazione(co1);
		System.out.println("TEST 1:");
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.isEmpty());
	}
	
	@Test
	public void test2() {
		ClienteAbituale co1 = new ClienteAbituale("NomeClienteA1","PasswordClienteA1","0818888080","4023 6006 55337428",null);
		Spesa spesa1=new Spesa("IDSPESA1",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa1);
		Spesa spesa2=new Spesa("IDSPESA2",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa2);
		Spesa spesa3=new Spesa("IDSPESA3",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa3);
		Spesa spesa4=new Spesa("IDSPESA4",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa4);
		Spesa spesa5=new Spesa("IDSPESA5",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa5);
		
		gestione.registrazione(co1);
		System.out.println("TEST 2:");
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.size()==1);
		for(ClienteAbituale c:listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate()==5);
			assertTrue(c.getTotaleSpeso()==47.50);
	}
	}
	
	@Test
	public void test3() {
		Cliente co1 = new Cliente("NomeClienteO1","PasswordClienteO1","0818888080","4023 6006 55337428");
		Spesa spesa1=new Spesa("IDSPESA1",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa1);
		Cliente co2 = new Cliente("NomeClienteO1","PasswordClienteO3","0818888080","4023 6006 55337428");
		Spesa spesa2=new Spesa("IDSPESA2",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa2);
		Cliente co3 = new Cliente("NomeClienteO1","PasswordClienteO3","0818888080","4023 6006 55337428");
		Spesa spesa3=new Spesa("IDSPESA3",LocalDate.of(2019, Month.APRIL, 25),13,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa3);
		Cliente co4 = new Cliente("NomeClienteO1","PasswordClienteO4","0818888080","4023 6006 55337428");
		Spesa spesa4=new Spesa("IDSPESA4",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa4);
		gestione.registrazione(co1);
		gestione.registrazione(co2);
		gestione.registrazione(co3);
		gestione.registrazione(co4);
		System.out.println("TEST 3:");
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.isEmpty());
	}
	
	@Test
	public void test4() {
		ClienteAbituale co1 = new ClienteAbituale("NomeClienteA1","PasswordClienteA1","0818888080","4023 6006 55337428",null);
		Spesa spesa1=new Spesa("IDSPESA1",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa1);
		Spesa spesa2=new Spesa("IDSPESA2",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa2);
		Spesa spesa3=new Spesa("IDSPESA3",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa3);
		Spesa spesa4=new Spesa("IDSPESA4",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa4);
		Spesa spesa5=new Spesa("IDSPESA5",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa5);
		
		ClienteAbituale co2 = new ClienteAbituale("NomeClienteA2","PasswordClienteA2","0818888080","4023 6006 55337428",null);
		Spesa spesa6=new Spesa("IDSPESA6",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa6);
		Spesa spesa7=new Spesa("IDSPESA7",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa7);
		Spesa spesa8=new Spesa("IDSPESA8",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa8);
		Spesa spesa9=new Spesa("IDSPESA9",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa9);
		Spesa spesa10=new Spesa("IDSPESA10",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa10);
		
		ClienteAbituale co3 = new ClienteAbituale("NomeClienteA3","PasswordClienteA3","0818888080","4023 6006 55337428",null);
		Spesa spesa11=new Spesa("IDSPESA11",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa11);
		Spesa spesa12=new Spesa("IDSPESA12",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa12);
		Spesa spesa13=new Spesa("IDSPESA13",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa13);
		Spesa spesa14=new Spesa("IDSPESA14",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa14);
		Spesa spesa15=new Spesa("IDSPESA15",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa15);
		
		ClienteAbituale co4 = new ClienteAbituale("NomeClienteA4","PasswordClienteA4","0818888080","4023 6006 55337428",null);
		Spesa spesa16=new Spesa("IDSPESA16",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa16);
		Spesa spesa17=new Spesa("IDSPESA17",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa17);
		Spesa spesa18=new Spesa("IDSPESA18",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa18);
		Spesa spesa19=new Spesa("IDSPESA19",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa19);
		Spesa spesa20=new Spesa("IDSPESA20",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa20);
		
		gestione.registrazione(co1);
		gestione.registrazione(co2);
		gestione.registrazione(co3);
		gestione.registrazione(co4);
		System.out.println("TEST 4:"); 
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.size()==4);
		
	
	}
	
	@Test
	public void test5() {
		ClienteAbituale co1 = new ClienteAbituale("NomeClienteA1","PasswordClienteA1","0818888080","4023 6006 55337428",null);
		Spesa spesa1=new Spesa("IDSPESA1",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa1);
		Spesa spesa2=new Spesa("IDSPESA2",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa2);
		Spesa spesa3=new Spesa("IDSPESA3",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa3);
		Spesa spesa4=new Spesa("IDSPESA4",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa4);
		Spesa spesa5=new Spesa("IDSPESA5",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa5);
		
		Cliente co2 = new Cliente("NomeClienteO2","PasswordClienteO2","0818888080","4023 6006 55337428");
		Spesa spesa6=new Spesa("IDSPESA6",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa6);
		
		
		Cliente co3 = new Cliente("NomeClienteO3","PasswordClienteO3","0818888080","4023 6006 55337428");
		Spesa spesa11=new Spesa("IDSPESA11",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa11);
		
		
		Cliente co4 = new Cliente("NomeClienteO4","PasswordClienteO4","0818888080","4023 6006 55337428");
		Spesa spesa16=new Spesa("IDSPESA16",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa16);
		
		
		gestione.registrazione(co1);
		gestione.registrazione(co2);
		gestione.registrazione(co3);
		gestione.registrazione(co4);
		System.out.println("TEST 5:"); 
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.size()==1);
		
	
	}
	
	@Test
	public void test6() {
		ClienteAbituale co1 = new ClienteAbituale("NomeClienteA1","PasswordClienteA1","0818888080","4023 6006 55337428",null);
		Spesa spesa1=new Spesa("IDSPESA1",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa1);
		Spesa spesa2=new Spesa("IDSPESA2",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa2);
		Spesa spesa3=new Spesa("IDSPESA3",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa3);
		Spesa spesa4=new Spesa("IDSPESA4",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa4);
		Spesa spesa5=new Spesa("IDSPESA5",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co1.creaSpesa(spesa5);
		
		Cliente co2 = new Cliente("NomeClienteO2","PasswordClienteO2","0818888080","4023 6006 55337428");
		Spesa spesa6=new Spesa("IDSPESA6",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co2.creaSpesa(spesa6);
		
		
		ClienteAbituale co3 = new ClienteAbituale("NomeClienteA3","PasswordClienteA3","0818888080","4023 6006 55337428",null);
		Spesa spesa11=new Spesa("IDSPESA11",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa11);
		Spesa spesa12=new Spesa("IDSPESA12",LocalDate.of(2019, Month.APRIL, 23),12,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa12);
		Spesa spesa13=new Spesa("IDSPESA13",LocalDate.of(2019, Month.APRIL, 23),5.50,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa13);
		Spesa spesa14=new Spesa("IDSPESA14",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa14);
		Spesa spesa15=new Spesa("IDSPESA15",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co3.creaSpesa(spesa15);
		
		Cliente co4 = new Cliente("NomeClienteO4","PasswordClienteO4","0818888080","4023 6006 55337428");
		Spesa spesa16=new Spesa("IDSPESA16",LocalDate.of(2019, Month.APRIL, 23),10,StatoSpesa.CONSEGNATA);
		co4.creaSpesa(spesa16);
		
		
		gestione.registrazione(co1);
		gestione.registrazione(co2);
		gestione.registrazione(co3);
		gestione.registrazione(co4);
		System.out.println("TEST 6:"); 
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.size()==2);
		
	
	}
	
	@Test
	public void test7() {
		System.out.println("TEST 7:");
		ArrayList<ClienteAbituale> listaClienti=gestione.generaReport();
		assertTrue(listaClienti.isEmpty());
	}

}
