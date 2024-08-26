package Personagem.Racas

import Personagem.PersonagemAtributos

class Drow : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            0,
            0,
            0,
            0,
            1
        )
    }
}
