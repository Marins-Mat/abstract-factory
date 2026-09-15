package model;

import interfaces.Botao;
import interfaces.CaixaDeTexto;
import interfaces.FabricaDeComponentes;

// Cliente — não conhece as classes concretas, só a fábrica abstrata
public class TelaLogin {
    private final Botao botao;
    private final CaixaDeTexto campoUsuario;

    public TelaLogin(FabricaDeComponentes fabrica) {
        this.botao = fabrica.criarBotao();
        this.campoUsuario = fabrica.criarCaixaDeTexto();
    }

    public void desenhar() {
        System.out.println("Montando tela de login...");
        campoUsuario.renderizar();
        botao.renderizar();
    }
}