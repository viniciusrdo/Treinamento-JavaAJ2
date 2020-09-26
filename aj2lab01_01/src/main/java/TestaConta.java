/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	
    	Conta c1 = new Conta();
    	
    	c1.agencia = 4554;
    	c1.banco = 89;
    	c1.numero = "458569";
    	c1.saldo = 958412;
    	c1.titular = "Zezin";
    	
    	
    	System.out.println("AGENCIA: \t" + c1.agencia + " \tBanco: " + c1.banco + "\nNUMERO:" + c1.numero + "\nTITULAR: " + c1.titular + "\nSALDO: " + c1.saldo);
    }
}
