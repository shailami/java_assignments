import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;
	private Student s5;
	private Student s6;
	Set<Student> set = new LinkedHashSet<Student>();
	SortedSet<Student> set1 = new TreeSet<Student>();
	HashMap<String, String> hashMap = new HashMap<String, String>();
	private String result = "";

	@Before
	public void setUp() {
		s1 = new Student("shailaja", 102380, 21, "Mango");
		s2 = new Student("priyanka", 482567, 21, "orange");
		s3 = new Student("hemlata", 7453723, 21, "banana");
		s4 = new Student("shubham", 93462653, 21, "apple");
		s5 = new Student("tejas", 348736, 21, "litchi");
		s6 = new Student("shailaja", 102380, 21, "Mango");
	}

	@Test
	public void MaintainingOrderTest() {
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			result += iterator.next().toString();
		}
		String expected = "Student [name=shailaja, rollno=102380, age=21, favFruit=Mango]"
				+ "Student [name=priyanka, rollno=482567, age=21, favFruit=orange]"
				+ "Student [name=hemlata, rollno=7453723, age=21, favFruit=banana]"
				+ "Student [name=shubham, rollno=93462653, age=21, favFruit=apple]"
				+ "Student [name=tejas, rollno=348736, age=21, favFruit=litchi]";
		assertEquals(expected, result);
	}

	@Test
	public void NaturalOrderTest() {
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		set1.add(s5);
		set1.add(s6);

		Iterator<Student> iterator = set1.iterator();
		while (iterator.hasNext()) {
			result += iterator.next().toString();
		}
		String expected = "Student [name=hemlata, rollno=7453723, age=21, favFruit=banana]"
				+ "Student [name=priyanka, rollno=482567, age=21, favFruit=orange]"
				+ "Student [name=shailaja, rollno=102380, age=21, favFruit=Mango]"
				+ "Student [name=shubham, rollno=93462653, age=21, favFruit=apple]"
				+ "Student [name=tejas, rollno=348736, age=21, favFruit=litchi]";
		assertEquals(expected, result);
	}

	@Test
	public void DisplayAllStudentNameAndFavouriteFruitHashMap() {
		hashMap.put(s1.getName(), s1.getFavFruit());
		hashMap.put(s2.getName(), s2.getFavFruit());
		hashMap.put(s3.getName(), s3.getFavFruit());
		hashMap.put(s4.getName(), s4.getFavFruit());
		hashMap.put(s5.getName(), s5.getFavFruit());
		hashMap.put(s6.getName(), s6.getFavFruit());

		for (Map.Entry e : hashMap.entrySet()) {
			result += e.getKey() + "," + e.getValue();
		}
		String expected = "shubham,apple" + "shailaja,Mango" + "hemlata,banana"
				+ "priyanka,orange" + "tejas,litchi";
		assertEquals(expected, result);

		String result1 = (hashMap.get(s1.getName()));
		result1 += (hashMap.get(s2.getName()));
		result1 += (hashMap.get(s3.getName()));
		result1 += (hashMap.get(s4.getName()));
		result1 += (hashMap.get(s5.getName()));

		String expected1 = "Mango" + "orange" + "banana" + "apple" + "litchi";
		assertEquals(expected1, result1);

	}
}
