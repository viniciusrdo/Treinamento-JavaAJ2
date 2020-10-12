public class TesteRuntimeExceptions {

    public static void main(String[] args) {
        // Leitura do parametro digitado pelo usuario como parametro do main
        String parametro1 = "teste";
        int numero = Integer.parseInt(parametro1);
    }
}





/*
 * 
 *	Exceptions lançadas:
 *
 *	java.lang.ArrayIndexOutOfBoundsException
 *	java.lang.NumberFormatException
 *
 *	Quando a JVM se depara com uma exception, a JVM aborta a execução do script e lança o código da exceção 
 *	
 *
 */
 