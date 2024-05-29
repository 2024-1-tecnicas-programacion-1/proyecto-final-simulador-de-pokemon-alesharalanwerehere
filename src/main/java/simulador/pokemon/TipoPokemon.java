package simulador.pokemon;

public enum TipoPokemon{
    NORMAL, FUEGO, AGUA, ELECTRICO, PLANTA, TIERRA, VOLADOR, LUCHA, BICHO, VENENO; 

    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor){
        switch (atacante) {
            case FUEGO:
                switch (defensor) {
                    case PLANTA:
                    case BICHO:    
                    return 2.0;

                    case AGUA:
                    return 0.5;
                }
                break;

            case AGUA:
                switch (defensor){
                    case FUEGO:
                    return 2.0;

                    case PLANTA:
                    return 0.5;
                }
                break;

            case PLANTA:
                switch(defensor){
                    case AGUA:
                    case TIERRA:
                    return 2.0;

                    case FUEGO:
                    case VENENO:
                    case BICHO:
                    return 0.5;
                }
                break;

            case VENENO:
                switch(defensor){
                    case PLANTA:
                    return 2.0;
                }
                break;

            case ELECTRICO:
                switch (defensor){
                    case AGUA:
                    case VOLADOR:
                    return 2.0;

                    case PLANTA:
                    return 0.5;
                }
                break;

            case TIERRA:
                switch(defensor){
                    case FUEGO:
                    case VENENO:
                    return 2.0;

                    case ELECTRICO:
                    return 0.0;
                    
                    case VOLADOR:
                    return 0.5;
                }
                break;

            case VOLADOR:
                switch (defensor){
                    case PLANTA:
                    case ELECTRICO:
                    case BICHO:
                    return 2.0;
                }
                break;
              
            case BICHO:
                switch(defensor){
                    case PLANTA:
                    case VOLADOR:
                    return 2.0;
                }
                break;
        }
        return 1.0;
    }
}
