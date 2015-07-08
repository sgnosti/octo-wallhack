package de.sgnosti.playground.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public class DataGenerator<T> {
    private static Logger LOGGER = Logger.getLogger(DataGenerator.class);

    Map<String, String> dictionary;

    public void loadDictionary(Path path) {
	try {
	    Files.lines(path).forEach((word) -> dictionary.put(word, null));
	    LOGGER.info("Finished reading " + dictionary.size() + " words.");
	} catch (final IOException e) {
	    LOGGER.error("Could not read dictionary. " + e);
	}
    }

    public String add(String word, String meaning) {
	String result = dictionary.get(word);
	if (result == null)
	    result = meaning;
	else
	    result += ". " + meaning;
	dictionary.put(word, result);
	return result;
    }

    public String search(String word) {
	return dictionary.get(word);
    }

    public Map<String, String> getDictionary() {
	return Collections.unmodifiableMap(dictionary);
    }

    public Stream<String> getWords() {
	return dictionary.keySet().stream();
    }
}
