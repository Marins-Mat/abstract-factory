package model;

import interfaces.CaixaDeTexto;

public class CaixaDeTextoClara implements CaixaDeTexto {
    @Override
    public void renderizar() {
        System.out.println("[Campo de texto CLARO: borda cinza clara]");
    }
}
