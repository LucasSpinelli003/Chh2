package br.com.fiap.solutech.model;

import br.com.fiap.solutech.exception.ValorInvalido;

public class Chamado {
    private String nomeCompleto ;
    private String dataDeNascimento ;
    private String rg ;
    private String cpf ;
    private String descricaoDoProblema ;
    private Contato contato;
    private Veiculo veiculo;
    private Endereco endereco;
    private Login login;

	private LocalChamado localChamado;
    private Modal modal;

    public Chamado( String nomeCompleto, String dataDeNascimento, String rg, String cpf,
    		String descricaoDoProblema, Contato contato, 
    		Veiculo veiculo, Endereco endereco, Login login,LocalChamado localChamado, Modal modal) throws ValorInvalido{
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.rg = rg;
        if(rg.length()>12) {
        	throw new ValorInvalido("O rg deve ter no maximo 12 caracteres");
        }
        this.cpf = cpf;
        if(cpf.length()>14) {
        	throw new ValorInvalido("O cpf deve ter no maximo 14 caracteres");
        }
        this.descricaoDoProblema = descricaoDoProblema;
        this.contato = contato;
        this.veiculo = veiculo;
        this.endereco = endereco;
        this.login = login;
        this.localChamado = localChamado;
        this.modal = modal;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public LocalChamado getLocalChamado() {
		return localChamado;
	}

	public void setLocalChamado(LocalChamado localChamado) {
		this.localChamado = localChamado;
	}

	public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        
        return cpf;
    }

    public void setCpf(String cpf) {
        
        this.cpf = cpf;
    }

    public String getDescricaoDoProblema() {
        
        return descricaoDoProblema;
    }

    public void setDescricaoDoProblema(String descricaoDoProblema) {
        
        this.descricaoDoProblema = descricaoDoProblema;
    }
    public Modal getModal() {
    	return modal;
    }
    
    public void setModal(Modal modal) {
    	this.modal = modal;
    }
}
