/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 *
 * 
 * 1) Modifique esta classe para que herde de Agencia
 * 
 * 2) Acrescente um construtor valido. 
 * 
 * 3) Sobrescreva o metodo abstrato ajustarLimiteIndividual
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver negativo, abaixo de -5000.00 o limite deve ser ajustado para 1000.00
 *    b) se o saldo estiver positivo, abaixo de +5000.00 o limite deve ser ajustado para 30% do saldo  
 *    c) se o saldo estiver positivo, acima de  +5000.00 o limite deve ser ajustado para 50% do saldo
 * 
 */
public class AgenciaPremium extends Agencia{
	  
	public AgenciaPremium(String num, Banco bc) {
	        super(num, bc);
	    }
	
	protected void ajustarLimiteIndividual(ContaEspecial ContaEspecial){
		if(ContaEspecial.getSaldo() < -5000) {	// Condição A)
			ContaEspecial.setLimite(1000); 
		}else if(ContaEspecial.getSaldo() > 0 && ContaEspecial.getSaldo() < 5000) {	 //Condição B)
			ContaEspecial.setLimite(ContaEspecial.getSaldo() * 0.3);
		}else if(ContaEspecial.getSaldo() > 5000) {	//Condição C)
			ContaEspecial.setLimite(ContaEspecial.getSaldo() * 0.5);
		}
	}
}