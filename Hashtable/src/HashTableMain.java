/**
 * Purpose : Ability to implement hashtable using Linked List
 *           Ability to find frequency of words in a sentence like “To be or not to be”
 * Output : to = 2, be = 2, or = 1, not = 1
 *
 * @author : SAYANI KOLEY
 * @since : 02.07.2021
 */

public class HashTableMain {
    public static void main(String[] args) {
        HashtableImpl<String, Integer> hashImpl = new HashtableImpl();
        String message = "To be or not to be";

        //String to String[] conversion.
        //Split the words when a white space comes up.
        //Convert all the words in lowercase
        String[] messageArray = message.toLowerCase().split(" ");

        //Iterate within the array
        for(String word: messageArray) {
            //Search for the word in the linked list
            Integer value =  hashImpl.get(word);
            //If not found, frequency of the word remains 1
            if( value == null)
                value = 1;
            else
                //If found, frequency of the word increases by 1
                value = value + 1;
            hashImpl.add(word , value);
        }
        //Display the linked list
        System.out.println(hashImpl);
    }
}
