import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.Test;

public class CellPhoneTest {
	private CellPhone cellPhone1;
	private CellPhone cellPhone2;
	private CellPhone cellPhone3;
	Set<CellPhone> set = new HashSet<CellPhone>();
	private CellPhone cellPhone4;
	private String result="";

	@Test
	public void DuplicateTest() {
		cellPhone1 = new CellPhone("SAMSUNG", "J7", "ABC", "android", 45666);
		cellPhone2 = new CellPhone("SAMSUNG", "J5", "xyz", "android", 45666);
		cellPhone3 = new CellPhone("IPHONE", "X", "uvw", "MAC", 999999999);
		cellPhone4 = new CellPhone("SAMSUNG", "J7", "DCB", "android", 466);
		set.add(cellPhone1);
		set.add(cellPhone2);
		set.add(cellPhone3);
		set.add(cellPhone4);
		Iterator<CellPhone> iterator = set.iterator();
		while (iterator.hasNext()) {
			result +=iterator.next().toString();
		}
		String expected = "CellPhone [company=SAMSUNG, model=J7, description=ABC, operatingSstem=android, price=45666.0]"
				+ "CellPhone [company=SAMSUNG, model=J5, description=xyz, operatingSstem=android, price=45666.0]"
				+ "CellPhone [company=IPHONE, model=X, description=uvw, operatingSstem=MAC, price=9.99999999E8]";
		assertEquals(expected,result);
	}

}
