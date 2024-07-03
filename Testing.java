package Integrate;

import org.junit.Assert;
import org.junit.Test;

import Portfolio.D1_Front;
import jyreport.Main;

public class Testing {

	public String error = "";

	@Test
	public void testIntegration() {

		D1_Front unix = new D1_Front(); // Unix Portfolio
		Main jyre = new Main(); // Jyre Portfolio

		// Test Integration
		unix.initializeGUI();
		jyre.initializeGUI();

		// Integration conditions
		if (!unix.initialize) {
			error += "\n➊Unix is not initialized correctly\n" + unix.printError + "\n";
		}
		if (!jyre.initialize) {
			error += "\n➋Jyre is not initialized correctly\n" + jyre.printError + "\n";
		}

		if (error.length() > 0) {
			Assert.fail(error);
		} else {
			System.out.print("All programs are working");
		}
	}
}