<h5>What is aggregation in java?</h5>
<p>Aggregation in Java is a relationship between two classes that is best described as a "has-a" and "whole/part" relationship. 
The aggregate class contains a reference to another class and is said to have ownership of that class. 
Each class referenced is considered to be part-of the aggregate class.</p>
---
<h5>What is composition in java?</h5>
<p>Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
It represents part-of relationship. In composition, both the entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.</p>
---
<h5>Could you replace one type with another? If so,which one?</h5>
<p>You can try to reduce aggregation to composition, but the sense of separation is lost, because stricter rules are imposed on relationships during composition</p>
---
<h5>What is regEx?</h5>
<p>A regular expression is a sequence of characters that define a search pattern. 
Usually such patterns are used by string-searching algorithms for "find" or "find and replace" operations on strings, or for input validation.</p>
---
<h5>Write about ways to create and check a regular expression.</h5>
<p>There are three ways to write the regex example in Java.
import java.util.regex.*;  
public class RegexExample1{  
public static void main(String args[]){  
//1st way  
Pattern p = Pattern.compile(".s");//. represents single character  
Matcher m = p.matcher("as");  
boolean b = m.matches();  
//2nd way  
boolean b2=Pattern.compile(".s").matcher("as").matches();  
//3rd way  
boolean b3 = Pattern.matches(".s", "as");  
System.out.println(b+" "+b2+" "+b3);  
}}  
</p>