package Personagem.Racas;

import Personagem.PersonagemAtributos

public class AnaoMontanha : Raca {
    override fun retornarAtributosAdicionais() : PersonagemAtributos {
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
