
/**
 * @author @author Frances E.A. Antwi-Donkor 
 */

import java.util.*;
public class MinutesFilter implements Filter {
    private int min;
    private int max;
    
    public MinutesFilter(int minMinutes, int maxMinutes){
        min = minMinutes;
        max = maxMinutes;
    }
    
    @Override
    public boolean satisfies(String id){
        return MovieDatabase.getMinutes(id) >= min && MovieDatabase.getMinutes(id) <= max;
    }

}
