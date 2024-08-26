package Racas

import PersonagemAtributos

class AltoElfo : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            0,
            0,
            1,
            0,
            0
        )
    }
}