package carrello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrelloTestTest {

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
	//tra le librerie abbiamo JUnit -> basta andare su Built Path.
	//non è un debugger quindi non corregge, fa solo visualizzare.

	
	
	@Test
	public void testCarello() {
		Carrello carrello = new Carrello(); //invocato il costruttore
		int expected=0; //creo una variabile expected
		assertEquals(expected,carrello.getAmount());
		
	}
	@Test
	public void testInsertOneProduct () {
		Carrello carrello = new Carrello ();
		int expected=3;
		carrello.insertOneProduct ();
		carrello.insertOneProduct ();
		carrello.insertOneProduct ();
		assertEquals(expected, carrello.getAmount());}
	
	 //ricorda sempre di inserire l'annotazione 
	/* 
	 @Test public void testRemoveOneProduct() {
	Carrello carrello = new Carrello();
	int expected =1; // ci dice che il valore di ritorno è 1; diminuisce l'amount.
	carrello.insertOneProduct ();
	carrello.insertOneProduct ();
	carrello.removeOneProduct ();
	assertEquals(expected, carrello.getAmount());}*/
	
	@Test //ricorda sempre di inserire l'annotazione 
	public void testRemoveOneProduct() {
	Carrello carrello = new Carrello();{
	int expected =0; // ci dice che il valore di ritorno è 0.
	carrello.removeOneProduct ();
	assertEquals(expected, carrello.getAmount()); //qui quindi da problema, 
	//di conseguenza dobbiamo modificare il nostro carrello facendo un controllo if >0
}
}}