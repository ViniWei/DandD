package Racas

import PersonagemAtributos

class AnaoColina : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            0,
            0,
            0,
            1,
            0
        )
    }
}
