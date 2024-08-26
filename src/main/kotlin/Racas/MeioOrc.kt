package Racas

import PersonagemAtributos

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