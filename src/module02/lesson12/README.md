<h5>How do you understand why we use Generics?</h5>
<p>Generics allow for stronger compile-time type checking and eliminate the need for explicit casting.</p>
<p>Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods.</p>
----------------------
<h5>What is wildcards?</h5>
<p>The question mark (?) is known as the wildcard in generic programming . It represents an unknown type.</p>
----------------------
<h5>Name the types of bounded wildcards and explain the difference between them.</h5>
<p>Upper Bounded Wildcards. This Java wildcard cases can be utilized when you need to relax the confinements on a variable.</p>    
        
    1. public static void add(List<? extends Number> list);
                
<p>Lower Bounded Wildcards. It is a wildcard (?) followed by a super keyword and then by its lower bound.</p>

    1. Collectiontype <? super A>
    
<p>Unbounded Wildcard. It is specified using Java wildcard character (?). This is called the unknown type list. </p>

    1. Collectiontype<?>