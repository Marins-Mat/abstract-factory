package model;

import interfaces.CaixaDeTexto;

public class CaixaDeTextoEscura implements CaixaDeTexto {
    @Override
    public void renderizar() {
        System.out.println("[Campo de texto ESCURO: borda cinza escura]");
    }
}
