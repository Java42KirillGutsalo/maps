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
	
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean removeWord(String word) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterable<String> getCompletionOptions(String prefix) {
	// TODO Auto-generated method stub
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
