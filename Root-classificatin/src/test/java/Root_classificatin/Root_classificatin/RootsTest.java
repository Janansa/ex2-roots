package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void testPartion1() 
	{
		//(0,1,2)
		Roots.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion2() 
	{
		//(0,1,2)
		Roots.calculate_roots(0, 5, 20);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion3() 
	{
		//(0,1,2)
		Roots.calculate_roots(1, 5, 2);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion4() 
	{
		//(0,1,2)
		Roots.calculate_roots(50,6,7);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion5() 
	{
		//(0,1,2)
		Roots.calculate_roots(99,45,27);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion6() 
	{
		//(0,1,2)
		Roots.calculate_roots(100,15,15);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion7() 
	{
		//(0,1,2)
		Roots.calculate_roots(2,0,4);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion8() 
	{
		//(0,1,2)
		Roots.calculate_roots(2,1,5);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion9() 
	{
		//(0,1,2)
		Roots.calculate_roots(24,50,25);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion10() 
	{
		//(0,1,2)
		Roots.calculate_roots(45,99,46);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion11() 
	{
		//(0,1,2)
		Roots.calculate_roots(57,100,52);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion12() 
	{
		//(0,1,2)
		Roots.calculate_roots(13,14,0);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion13() 
	{
		//(0,1,2)
		Roots.calculate_roots(15,78,1);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion14() 
	{
		//(0,1,2)
		Roots.calculate_roots(53,56,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion15() 
	{
		//(0,1,2)
		Roots.calculate_roots(68,57,99);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion16() 
	{
		//(0,1,2)
		Roots.calculate_roots(47,35,100);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	}
