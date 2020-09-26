/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    	
    	
    	
    	Conta c1 = new Conta();
    	
    	c1.inicializaConta(1000, "1526", "6541", 6554, 415);
    	c1.deposito(500);
    	c1.imprimeDados();
    	c1.saque(500);
    	c1.getSaldo();
    	c1.saque(10000);
    	c1.getSaldo();
    	
    }
}
