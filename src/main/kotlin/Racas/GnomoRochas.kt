package Racas

import PersonagemAtributos

class GnomoRochas : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            0,
            1,
            0,
            0,
            0
        )
    }
}