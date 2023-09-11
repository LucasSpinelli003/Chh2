package br.com.fiap.solutech.model;

import javax.swing.JOptionPane;

public class Login {
    private String registroUsuario;
    private String registroSenha;

public String getRegistroUsuario() {
    return registroUsuario;
}

public void setRegistroUsuario(String registroUsuario) {
    this.registroUsuario = registroUsuario;
}

public String getRegistroSenha() {
    return registroSenha;
}

public void setRegistroSenha(String registroSenha) {
    this.registroSenha = registroSenha;
}



public Login(String registroUsuario, String registroSenha) {
    this.registroUsuario = registroUsuario;
    this.registroSenha = registroSenha;
}

public boolean verificaLogin(){
    String usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
    String senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
    int contador = 1;

    while (!senha.equals(registroSenha)|| !usuario.equals(registroUsuario)){
        JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto, tente novamente");
        JOptionPane.showMessageDialog(null, "Tentativas restantes: "+ (2 - contador));
        usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
        senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
        contador++;
        break;


    }if(senha.equals(registroSenha)&& usuario.equals(registroUsuario)) {
        JOptionPane.showMessageDialog(null,"Acesso liberado");
        return true;
    }else if(contador<1){
        JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
        return false;
    }else {
        JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
        return false;
    }
}

	
}
