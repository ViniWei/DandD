package Racas

import PersonagemAtributos

class Halfling : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            2,
            0,
            0,
            0,
            0
        )
    }
}