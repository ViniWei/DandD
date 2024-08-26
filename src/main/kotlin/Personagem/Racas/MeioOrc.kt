package Personagem.Racas

import Personagem.PersonagemAtributos

class MeioOrc : Raca {
    override fun retornarAtributosAdicionais(): PersonagemAtributos {
       return PersonagemAtributos(
           2,
           0,
           0,
           0,
           0,
           0
       )
    }
}