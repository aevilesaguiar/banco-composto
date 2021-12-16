package dados;

public class TestaBanco {

	public static void main(String[] args) {
		 Cliente paulo = new Cliente();
		 paulo.nome="Paulo Silveira";
		 paulo.cpf="123456789-12";
		 paulo.profissao="Administrador";
		 
		 Conta contaDoPaulo = new Conta();
		 contaDoPaulo.deposita(1500);
		 
		 contaDoPaulo.titular=paulo;
		 
		 System.out.println(contaDoPaulo.titular);
		 System.out.println(paulo);
		 
		 
		 
		 

	}

}
