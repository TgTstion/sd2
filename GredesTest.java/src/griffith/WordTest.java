package griffith;

import static org.junit.jupiter.api.Assertions.*;
/*Georgii Taisaev 3119655*/
import org.junit.jupiter.api.Test;

public class WordTest {

    // Test method to check the contains functionality
    @Test
    public void testContains() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Check if valid symbols are correctly identified
        assertTrue(word.contains('h')); // Symbol 'h' is present
        assertTrue(word.contains('o')); // Symbol 'o' is present

        // Check if invalid symbols are correctly rejected
        assertFalse(word.contains('z')); // Symbol 'z' is not present
    }

    // Test method to verify the length of the letters array
    @Test
    public void testLength() {
        Word word1 = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertEquals(5, word1.length()); // Test with a 5-character array

        Word word2 = new Word(new char[]{'j', 'a', 'v', 'a'});
        assertEquals(4, word2.length()); // Test with a 4-character array

        Word word3 = new Word(new char[]{});
        assertEquals(0, word3.length()); // Test with an empty array
    }

    // Test method to verify that the letters array is not null
    @Test
    public void testNotNull() {
        // Verify non-null letters array for a valid word
        Word word1 = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertNotNull(word1.getLetters());

        // Verify non-null letters array for an empty word
        Word word2 = new Word(new char[]{});
        assertNotNull(word2.getLetters());

        // Verify exception handling for null input
        try {
            Word word3 = new Word(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            // Verify the exception message
            assertEquals("Letters array cannot be null.", e.getMessage());
        }
    }
}
