package model;

import interfaces.Botao;
import interfaces.CaixaDeTexto;
import interfaces.FabricaDeComponentes;

public class FabricaTemaClaro implements FabricaDeComponentes {

    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public CaixaDeTexto criarCaixaDeTexto() {
        return new CaixaDeTextoClara();
    }
}
