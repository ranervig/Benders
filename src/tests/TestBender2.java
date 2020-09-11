package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bender;

public class TestBender2 {
	String name = "Ang";
	int age = 12;
	String nation = "Air";
	
	Bender avatar = new Bender(name, age, nation);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBending() {
		avatar.setBending("All");
		boolean avatarState = avatar.isAvatar();
		assertTrue(avatarState);
	}
	
	@Test
	public void testElement() {
		avatar.setBending("All");
		avatar.setAge(13);
		int elements = avatar.elementsControlled();
		assertEquals(elements, 3);
	}

}
