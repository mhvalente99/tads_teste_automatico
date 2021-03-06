import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void somarSucesso() throws Exception{
		Calculadora calc = new Calculadora();
		Double result = calc.calcular(2.0, 3.0, "+");
		Assert.assertEquals(5.0, result, 0.0);
	}
	
	@Test 
	public void somarValoresZero() throws Exception {
		Calculadora calc = new Calculadora();
		Double result = calc.calcular(0.0, 0.0, "+");
		Assert.assertEquals(0.0, result, 0.0);
	}
	
	@Test
	public void somarValorNulo() throws Exception {
		Calculadora calc = new Calculadora();
		Double result = calc.calcular(null, null, "+");
		
		Assert.assertEquals(0.0, result, 0.0);
	}
	
	@Test
	public void subtrairSucesso() throws Exception{
		Calculadora calc = new Calculadora();
		Double result = calc.calcular(2.0, 3.0, "-");
		Assert.assertEquals(-1.0, result, 0.0);
	}
	
	@Test
	public void multiplicarSucesso() throws Exception{
		Calculadora calc = new Calculadora();
		Double result = calc.calcular(2.0, 3.0, "*");
		Assert.assertEquals(6.0, result, 0.0);
	}
	
	@Test
	public void dividirSucesso() throws Exception{
		Calculadora calc = new Calculadora();
		Double result = calc.calcular(10.0, 2.0, "/");
		Assert.assertEquals(5.0, result, 0.0);
	}
	
	@Test
	public void dividirPorZeroErro() {
		Calculadora calc = new Calculadora();
		double result;
		
		try {
			result = calc.calcular(1.0, 0.0, "/");
			Assert.fail();
		} catch (Exception e) {
		}
	}
	
	
}
