package model;

import interfaces.Botao;

public class BotaoClaro implements Botao {
    @Override
    public void renderizar() {
        System.out.println("[Botão estilo CLARO: fundo branco, texto preto]");
    }
}
