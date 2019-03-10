package test.lwl; 

import lwl.Levenshtein;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Levenshtein Tester. 
* 
* @author <Authors name> 
* @since <pre>ÈýÔÂ 10, 2019</pre> 
* @version 1.0 
*/ 
public class LevenshteinTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getDistance(String str1, String str2) 
* 
*/ 
@Test
public void testGetDistance() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: getMin(int a, int b, int c) 
* 
*/ 
@Test
public void testGetMin() throws Exception { 
//TODO: Test goes here...
       int a = new Levenshtein().getDistance("abc","abcde");
       System.out.println(a);
/*

try { 
   Method method = Levenshtein.getClass().getMethod("getMin", int.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
