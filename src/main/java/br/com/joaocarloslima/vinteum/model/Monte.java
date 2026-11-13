package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas;

    public Monte() {
        cartas = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (int i = 1; i <= 13; i++) {
                cartas.add(new Carta(i, naipe));
            }
        }
        embaralhar();
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }

    public int getQuantidade() {
        return cartas.size();
    }
}