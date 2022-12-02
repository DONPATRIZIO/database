import java.util.Iterator;

public class PokemonDaoImpl {
    Iterator<Pokemon> pokemonIterator =  Pokemon.iterator();
   
    while(pokemonIterator.hasNext()){
        Pokemon p = pokemonIterator.next();
    }

    if(p.getElmentType().equals(ElmentType)){
        pokemonIterator.remove();
    }
    
}
