package Racas

import PersonagemAtributos

class Elfo : Raca {
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