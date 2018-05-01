package test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import serverSmartDoc.domain.mediator.DBS;

class DBSTest {
	
	DBS dbs;

	@Test
	void verifyLoginTest(String user,String pass) {

		System.out.println(""+dbs.verifyLogin("jakub123", "12345"));
		assertEquals(true, dbs.verifyLogin("jakub123", "12345"));
	}
	
	@BeforeEach
	void beforeEachTest() {
		dbs = new DBS();
	}

}
