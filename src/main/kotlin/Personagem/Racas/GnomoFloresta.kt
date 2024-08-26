package Personagem.Racas

import Personagem.PersonagemAtributos

class GnomoFloresta : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            1,
            0,
            0,
            0,
            0
        )
    }
}