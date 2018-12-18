import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@IncludeCategory(goodCategory.class)
@Suite.suiteClasses(PalindromeTest.class);
public class testSuite {

}
