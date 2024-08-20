class Personagem(var raca: Raca) : PersonagemStats(8, 8, 8, 8, 8, 8) {
   init {
      var statusBonus = raca.retornarStatusAdicionais();
      adicionarStatus(statusBonus)
   }

   fun adicionarStatus(personagemStats: PersonagemStats) {
      this.forca += personagemStats.forca;
      this.destreza += personagemStats.destreza;
      this.constituicao += personagemStats.constituicao;
      this.inteligencia += personagemStats.inteligencia;
      this.sabedoria += personagemStats.sabedoria;
      this.carisma += personagemStats.carisma;
   }

}