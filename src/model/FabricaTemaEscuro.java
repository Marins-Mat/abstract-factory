package model;

import interfaces.Botao;
import interfaces.CaixaDeTexto;
import interfaces.FabricaDeComponentes;

public class FabricaTemaEscuro implements FabricaDeComponentes {
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public CaixaDeTexto criarCaixaDeTexto() {
        return new CaixaDeTextoEscura();
    }
}
