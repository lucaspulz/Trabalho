
import static org.junit.Assert.*;

import org.junit.Test;


import junit.framework.Assert;

public class CadastroPessoaTest {

	@Test
	public void testCadastroPessoaSucesso() {
		CadastroPessoa cp = new CadastroPessoa();
		cp.cadastroPessoa("Lucas", "123.123.123-12");
		Assert.assertEquals(true, cp.cadastroPessoa("Lucas", "123.123.123-12"));
	}
	@Test
	public void testCadastroPessoaNula() {
		CadastroPessoa cp = new CadastroPessoa();
		cp.cadastroPessoa(null, null);
		Assert.assertEquals(false, cp.cadastroPessoa(null, null));
	}
	
	

}
