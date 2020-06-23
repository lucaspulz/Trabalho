

public class CadastroPessoa {

	public boolean cadastroPessoa(String nome,String cpf) {
		if(nome!=null || cpf!=null) {
			return true;
		}
		return false;
		}
	
	public String buscaEnderecoGravatai(String cep) {
		if(cep=="94075300") {
			return "Gravataí";
		}
		else {
			return"Não Existe";
		}
	}
		//Teste Jekins
}
