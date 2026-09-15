package model;

import interfaces.Botao;

public class BotaoEscuro implements Botao {
    @Override
    public void renderizar() {
        System.out.println("[Botão estilo ESCURO: fundo preto, texto branco]");
    }
}
