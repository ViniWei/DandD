package Personagem.Racas

import Personagem.PersonagemAtributos

class MeioElfo : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
        return PersonagemAtributos(
            0,
            0,
            0,
            0,
            0,
            2
        )
    }
}