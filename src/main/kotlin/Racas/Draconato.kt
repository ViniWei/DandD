package Racas

import PersonagemAtributos

class Draconato : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            2,
            0,
            0,
            0,
            0,
            1
        )
    }

}
