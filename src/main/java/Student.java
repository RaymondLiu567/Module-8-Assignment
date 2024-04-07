public class Student {
    private int credits;
    private double gpa;
    private boolean isHonors;

    public Student(int credits, double gpa, boolean isHonors) {
        this.credits = credits;
        this.gpa = gpa;
        this.isHonors = isHonors;
    }

    public String getYear() {
        if (credits <= 24) {
            return "Freshman";
        } else if (credits <= 56) {
            return "Sophomore";
        } else if (credits <= 86) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public double getAdjustedGPA() {
        if (isHonors) {
            return Math.min(gpa + 1.0, 4.0);
        } else {
            return gpa;
        }
    }

    public String getLetterGrade() {
        double adjustedGPA = getAdjustedGPA();
        if (adjustedGPA >= 4.0) {
            return "A+";
        } else if (adjustedGPA >= 3.7) {
            return "A-";
        } else if (adjustedGPA >= 3.3) {
            return "B+";
        } else if (adjustedGPA >= 3.0) {
            return "B";
        } else if (adjustedGPA >= 2.7) {
            return "B-";
        } else if (adjustedGPA >= 2.3) {
            return "C+";
        } else if (adjustedGPA >= 2.0) {
            return "C";
        } else if (adjustedGPA >= 1.7) {
            return "C-";
        } else if (adjustedGPA >= 1.3) {
            return "D+";
        } else if (adjustedGPA >= 1.0) {
            return "D";
        } else {
            return "E/F";
        }
    }
}
