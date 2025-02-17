package griffith;

import static org.junit.Assert.*;
/*Georgii Taisaev 3119655*/
import org.junit.Test;

public class GradesTest {

    // Test method for gradesMax
    @Test	
    public void testGradesMax() {
        Grades grades = new Grades();
        // Test case with positive numbers
        assertEquals(92, grades.gradesMax(new int[]{70, 85, 92, 88, 79}));
        // Test case with negative numbers
        assertEquals(-5, grades.gradesMax(new int[]{-10, -20, -5, -30}));
        // Test case with a single element
        assertEquals(1, grades.gradesMax(new int[]{1}));
    }

    // Test method for gradesTotal
    @Test
    public void testGradesTotal() {
        Grades grades = new Grades();
        // Test case with a mix of positive numbers
        assertEquals(414, grades.gradesTotal(new int[]{70, 85, 92, 88, 79}));
        // Test case with negative numbers
        assertEquals(-65, grades.gradesTotal(new int[]{-10, -20, -5, -30}));
        // Test case with an empty array
        assertEquals(0, grades.gradesTotal(new int[]{}));
    }

    // Test method for gradesAverage
    @Test
    public void testGradesAverage() {
        Grades grades = new Grades();
        // Test case with positive numbers
        assertEquals(82.8, grades.gradesAverage(new int[]{70, 85, 92, 88, 79}), 0.01);
        // Test case with negative numbers
        assertEquals(-16.25, grades.gradesAverage(new int[]{-10, -20, -5, -30}), 0.01);
        // Test case with an empty array
        assertEquals(0.0, grades.gradesAverage(new int[]{}), 0.01);
    }

    // Test method for countFails
    @Test
    public void testCountFails() {
        Grades grades = new Grades();
        // Test case with no grades below minimum
        assertEquals(0, grades.countFails(new int[]{70, 85, 40, 30, 50}, 20));
        // Test case with all grades above minimum
        assertEquals(0, grades.countFails(new int[]{60, 70, 80}, 20));
        // Test case with an empty array
        assertEquals(0, grades.countFails(new int[]{}, 20));
    }
}

