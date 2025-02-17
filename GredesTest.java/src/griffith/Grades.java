package griffith;
/*Georgii Taisaev 3119655*/

// Import necessary classes for operations
import java.util.stream.IntStream;

public class Grades {

    // Method to find the maximum grade in the array
    public int gradesMax(int[] grades) {
        // Check if the grades array is null or empty and throw an exception if true
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grades array cannot be null or empty.");
        }

        // Initialize max with the first grade in the array
        int max = grades[0];
        // Iterate through the grades array to find the maximum value
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        // Return the maximum grade
        return max;
    }

    // Method to calculate the total of all grades in the array
    public int gradesTotal(int[] grades) {
        // Use IntStream to calculate the sum of all grades
        int sum = IntStream.of(grades).sum();
        return sum; // Return the total
    }

    // Method to calculate the average of grades in the array
    public double gradesAverage(int[] grades) {
        // Handle the case where the array is empty by returning 0
        if (grades.length == 0) { 
            return 0; 
        }
        // Calculate the sum of all grades
        int sum = 0;
        for (int i = 0; i < grades.length; i++) { 
            sum += grades[i];
        }
        // Calculate the average by dividing the sum by the number of grades
        double average = (double) sum / grades.length;
        return average; // Return the average
    }

    // Method to count the number of grades below a certain minimum
    public int countFails(int[] grades, int minGrade) {
        // Initialize a counter
        int count = 0;
        // Iterate through the grades array to check for grades below the minimum
        for (int i = 0; i < grades.length; i++) {
            if (minGrade > grades[i]) {
                count++; // Increment the counter if the grade is below the minimum
            }
        }
        return count; // Return the count of failing grades
    }
}

