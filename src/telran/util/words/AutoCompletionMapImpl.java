package telran.util.words;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.Predicate;

public class AutoCompletionMapImpl implements AutoCompletion{
HashMap<Character, TreeSet<String>> words = new HashMap<>();//key - first a character of a word;
//value - collection (TreeSet) of words beginning with the given first character case insensitive
@Override
/**
 * adds word 
 * with applying the method computeIfAbsent
 */
public boolean addWord(String word) {
	return words.isEmpty() ? false : words.computeIfAbsent(getKey(word), t -> 
	new TreeSet<>(String.CASE_INSENSITIVE_ORDER)).add(word);
}

private Character getKey(String word) {
	return word.toLowerCase().charAt(0);
}

@Override
public boolean removeWord(String word) {
	return words.isEmpty() ? false : removeNotEmpty(word);
}

private boolean removeNotEmpty(String word) {
	TreeSet<String> treeSet = words.get(getKey(word));
	return treeSet == null ? false : treeSet.remove(word);
}

@Override
public Iterable<String> getCompletionOptions(String prefix) {
	if(prefix.isEmpty()) {
		return new TreeSet<String>();
	}
	TreeSet<String> treeSet =  words.get(getKey(prefix));
	return null;
}
/**
 * removes words matching a given predicate
 * @param predicate
 * @return count of the removed words
 */
public int removeIf(Predicate<String> predicate) {
	//TODO
	return 0;
}
}
