/*
 /*
 Brandon Gerber
 	10/26/2023
 	COP1250C
 	GRADES.JAVA
 */
package grades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class grades {
    public static void main(String[] args) {
        // intialize variable counters for each letter grade
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        try {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader("C:\\grades.txt"));

           
            String line;
            while ((line = reader.readLine()) != null) {
                
                if (!line.isEmpty()) {
                    int grade = Integer.parseInt(line.trim());

                    // based on percent determine letter grade
                    if (grade >= 90 && grade <= 100) {
                        countA++;
                    } else if (grade >= 80 && grade <= 89) {
                        countB++;
                    } else if (grade >= 70 && grade <= 79) {
                        countC++;
                    } else if (grade >= 60 && grade <= 69) {
                        countD++;
                    } else {
                        countF++;
                    }
                }
            }

            // close the file
            reader.close();
            
            System.out.println("Number of A grades: " + countA);
            System.out.println("Number of B grades: " + countB);
            System.out.println("Number of C grades: " + countC);
            System.out.println("Number of D grades: " + countD);
            System.out.println("Number of F grades: " + countF);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}