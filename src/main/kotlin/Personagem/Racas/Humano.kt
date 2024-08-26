package Personagem.Racas

import Personagem.PersonagemAtributos

class Humano : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            1,
            1,
            1,
            1,
            1,
            1
        )
    }
}