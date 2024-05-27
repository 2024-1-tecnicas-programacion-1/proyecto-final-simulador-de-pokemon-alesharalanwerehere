package simulador;

class Batalla {
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Ahora, va a pelear: " + pokemon1.getNombre() + " y " + pokemon2.getNombre());
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            pokemon1.atacar(pokemon2);
            if (pokemon2.getSalud() > 0) {
                pokemon2.atacar(pokemon1);
            }
        }
        if (pokemon1.getSalud() <= 0) {
            System.out.println(pokemon1.getNombre() + " te han debilitado" + pokemon2.getNombre() + " ganaste");
        } else {
            System.out.println(pokemon2.getNombre() + " ha an debilitado" + pokemon1.getNombre() + " ganaste");
        }
    }
    
   public Pokemon iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2){
        return pokemon1;
   }
}
