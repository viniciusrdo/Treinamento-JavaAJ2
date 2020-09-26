/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	
    	Conta c1 = new Conta( 10000, "6554", "ze", "85894", 415987);
    	
    	c1.imprimeDados();
    	
    	Cliente cl1 = new Cliente("Zezin", "45896589658");
    	
    	cl1.imprimeDados();
    	
    }
}
