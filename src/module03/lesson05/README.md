<h5>What is Set?</h5>
<p>A Set is a Collection that cannot contain duplicate elements.</p>
----------------------
<h5>What is the difference between HashSet, LinkedHashSet and TreeSet?</h5>
<p>Internal Working:	HashSet internally uses HashMap for storing objects;	LinkedHashSet uses LinkedHashMap internally to store objects;	TreeSet uses TreeMap internally to store objects.</p>
<p>When To Use:	If you don’t want to maintain insertion order but want store unique objects use HashSet;	If you want to maintain insertion order of elements then you can use LinkedHashSet;	If you want to sort the elements according to some Comparator then use TreeSet.</p>
<p>Order:	HashSet does not maintain insertion order;	LinkedHashSet maintains insertion order of objects;	While TreeSet orders of the elements according to supplied Comparator. Default, It’s objects will be placed in their natural ascending order.</p>
<p>Null Elements:	HashSet allows only one null objects;	LinkedHashSet allows only one null objects;	TreeSet not allow a any null objects. If you insert null objects into TreeSet, it throws NullPointerException.</p>
<p>Complexity of Operations:	HashSet gives O(1) complicity for insertion, removing and retrieving objects;	LinkedHashSet gives insertion, removing and retrieving operations performance in order O(1);	While TreeSet gives performance of order O(log(n)) for insertion, removing and retrieving operations.</p>
<p>etc...</p>
----------------------
<h5>What is HashSet based on?</h5>
<p>The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance.</p>
----------------------
<h5>What is a red-black tree?</h5>
<p>A red-black tree is a kind of self-balancing binary search tree where each node has an extra bit, and that bit is often interpreted as the colour (red or black). These colours are used to ensure that the tree remains balanced during insertions and deletions.</p>
----------------------
<h5>How do I get a read-only Set collection?</h5>
<p>We can use Collections.unmodifiableSet() method for creating read-only Set</p>
   