import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeeDetailTest {
	private EmployeeDetails emp;
	
	@Before
	public void SetUp(){
		 emp=new EmployeeDetails();	
		 emp.setId(101);
		 emp.setName("shell");
		 emp.setMonthlyBasic(4000);
		 EmployeeDetails.setPFRate(10);
	}
	@Test
	public void GetNameTest() {
			assertEquals("shell",emp.getName());	
		}
	@Test
	public void MonthlyBasicTest() {
			assertEquals(4000,emp.getMonthlyBasic(),0);	
		}

	@Test
	public void AnnualBasicTest() {
			assertEquals(12*4000,emp.getAnnualBasic(),0);
		}
	@Test
	public void MonthlyGrossSalaryTest() {
			assertEquals(96600/12,emp.getMonthlyGrossSalary(),0);	
		}

	@Test
	public void AnnualGrossSalaryTest() {
			assertEquals(96600,emp.getAnnualGrossSalary(),0);	
		}
	@Test
	public void MonthlyDeductionTest() {
			assertEquals(640,emp.getMonthlyDeductions(),0);	
		}
	@Test
	public void MonthlyTakeHomeTest() {
			assertEquals(88920/12,emp.getMonthlyTakeHome(),0);	
		}
	@Test
	public void AnnualTakeHomeTest() {
			assertEquals(88920,emp.getAnnualTakeHome(),0);	
		}
	@Test
	public void GetPfTest() {
			assertEquals(10,EmployeeDetails.getPFRate(),0);	
		}
	}

