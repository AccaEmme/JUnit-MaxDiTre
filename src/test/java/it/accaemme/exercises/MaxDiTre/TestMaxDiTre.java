/*
 * @author Magliacane Hermann
 * 
 */

package it.accaemme.exercises.MaxDiTre;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMaxDiTre {

	// Test1: min min max  
	@Test
	public void testMinMinMax(){
	  int min=3, mid=5, max=10;
	  assertEquals( max, MaxDiTre.max(min, min, max) );
	}
	
	// Test2: min max max
	@Test
	public void testMinMaxMax(){
	  int min=3, mid=5, max=10;
	  assertEquals( max, MaxDiTre.max(min, max, max) );
	}
	
	// Test3: max min max  
	@Test
	public void testMaxMinMax(){
	  int min=3, mid=5, max=10;
	  assertEquals( max, MaxDiTre.max(max, min, max) );
	}
	
	// Test4:min mid max  
	@Test
	public void testMinMidMax(){
	  int min=3, mid=5, max=10;
	  assertEquals( max, MaxDiTre.max(min, mid, max) );
	}
	
	// Test5:max min mid  
	@Test
	public void testMaxMinMid(){
	  int min=3, mid=5, max=10;
	  assertEquals( max, MaxDiTre.max(max, min, mid) );
	}
	
	// Test6: mid max min  
	@Test
	public void testMidMaxMin(){
	  int min=3, mid=5, max=10;
	  assertEquals( max, MaxDiTre.max(mid, max, min) );
	}
	
	// Test7: min min min  
	@Test
	public void testMinMinMin(){
	  int min=3, mid=5, max=10;
	  assertEquals( min, MaxDiTre.max(min, min, min) );
	}
	
	// Test8: max max max  
	@Test
	public void testMaxMaxMax(){
	  int min=3, mid=5, max=10;
	  assertEquals( max, MaxDiTre.max(max, max, max) );
	}
	
	// Test9: negative min, negative max, negative max  
	@Test
	public void testNegMinNegMaxNegMax(){
	  int min=3, mid=5, max=10;
	  assertEquals( -min, MaxDiTre.max(-min, -max, -min) );
	}

	// Test10: negative max, negative max, negative min 
	@Test
	public void testNegMaxNegMaxNegMin(){
	  int min=3, mid=5, max=10;
	  assertEquals( -min, MaxDiTre.max(-max, -max, -min) );
	}
	
	// Test11: negative max, negative min, negative max  
	@Test
	public void testNegMaxNegMinNegMax(){
	  int min=3, mid=5, max=10;
	  assertEquals( -min, MaxDiTre.max(-max, -min, -max) );
	}
	
	// Test12: max integer number, number, smaller integer number   
	@Test
	public void testBiggerMaxSmaller(){
	  int min=3, mid=5, max=10, bigger=Integer.MAX_VALUE, smaller=Integer.MIN_VALUE;
	  assertEquals( bigger, MaxDiTre.max(bigger, max, smaller) );
	}

	// Test13: smaller integer number, max integer number, number   
	@Test
	public void testSmallerBiggerMax(){
	  int min=3, mid=5, max=10, bigger=Integer.MAX_VALUE, smaller=Integer.MIN_VALUE;
	  assertEquals( bigger, MaxDiTre.max(smaller, bigger, max) );
	}
	
	// Test14: number, smaller integer number, max integer number 
	@Test
	public void testMaxSmallerBigger(){
	  int min=3, mid=5, max=10, bigger=Integer.MAX_VALUE, smaller=Integer.MIN_VALUE;
	  assertEquals( bigger, MaxDiTre.max(max, smaller, bigger) );
	}
	
	// Test15:  check exception - program won't accept three input with all zero as values.
	@Test(expected=IllegalArgumentException.class)
	public void testZerosException() throws IllegalArgumentException {
	  int min=3, mid=5, max=10, bigger=Integer.MAX_VALUE, smaller=Integer.MIN_VALUE;
	  assertEquals( 0, MaxDiTre.max(0, 0, 0) );
	}
	
	/*
	// Nessun numero è uguale all’altro
	@Test
	public void testAllDifferents(){
	  assertEquals( 5, MaxDiTre.max(5, 4, 3) );
	}

	// due numeri uguali
	@Test
	public void testTwoEquals(){
	  assertEquals( 10, MaxDiTre.max(10, 10, 3) );
	}

	// due numeri uguali
	@Test
	public void testTwoEqualsShifted1(){
	  assertEquals( 9, MaxDiTre.max(9, 8, 8) );
	}

	// due numeri uguali
	@Test
	public void testTwoEqualsShifted2(){
	  assertEquals( 60, MaxDiTre.max(7, 60, 7) );
	}

	// tre numeri uguali
	@Test
	public void testThreeEquals(){
	  assertEquals( 6, MaxDiTre.max(6, 6, 6) );
	}


	// tre numeri uguali
	@Test
	public void testAllEquals(){
	  assertEquals( 0, MaxDiTre.max(0, 0, 0) );
	}

	// cifre negative
	@Test
	public void testNegativeDigit1(){
	  assertEquals( 8, MaxDiTre.max(-1, 8, 8) );
	}

	// cifre negative
	@Test
	public void testNegativeDigit2(){
	  assertEquals( 8, MaxDiTre.max(0, -2, 8) );
	}

	// cifre negative
	@Test
	public void testNegativeDigit3(){
	  assertEquals( 40, MaxDiTre.max(40, 0, -3) );
	}

	// numeri decimali
	@Test
	public void testDecimals(){
	  //assertEquals( 4.8, MaxDiTre.max(-1.5, 2.3, 4.8) );
	}

	// cifre con zero davanti
	@Test
	public void testDigits(){
	  String s = new String("0008");
	  assertEquals( 8, MaxDiTre.max(01, Integer.valueOf(s), 007) );
	}

	// CASI PARTICOLARI:
	// minore del biggest, con negativo
	@Test
	public void testBiggerThanSmallest(){
	  assertEquals(
	   Integer.MIN_VALUE,
	   MaxDiTre.max(Integer.MIN_VALUE, -5, 99999999)
	  );
	}
*/
	/* Test non necessario poiché l'input viene controllato dalla tipizzazione
	@Test(expected=ExceptionNoTextInput.class)
	public void testNotOK() throws ExceptionNoTextInput {
		String s = "5aaa";
		assertEquals(1, MaxDiTre.max(1, Integer.valueOf(s), 0));
	}
	*/

}
