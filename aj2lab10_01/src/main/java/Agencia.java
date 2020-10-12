/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */



// 3 - A) É possivel acessar o método AjustarLimiteIndividual porque ambos os métodos estão dentro da mesma classe.
// 3 - B) O projetista aplicou o modificador "Abstract" pois não é possível utilizar o método da forma em que ele está na classe "Agencia", ele deverá ser modificado para 
//cada subclasse de "Agencia", conforme o procolo da mesma.
public abstract class Agencia {

    private String numero;
    private Banco banco;

    /**
     * @param num
     *            Numero da agencia
     * @param bc
     *            banco ao qual a agencia pertence
     */
    public Agencia(String num, Banco bc) {
        numero = num;
        banco = bc;
    }

    /**
     * @return numero do banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return numero da agencia
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param b
     *            banco
     */
    public void setBanco(Banco b) {
        banco = b;
    }


    /**
     * @param num
     *            numero da agencia
     */
    public void setNumero(String num) {
        numero = num;
    }
    
    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("Agencia no. " + numero);
        banco.imprimeDados();
    }
    
    public void ajustarLimites(ContaEspecial[] contasEspeciais) {
        System.out.println("===================================================================");
        System.out.println("Agencia: " + this.getNumero() + " ajustando limites");
        for (int i = 0; i < contasEspeciais.length; i++) {
            ContaEspecial ce = contasEspeciais[i];
            if (ce != null) {
                if (ce.getAgencia() != this) {
                    System.out.println("A conta " + ce.getNumero() + " nao pertence a esta agencia");
                } else {
                    double limiteAntigo = ce.getLimite();
                    ajustarLimiteIndividual(ce); // metodo abstrato
                    double limiteAjustado = ce.getLimite();
                    System.out.println("conta " + ce.getNumero() +
                                       "\tlimite antigo: " + limiteAntigo +
                                       "\tlimite ajustado: " + limiteAjustado);
                }
            }
        }
        System.out.println("limites ajustados");
        System.out.println("===================================================================");

        
    }
    
    protected abstract void ajustarLimiteIndividual(ContaEspecial contaEspecial);

}