import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithms_playground {
    public static void main(String[] args) {
        int[] tab = {6,5,4,3,2,1};
        reverse(tab);
        System.out.println(Arrays.toString(tab));
        //----------------------------------------
        join(tab, "~");
        joinThroughLoop(tab,"~");

    }

    public static void reverse(int[] tab){
        //reverse tab : [1,2,3] -> [3,2,1]
        int temp;

        for (int i = 0; i < tab.length/2; i++) { //on doit /2 car inversion miroir
            temp = tab[i];
            tab[i] = tab[tab.length-i-1]; // Les valeurs du tableau vont de 0->5 (donc 6 éléments). donc si juste -i, au 1er passage, on essaie de prendre l'élément à la case 6 du tableau mais elle n'existe pas car s'arrête à 5.
            tab[tab.length-i-1] = temp;
        }
    }

    public static void join(int[] tab, String separator){
        String tabAsString = Arrays.toString(tab);
        tabAsString = tabAsString
                .replace(",",separator)
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");
        System.out.println(tabAsString);
    }

    public static void joinThroughLoop(int[] tab, String separator){
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

    public static void take(){
        //Creates a slice of array with n elements taken from the beginning.

    }

    public static void uniq(){
    }
}
