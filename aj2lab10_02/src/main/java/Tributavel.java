
public interface Tributavel {
	
	public void setDescricaoTributavel(String descricao);
	
	public String getDescricaoTributavel();
	
	public void setNomeImposto(String nome);
	
	public String getNomeImposto();
		
	public double calcularImpostos();
	
}
