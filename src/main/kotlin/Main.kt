package org.example

import Racas.Draconato
import Personagem

fun main() {
    var personagem = Personagem(Draconato());

    personagem.iniciarPersonagem()

    println(personagem.getVida())
}