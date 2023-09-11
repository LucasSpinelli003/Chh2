package br.com.fiap.solutech.model;

public class Modal {
	
	private String melhorModal;
	
	public Modal(String melhorModal) {
		super();
		this.melhorModal = melhorModal;
	}

	public String getMelhorModal() {
		return melhorModal;
	}

	public void setMelhorModal(String melhorModal) {
		this.melhorModal = melhorModal;
	}

	public int escolheModal(Veiculo veiculo){
        double pesoCalcula = veiculo.calculaPeso();
        if (pesoCalcula<=50){
        	return 1;            
        }else if(pesoCalcula<=100){
            return 2;
        }else if(pesoCalcula<=200){
            return 3;
        }else{
            return 4;
        }
    }
	
}
