// https://leetcode.com/problems/reveal-cards-in-increasing-order/description/?envType=daily-question&envId=2024-04-10
package Day43;
import java.util.*;

class revealCards {
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        int[] res = deckRevealedIncreasing(deck);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }        
    }
    static int[] deckRevealedIncreasing(int[] deck) {
        int[] res = new int[deck.length];
        Arrays.fill(res, 0);
        Arrays.sort(deck);
        int k = 1,i = 0;

        while (deck.length > 0) {
            if (k == 1 && res[i] == 0) {
                res[i] = deck[0];
                deck = Arrays.copyOfRange(deck, 1, deck.length);
                k = 0;
            } else if (res[i] == 0) k = 1;

            if (i == res.length - 1) i = 0;
            else i++;
        }

        return res;
    }
}