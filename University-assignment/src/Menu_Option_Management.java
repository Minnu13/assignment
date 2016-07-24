import java.util.Scanner;

public class Menu_Option_Management {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Teachers_Menu_Option tmo = new Teachers_Menu_Option();
		Student_Menu_Option smo = new Student_Menu_Option();

		do {
			System.out.println("\t\t\tTeacher Record Menu");
			System.out.println("\t\t1) Teacher Menu\n");
			System.out.println("\t\t2) Student Menu\n");
			System.out.println("ENter Choice: ");
			int option = scan.nextInt();

			switch (option) {
			case 1:
				tmo.teacher_Func();
				break;

			case 2:
				smo.student_Func();
				break;

			default:
				break;
			}
		} while (true);
	}
}
