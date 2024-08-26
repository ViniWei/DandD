package Racas

import PersonagemAtributos

class Anao : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            0,
            2,
            0,
            0,
            0
        )
    }
}