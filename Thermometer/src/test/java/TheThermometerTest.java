package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.java.controller.TheThermometer;

class TheThermometerTest {
	TheThermometer thermometer = new TheThermometer();
	
	// Adult Tests
	@Test
	void adultNegative() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.adult(-1.25));
	}
	
	@Test
	void adultBelow95() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.adult(74));
	}
	
	@Test
	void adult95() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.adult(95));
	}
	
	@Test
	void adultBelow97Above95() {
		assertEquals("Low but possibly normal", thermometer.adult(96.15));
	}
	
	@Test
	void adult97() {
		assertEquals("Normal", thermometer.adult(97));
	}

	@Test
	void adult98Dot6() {
		assertEquals("Normal or low grade fever", thermometer.adult(98.60));
	}
	
	@Test
	void adultBelow98Dot6Above97() {
		assertEquals("Normal", thermometer.adult(97.01));
	}
	
	@Test
	void adult100Dot4() {
		assertEquals("Fever", thermometer.adult(100.4));
	}
	
	@Test
	void adultBelow100Dot4Above98Dot6() {
		assertEquals("Normal or low grade fever", thermometer.adult(99.99));
	}
	
	@Test
	void adultBelow103Dot4Above100Dot4() {
		assertEquals("Fever", thermometer.adult(102.5849123123));
	}
	
	@Test
	void adult103() {
		assertEquals("High fever \nCALL YOUR DOCTOR", thermometer.adult(103));
	}
	
	@Test
	void adultAbove103() {
		assertEquals("High fever \nCALL YOUR DOCTOR", thermometer.adult(99999.15));
	}
	
	// Children Tests
	@Test
	void childNegative() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.children(-1.25));
	}
	
	@Test
	void childBelow95() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.children(74));
	}
	
	@Test
	void child95() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.children(95));
	}
	
	@Test
	void childBelow97Above95() {
		assertEquals("Low but possibly normal", thermometer.children(96.15));
	}
	
	@Test
	void child97() {
		assertEquals("Normal", thermometer.children(97));
	}

	@Test
	void child98Dot6() {
		assertEquals("Normal or low grade fever", thermometer.children(98.60));
	}
	
	@Test
	void childBelow98Dot6Above97() {
		assertEquals("Normal", thermometer.children(97.01));
	}
	
	@Test
	void child100Dot4() {
		assertEquals("Fever", thermometer.children(100.4));
	}
	
	@Test
	void childBelow100Dot4Above98Dot6() {
		assertEquals("Normal or low grade fever", thermometer.children(99.99));
	}
	
	@Test
	void childBelow103Dot4Above100Dot4() {
		assertEquals("Fever", thermometer.children(102.5849123123));
	}
	
	@Test
	void child103() {
		assertEquals("High fever \nCALL YOUR DOCTOR", thermometer.children(103));
	}
	
	@Test		
	void childAbove103() {
		assertEquals("High fever \nCALL YOUR DOCTOR", thermometer.children(99999.15));
	}
	
	// Babies Tests
	@Test
	void babyNegative() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.babies(-1.25));
	}
	
	@Test
	void babyBelow95() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.babies(74));
	}
	
	@Test
	void baby95() {
		assertEquals("Hypothermia \nSEEK CARE", thermometer.babies(95));
	}
	
	@Test
	void babyBelow97Above95() {
		assertEquals("Low but possibly normal", thermometer.babies(96.15));
	}
	
	@Test
	void baby97() {
		assertEquals("Normal", thermometer.babies(97));
	}

	@Test
	void baby98Dot6() {
		assertEquals("low grade fever", thermometer.babies(98.60));
	}
	
	@Test
	void babyBelow98Dot6Above97() {
		assertEquals("Normal", thermometer.babies(97.01));
	}
	
	@Test
	void baby100Dot4() {
		assertEquals("Fever \n SEEK CARE", thermometer.babies(100.4));
	}
	
	@Test
	void babyBelow100Dot4Above98Dot6() {
		assertEquals("low grade fever", thermometer.babies(99.99));
	}
	
	@Test
	void babyBelow103Dot4Above100Dot4() {
		assertEquals("Fever \n SEEK CARE", thermometer.babies(102.5849123123));
	}
	
	@Test
	void baby103() {
		assertEquals("High fever \nCALL YOUR DOCTOR", thermometer.babies(103));
	}
	
	@Test		
	void babyAbove103() {
		assertEquals("High fever \nCALL YOUR DOCTOR", thermometer.babies(99999.15));
	}
}
