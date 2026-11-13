package br.com.joaocarloslima.vinteum.model;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getValor() {
        if (numero > 10) {
            return 10;
        }
        return numero;
    }

    public String getImagem() {
        String nome = "";
        if (numero == 1) {
            nome = "Ace";
        } else if (numero == 11) {
            nome = "Jack";
        } else if (numero == 12) {
            nome = "Queen";
        } else if (numero == 13) {
            nome = "King";
        } else {
            nome = String.valueOf(numero);
        }
        return nome + naipe.name() + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}