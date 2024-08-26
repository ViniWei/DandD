package org.example

import Personagem.Personagem
import Personagem.Racas.*

fun main() {
    var racaInicial : Raca;

    var personagem = Personagem()
    adicionarAtributosIniciais(personagem)

    racaInicial = escolherRaca()
    personagem.iniciarPersonagem(racaInicial)

    println()
    println("Vida: " + personagem.getVida())
    mostrarAtributos(personagem)
}

fun mostrarAtributos(personagem: Personagem) {
    println("Forca: " + personagem.forca)
    println("Destreza: " + personagem.destreza)
    println("Constituicao: " + personagem.constituicao)
    println("Inteligencia: " + personagem.inteligencia)
    println("Sabedoria: " + personagem.sabedoria)
    println("Carisma: " + personagem.carisma)
}

fun adicionarAtributosIniciais(personagem: Personagem) {
    if (personagem.administradorAtributosPontos.pontos <= 0) {
        return;
    }

    println()
    println("Pontos restantes: " + personagem.administradorAtributosPontos.pontos)
    mostrarAtributos(personagem)
    println()

    println("(1) - Forca")
    println("(2) - Destreza")
    println("(3) - Constituicao")
    println("(4) - Inteligencia")
    println("(5) - Sabedoria")
    println("(6) - Carisma")

    print("Escolha: ")
    var escolha = readln()

    when (escolha.toInt()) {
        -1 -> return
        1 -> {
            if (personagem.administradorAtributosPontos.VerificarAdicaoAtributoEDiminuirPontos(personagem.forca)) {
                personagem.forca += 1
                adicionarAtributosIniciais(personagem)
            }
        }
        2 -> {
            if (personagem.administradorAtributosPontos.VerificarAdicaoAtributoEDiminuirPontos(personagem.destreza)) {
                personagem.destreza += 1
                adicionarAtributosIniciais(personagem)
            }
        }
        3 -> {
            if (personagem.administradorAtributosPontos.VerificarAdicaoAtributoEDiminuirPontos(personagem.constituicao)) {
                personagem.constituicao += 1
                adicionarAtributosIniciais(personagem)
            }
        }
        4 -> {
            if (personagem.administradorAtributosPontos.VerificarAdicaoAtributoEDiminuirPontos(personagem.inteligencia)) {
                personagem.inteligencia += 1
                adicionarAtributosIniciais(personagem)
            }
        }
        5 -> {
            if (personagem.administradorAtributosPontos.VerificarAdicaoAtributoEDiminuirPontos(personagem.sabedoria)) {
                personagem.sabedoria += 1
                adicionarAtributosIniciais(personagem)
            }
        }
        6 -> {
            if (personagem.administradorAtributosPontos.VerificarAdicaoAtributoEDiminuirPontos(personagem.carisma)) {
                personagem.carisma += 1
                adicionarAtributosIniciais(personagem)
            }
        }
        else -> adicionarAtributosIniciais(personagem)
    }

}

fun escolherRaca() : Raca {
    println("- Escolher raca - ")

    println("(1) - Humano")
    println("(2) - Anão")
    println("(3) - Anão da montanha")
    println("(4) - Anao da Colina")
    println("(5) - Draconato")
    println("(6) - Drow")
    println("(7) - Elfo")
    println("(8) - Gnomo da Floresta")
    println("(9) - Gnomo das rochas")
    println("(10) - Halfling")
    println("(11) - halfling Pes Leves")
    println("(12) - Halfling Robusto")
    println("(13) - Meio Elfo")
    println("(14) - Meio Orc")
    println("(15) - Alto Elfo")

    print("Escolha: ")
    var escolha = readln()

    when (escolha.toInt()) {
        1  -> return Humano()
        2  -> return Anao()
        3  -> return AnaoMontanha()
        4  -> return AnaoColina()
        5  -> return Draconato()
        6  -> return Drow()
        7  -> return Elfo()
        8  -> return GnomoFloresta()
        9  -> return GnomoRochas()
        10 -> return Halfling()
        11 -> return HalflingPesLeves()
        12 -> return HalflingRobusto()
        13 -> return MeioElfo()
        14 -> return MeioOrc()
        15 -> return AltoElfo()
        else -> escolherRaca()
    }

    return Humano()
}