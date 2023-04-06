
/**
 * @author @author Frances E.A. Antwi-Donkor 
 */

import java.util.*;

public class GenreFilter implements Filter {
    private String newGenre;
    public GenreFilter(String genre){
        newGenre = genre;
    }
    
    @Override
    public boolean satisfies(String id){
        return MovieDatabase.getGenres(id).contains(newGenre);
    }
}
