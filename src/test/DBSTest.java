package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import serverSmartDoc.domain.mediator.DBS;

class DBSTest {
	
	DBS dbs;

	@Test
	void verifyLoginTest() {

		System.out.println(""+dbs.verifyLogin("jakub123", "12345"));
		assertEquals(true, dbs.verifyLogin("jakub123", "12345"));
	}
	
	@BeforeEach
	void beforeEachTest() {
		dbs = new DBS();
	}

}
