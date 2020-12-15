<h5>What collection implementations, besides queues, the java.util.concurrent provides for use in multithreaded contexts?</h5>
<p>ConcurrentHashMap, ConcurrentSkipListMap, ConcurrentSkipListSet, CopyOnWriteArrayList, and CopyOnWriteArraySet.</p>
----------------------
<h5>What do all change operations (add, set, remove) lead to in CopyOnWrite collections?</h5>
<p>They result in a new copy of the internal array being created.</p>
----------------------
<h5>Which collection from the java.util.concurrent is analogous to TreeMap with multithreading support?</h5>
<p>ConcurrentSkipListMap<K, V></p>
----------------------
<h5>When is CopyOnWriteArrayList preferred over synchronized Array List?</h5>
<p>When the expected number of reads and traversals greatly outnumber the number of updates to a list.</p>
----------------------
<h5>When is it preferable to use "concurrent" versions of collections, and when are unsynchronized collections, and when are "Synchronized" classes?</h5>
<p>"Synchronized" classes can be useful when you need to prevent all access to a collection via a single lock, 
at the expense of poorer scalability. In other cases in which multiple threads are expected to access a common collection, 
"concurrent" versions are normally preferable. And unsynchronized collections are preferable when either collections are unshared, or are accessible only when holding other locks.</p>