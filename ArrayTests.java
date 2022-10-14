import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// @Test 
	// public void testReverseInPlace() {
  //   int[] input1 = {3};
  //   int[] input2 = {};
  //   int[] input3 = {1,2};
  //   int[] input4 = {1,2,3};

  //   ArrayExamples.reverseInPlace(input1);
  //   ArrayExamples.reverseInPlace(input2);
  //   ArrayExamples.reverseInPlace(input3);
  //   ArrayExamples.reverseInPlace(input4);

  //   assertArrayEquals(new int[]{3}, input1);
  //   assertArrayEquals(new int[]{}, input2);
  //   assertArrayEquals(new int[]{2,1}, input3);

	// }

  @Test 
	public void testReverseInPlaceFixed() {
    int[] input1 = {3};
    int[] input2 = {};
    int[] input3 = {1,2};
    int[] input4 = {1,2,3};

    ArrayExamples.reverseInPlaceFixed(input1);
    ArrayExamples.reverseInPlaceFixed(input2);
    ArrayExamples.reverseInPlaceFixed(input3);
    ArrayExamples.reverseInPlaceFixed(input4);

    assertArrayEquals(new int[]{3}, input1);
    assertArrayEquals(new int[]{}, input2);
    assertArrayEquals(new int[]{2,1}, input3);

	}

  // @Test
  // public void testReversed() {
  //   int[] input1 = {};
  //   int[] input2 = {1};
  //   int[] input3 = {1,2};
  //   int[] input4 = {1,2,3};

  //   assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
  //   assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input2));
  //   assertArrayEquals(new int[]{2,1}, ArrayExamples.reversed(input3));
  //   assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input4));
  // }

  @Test
  public void testReversedFixed() {
    int[] input1 = {};
    int[] input2 = {1};
    int[] input3 = {1,2};
    int[] input4 = {1,2,3};

    assertArrayEquals(new int[]{}, ArrayExamples.reversedFixed(input1));
    assertArrayEquals(new int[]{1}, ArrayExamples.reversedFixed(input2));
    assertArrayEquals(new int[]{2,1}, ArrayExamples.reversedFixed(input3));
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversedFixed(input4));
  }

  // @Test 
	// public void testAverageWithoutLowest() {
  //   double[] input1 = {3};
  //   double[] input2 = {};
  //   double[] input4 = {1,1,2};

  //   assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  //   assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0.1);
  //   assertEquals(1.5, ArrayExamples.averageWithoutLowest(input4), 0.1);

	// }

  @Test 
	public void testAverageWithoutLowestFixed() {
    double[] input1 = {3};
    double[] input2 = {};
    double[] input4 = {1,1,2};

    assertEquals(0, ArrayExamples.averageWithoutLowestFixed(input1), 0.1);
    assertEquals(0, ArrayExamples.averageWithoutLowestFixed(input2), 0.1);
    assertEquals(1.5, ArrayExamples.averageWithoutLowestFixed(input4), 0.1);

	}
}
