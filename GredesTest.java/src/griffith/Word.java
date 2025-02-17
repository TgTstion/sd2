package griffith;
/*Georgii Taisaev 3119655*/
public class Word {
    // Attribute to store the letters
    private char[] letters;

    // Constructor to initialize the letters array
    public Word(char[] letters) {
        // Ensure the letters array is not null
        if (letters == null) {
            throw new IllegalArgumentException("Letters array cannot be null.");
        }
        this.letters = letters; // Assign the letters to the instance variable
    }

    // Method to check if a symbol is contained in the letters array
    public boolean contains(char symbol) {
        // Iterate through each letter in the array
        for (char letter : letters) {
            // Return true if the symbol matches a letter
            if (letter == symbol) {
                return true;
            }
        }
        return false; // Return false if the symbol is not found
    }

    // Method to get the length of the letters array
    public int length() {
        return letters.length; // Return the length of the array
    }

    // Method to return the letters array
    public char[] getLetters() {
        return letters; // Return the array of letters
    }
}
