import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.Test;

public class SchoolTest {
	private School school1;
	private School school2;
	private School school3;
	private School school4;
	Set<School> set = new HashSet<School>();

	@Test
	public void test() {
		school1 = new School("DON BOSCO", "Mumbai", "Mumbai", 7561);
		school2 = new School("A.E.S", "Mumbai", "Mumbai", 101);
		school3 = new School("DON BOSCO", "Mumbai", "Mumbai", 7651);
		school4 = new School("FATHER AGNES", "Mumbai", "Mumbai", 791);
		set.add(school1);
		set.add(school2);
		set.add(school3);
		set.add(school4);
		Iterator<School> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
