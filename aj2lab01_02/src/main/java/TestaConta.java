/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        // Inicializacao da conta
        // Impressao dos dados da conta
        // Saque da conta
        // Impressao dos dados da conta
        // Deposito em conta
        // Impressao dos dados da conta
    	
    	Conta c1 = new Conta();
    	
    	c1.inicializaConta(1000, "15484", "ze", 4585, 01);
    	c1.imprimeDados();
    	c1.saque(300);
    	c1.imprimeDados();
    	c1.deposito(1000);
    	c1.imprimeDados();
    	
    }
}
