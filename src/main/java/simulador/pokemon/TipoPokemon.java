package simulador.pokemon;

public enum TipoPokemon{
    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA; 

    public static double obtenerMultiplicador(TipoPokemon atacante, TipoPokemon defensor){
        switch (atacante) {

            case FUEGO:
                switch (defensor) {

                    case PLANTA:
                    case BICHO:    
                    case HIELO:
                    return 2.0;

                    case AGUA:
                    case ROCA:
                    case ACERO:
                    return 0.5;

                }
                break;

            case AGUA:
                switch (defensor){

                    case FUEGO:
                    case ROCA:
                    return 2.0;

                    case PLANTA:
                    return 0.5;

                }
                break;

            case PLANTA:
                switch(defensor){

                    case AGUA:
                    case ROCA:
                    case TIERRA:
                    return 2.0;

                    case FUEGO:
                    case VENENO:
                    case BICHO:
                    case ACERO:
                    return 0.5;

                }
                break;

            case VENENO:
                switch(defensor){

                    case PLANTA:
                    case HADA:
                    return 2.0;

                    case ROCA:
                    case FANTASMA:
                    return 0.5;

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

            case PSIQUICO:
                switch(defensor){

                    case VENENO:
                    case LUCHA:
                    return 2.0;
                
                }   
                break;

            case ROCA:
                switch(defensor){

                    case FUEGO:
                    case VOLADOR:
                    case ACERO:
                    case BICHO:
                    case HIELO:
                    return 2.0;

                    case LUCHA:
                    return 0.5;

                }
                break;

            case TIERRA:
                switch(defensor){

                    case FUEGO:
                    case VENENO:
                    case ROCA:
                    case ACERO:
                    return 2.0;

                    case ELECTRICO:
                    return 0.0;
                    
                    case VOLADOR:
                    return 0.5;

                }
                break;

            case NORMAL:
                switch(defensor){

                    case FANTASMA:
                    return 0.0;

                }
                break;

            case VOLADOR:
                switch (defensor){

                    case PLANTA:
                    case ELECTRICO:
                    case BICHO:
                    return 2.0;

                    case ROCA:
                    return 0.5;

                }
                break;

            case HADA:
                switch (defensor){

                    case PSIQUICO:
                    return 2.0;   

                }
                break;

            case LUCHA:
                switch (defensor){

                    case ROCA:
                    case NORMAL:
                    case HIELO:
                    return 2.0;

                    case PSIQUICO:
                    case HADA:
                    case FANTASMA:
                    return 0.5;

                }
                break;

            case ACERO:
                switch(defensor){

                    case FUEGO:
                    case ROCA:
                    case HADA:
                    case LUCHA:
                    return 2.0;

                    case PSIQUICO:
                    return 0.5;

                }
                break;    
            case BICHO:
                switch(defensor){

                    case PLANTA:
                    case VOLADOR:
                    return 2.0;

                    case ACERO:
                    case FANTASMA:
                    return 0.5;

                }
                break;

            case HIELO:
                switch(defensor){

                    case PLANTA:
                    case TIERRA:
                    return 2.0;

                }
                break;

            case FANTASMA:
                switch(defensor){

                    case FANTASMA:
                    return 2.0;

                    case NORMAL:
                    return 0.0;

                    case VENENO:
                    return 0.5;

                }
                break;

        }
        
        return 1.0;

    }
}
