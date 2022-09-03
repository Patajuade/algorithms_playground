import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithms_playground {
    public static void main(String[] args) {
        //----------------------------------------
        int[] tab = {6,5,4,3,2,1};
        //----------------------------------------
        System.out.println("\n------- Reverse Method -------");
        reverse(tab);
        //----------------------------------------
        System.out.println("\n------- Join Method -------");
        join(tab, "~");
        joinThroughLoop(tab,"~");
        //----------------------------------------
        System.out.println("\n------- Take Method -------");
        int[] tabForTakeMethod = {7,8,9,10,11};
        take(tabForTakeMethod,2);
        //----------------------------------------
    }

    public static void reverse(int[] tab){ //Reverses array so that the first element becomes the last, the second element becomes the second to last, and so on.
        int temp;
        System.out.println(Arrays.toString(tab));
        for (int i = 0; i < tab.length/2; i++) { //on doit /2 car inversion miroir
            temp = tab[i];
            tab[i] = tab[tab.length-i-1]; // Les valeurs du tableau vont de 0->5 (donc 6 éléments). donc si juste -i, au 1er passage, on essaie de prendre l'élément à la case 6 du tableau mais elle n'existe pas car s'arrête à 5.
            tab[tab.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(tab));
    }

    public static void join(int[] tab, String separator){ //Converts all elements in array into a string separated by separator.
        String tabAsString = Arrays.toString(tab);
        tabAsString = tabAsString
                .replace(",",separator)
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");
        System.out.println(tabAsString);
    }

    public static void joinThroughLoop(int[] tab, String separator){ //Converts all elements in array into a string separated by separator.
        String result = "";
        int index = 0;

        for(int t : tab){
            result+= t;
            if(index < tab.length-1){
                result += separator;
            }
            index++;
        }
        System.out.println(result);
    }

    public static int[] take(int[] tab, int sliceToTake){ //Creates a slice of array with n elements taken from the beginning.
        System.out.println("Slice to take : " + sliceToTake);
        int[] result = new int[sliceToTake];
        for(int i=0 ; i<sliceToTake ; i++){
            result[i] = tab[i];
            if(result.length>tab.length){
                System.out.println();
                System.out.println("Result tab & Original tab : " + Arrays.toString(tab));
                return tab;
            }
        }
        System.out.println("Original tab : "+ Arrays.toString(tab));
        System.out.println("Result tab : " + Arrays.toString(result));
        return result;
    }

    public static void uniq(){ //Creates a duplicate-free version of an array, using SameValueZero for equality comparisons,
        // in which only the first occurrence of each element is kept. The order of result values is determined by the order they occur in the array.
    }
}
