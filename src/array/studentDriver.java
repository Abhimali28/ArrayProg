package array;

import java.util.Scanner;

public class studentDriver {

	student[] s1 = new student[2];
	student s;
	Scanner sc = new Scanner(System.in);
	public void addStudent() {
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == null) {
				System.out.println("enter id");
				int id = sc.nextInt();
				System.out.println("enter name");
				String name = sc.next();
				s = new student(id, name);
				s1[i] = s;
				System.out.println("student is added");
				return;
			}
		}
		System.out.println("database is full ");

	}

	public void removeStudent() {
		System.out.println("enter id");
		int id = sc.nextInt();
		for (int i = 0; i < s1.length; i++) {
			student s = s1[i];
			if (s.id == id) {
				s1[i] = null;
				System.out.println("student is removed");
				return;
			}
		}
		System.out.println("id is not found");
	}

	public void displayStudent() {
		for (int i = 0; i < s1.length; i++) {

			if (s1[i] != null) {
				System.out.println(s1[i]);
			}
		}

	}

	public void searchStudent() {
		System.out.println("enter id");
		int id = sc.nextInt();//
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != null) {
				student s = s1[i];
				if (s.id == id) {
					System.out.println(s.name);
					int[] marks = s.marks;
					for (int j = 0; j < marks.length; j++) {
						System.out.println(marks[j]);
					}
					return;
				}
			}

		}
		System.out.println("id is not found");
	}

	public void dynamic() {

		System.out.println("1.pass 2.fail");
		switch (sc.nextInt()) {
		case 1: {

			for (int i = 0; i < s1.length; i++) {
				int c = 0;
				if (s1[i] != null) {
					student s = s1[i];
					int[] marks = s.marks;
					for (int j = 0; j < marks.length; j++) {
						if (marks[j] >= 35)
							c++;
					}
					if (c == 5) {
						System.out.println(s);
					}
				}
			}
			break;
		}
		case 2: {
			System.out.println("1. 1 sub 2.2sub 3.3sub 4.4sub 5.5sub 6.exit");
			switch (sc.nextInt()) {
			case 1: {
				for (int i = 0; i < s1.length; i++) {
					int c = 0;
					if (s1[i] != null) {
						student s = s1[i];
						int[] marks = s.marks;
						for (int j = 0; j < marks.length; j++) {
							if (marks[j] <= 35)
								c++;

						}
						if (c == 1) {
							System.out.println(s);
						}
					}

				}
				break;
			}

			case 2: {
				for (int i = 0; i < s1.length; i++) {
					int c = 0;
					if (s1[i] != null) {
						student s = s1[i];
						int[] marks = s.marks;
						for (int j = 0; j < marks.length; j++) {
							if (marks[j] <= 35)
								c++;

						}
						if (c == 2) {
							System.out.println(s);
						}
					}

				}

				break;
			}

			case 3: {
				for (int i = 0; i < s1.length; i++) {
					int c = 0;
					if (s1[i] != null) {
						student s = s1[i];
						int[] marks = s.marks;
						for (int j = 0; j < marks.length; j++) {
							if (marks[j] <= 35)
								c++;

						}
						if (c == 3) {
							System.out.println(s);
						}
					}

				}
				break;
			}
			case 4: {
				for (int i = 0; i < s1.length; i++) {
					int c = 0;
					if (s1[i] != null) {
						student s = s1[i];
						int[] marks = s.marks;
						for (int j = 0; j < marks.length; j++) {
							if (marks[j] <= 35)
								c++;

						}
						if (c == 4) {
							System.out.println(s);
						}
					}

				}
				break;
			}

			case 5: {
				for (int i = 0; i < s1.length; i++) {
					int c = 0;
					if (s1[i] != null) {
						student s = s1[i];
						int[] marks = s.marks;
						for (int j = 0; j < marks.length; j++) {
							if (marks[j] <= 35)
								c++;

						}
						if (c == 5) {
							System.out.println(s);
						}
					}

				}
				break;
			}
			}

		}
		}
	}
}