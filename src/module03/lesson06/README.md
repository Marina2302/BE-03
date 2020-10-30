<h5>What is Comparable?</h5>
<p>Comparable interface is used to compare objects and sort them according to the natural order</p>
----------------------
<h5>What is Comparator?</h5>
<p>Comparator interface is used to order the objects of user-defined classes. 
A comparator object is capable of comparing two objects of two different classes.</p>
----------------------
<h5>What the compare() and compareTo() methods return. How it works?</h5>
<p>The compareTo() method works by returning an int value that is either positive, negative, or zero. 
It compares the object by making the call to the object that is the argument. 
A negative number means that the object making the call is “less” than the argument. 
A positive number means that the object making the call is “more” than the argument. 
A zero number means that the object making the call is “equal” than the argument.</p>
----------------------
<h5>When is a comparator preferred?</h5>
<p>When we want to write our own comparison order</p>
----------------------
<h5>Can comparator be used when Comparable is already implemented?</h5>
<p>Yes, we can</p>
----------------------
<h5>What does the method for sorting the collection look like?</h5>
<p>The method for sorting the collection look like the method for sorting the collection</p>
----------------------
<h5>Do I need to implement Comparable for strings and numbers? Why?</h5>
<p>No, you don't. Because numbers are sorted in ascending order by default, and strings are sorted alphabetically</p>
