package Personagem

import Personagem.Racas.Raca

class Personagem() : PersonagemAtributos(8, 8, 8, 8, 8, 8) {
   var administradorAtributosPontos = AdministradorAtributosPontos();
   private var vida =  0;

   fun iniciarPersonagem(raca : Raca) {
      val statusBonus = raca.retornarAtributosAdicionais();
      adicionarAtributos(statusBonus)

      setVidaMaxima()
   }

   fun setVidaMaxima() {
      val calculadorModificador = CalculadorModificador()
      vida = 10 + calculadorModificador.calcularModificador(constituicao)
   }

   fun getVida() : Int {
      return vida
   }
}