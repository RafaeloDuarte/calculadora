package br.com.inmetrics.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculosTest {

	Operacoes ops = new Operacoes();

	@Before
	public void method() {
		System.out.println("Calculadora Inmetrics");
	}

	@Test(timeout = 390)
	public void testCalcular() throws InterruptedException {
		double a, b;
		boolean hasValue = true;
		String valor = "null";
		a = 3.0;
		b = 4.0;

		Thread.sleep(350);

		double resultado = ops.somar(a, b);

		System.out.println("Operação: " + a + " + " + b + " = " + resultado);

		// Assert.assertNull(valor);
		Assert.assertNotNull(valor);
		Assert.assertTrue(hasValue);
		// Assert.assertFalse(hasValue);
		Assert.assertEquals(7.0, resultado, 0);

	}

	@After
	public void finaliza() {
		System.out.println("Essa calculadora foi criada por especialistas.");
	}

}
