import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Ignore;
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
	@Ignore
	public void MaintainingOrderTest() {
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

	@Test
	@Ignore
	public void NaturalOrderTest() {
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		set1.add(s5);
		set1.add(s6);

		Iterator<Student> iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
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
			System.out.println(e.getKey() + "," + e.getValue());
		}

		System.out.println(hashMap.get(s1.getName()));
		System.out.println(hashMap.get(s2.getName()));
		System.out.println(hashMap.get(s3.getName()));
		System.out.println(hashMap.get(s4.getName()));
		System.out.println(hashMap.get(s5.getName()));

	}

}
