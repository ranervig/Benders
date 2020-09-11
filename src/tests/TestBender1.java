package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bender;

public class TestBender1 {
	String name = "Bumi";
	int age = 112;
	String nation = "Earth";

	Bender bender1 = new Bender(name, age, nation);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCanBend() {
		boolean bending = bender1.canBend(nation);
		assertTrue(bending);
	}

	@Test
	public void testCantBend() {
		boolean bending = bender1.canBend("Fire");
		assertFalse(bending);
	}
	
	@Test
	public void testAvatar() {
		boolean avatar = bender1.isAvatar();
		assertFalse(avatar);
	}

}
