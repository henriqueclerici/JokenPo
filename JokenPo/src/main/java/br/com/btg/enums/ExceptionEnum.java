package br.com.btg.enums;

public enum ExceptionEnum {
	
	ERRO_JOGADA_INVALIDA("Jogada inválida"),
	ERRO_JOGADA_NAO_ENCONTRADA("Jogada não encontrada");
	
	private String erro;

	private ExceptionEnum(String erro) {
		this.erro = erro;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}
	
	
	
	

}
