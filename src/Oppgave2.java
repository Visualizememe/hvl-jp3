
public class Oppgave2 {
	public static void main (String[] args) {
        int[] grades = {10, 20, 30, 40, 50, 60, 70, 80, 90, 85};

        for (int currentScore : grades) {
            char retrievedGrade = calculateStudentGrade(currentScore);
            System.out.println("Grade retrieved from score " + currentScore + ": " + retrievedGrade);
        }
    }

    public static char calculateStudentGrade(int totalStudentScore) {

        // We want valid input score only
        if (totalStudentScore < 0 || totalStudentScore > 100) {
            throw new Error("Invalid totalStudentScore: " + totalStudentScore + ". Expected: 0 <= score <= 100");
        }

        // Starts with 'A' and gets changed depending on their score below
        char studentGrade = 'A';

        if (totalStudentScore <= 39) {
            studentGrade = 'F';
        } else if (totalStudentScore <= 49) {
            studentGrade = 'E';
        } else if (totalStudentScore <= 59) {
            studentGrade = 'D';
        } else if (totalStudentScore <= 79) {
            studentGrade = 'C';
        } else if (totalStudentScore <= 89) {
            studentGrade = 'B';
        }

        return studentGrade;
    }
}
