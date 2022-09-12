package school.management.system;


/**

 * Create by Igor on 09/06/2022
 * This class is responsible for keeping
 * track of students fees, name, grade & fees paid


**/

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */

    public Student( int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees
     */

    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }

}
