package or.js.app;

public class Student 
{
	public int studentId;

	public String studentName;

	private int marks;

	private char grade;

	public char getGrade() {

		return grade;
	}
	/**
	 * Default constructor - DO NOT DELETE
	 */
	public Student() {

		studentId = 0;

		studentName = null;

		marks = 0;

		grade = ' ';

	}

	/**

	 * Parameter cosntructor

	 * @param studentId

	 * @param studentName

	 * @param marks

	 */

	public Student(int studentId, String studentName, int marks) {

		this.studentId = studentId;

		this.studentName = studentName;

		this.marks = marks;

		calculateGrade();

	}

	public int getStudentId() {

		return studentId;

	}

	public void setStudentId(int studentId) {

		this.studentId = studentId;

	}

	public String getStudentName() {

		return studentName;

	}

	public void setStudentName(String studentName) {

		this.studentName = studentName;

	}

	public int getMarks() {

		return marks;

	}

	public void setMarks(int marks) {

		this.marks = marks;

	}

	/**

	 * Method that displays the student details in the folowing format:

	 * Student [name=John Smith, studentId=123, marks=95, grade=A]

	 * @return

	 */

	public String displayDetails()

	{

		return "Student [name="+ studentName + " ,studentId=" + studentId + " , marks=" + marks + ", grade= "+ grade+"]";

	}

	//declare a method called String displayDetails() Here

	/**

	 * A PRIVATE method that calculates the grade of the student after the marks has been set.

	 */

	///declare a private method called void calculateGrade()

	private void calculateGrade()

	{

		if(marks > 90)

		{

			grade = 'A';

		}

		else if(marks > 80 && marks <= 90)

		{

			grade = 'B';

		}

		else if(marks > 70 && marks <= 80)

		{

			grade = 'C';

		}

		else if(marks > 60 && marks <= 70)

		{

			grade = 'D';

		}

		else

		{

			grade = 'E';

		}

	}

}
	
