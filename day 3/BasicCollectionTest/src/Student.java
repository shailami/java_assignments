public class Student implements Comparable<Student> {
	private String name;
	private int rollno;
	private int age;
	private String favFruit;

	protected Student(String name, int rollno, int age, String favFruit) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.favFruit = favFruit;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age
				+ ", favFruit=" + favFruit + "]";
	}

	public String getName() {
		return name;
	}

	public String getFavFruit() {
		return favFruit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((favFruit == null) ? 0 : favFruit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (favFruit == null) {
			if (other.favFruit != null)
				return false;
		} else if (!favFruit.equals(other.favFruit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student student) {
		return name.compareTo(student.name);
	}

}
