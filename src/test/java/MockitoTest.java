
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

	@RunWith(MockitoJUnitRunner.class)
	public class MockitoTest {
		
		private CadastroPessoa cp;
	
	@Before
	public void init() {
		CadastroPessoa cp = Mockito.mock(CadastroPessoa.class);
		}
	
	@Test
	public void testValidaCidadeGravatai() {
		CadastroPessoa cp = Mockito.mock(CadastroPessoa.class);
		when(cp.buscaEnderecoGravatai("94075300")).thenReturn("Gravataí");
		Assert.assertEquals("Gravataí", cp.buscaEnderecoGravatai("94075300"));
		
	}
	

}
