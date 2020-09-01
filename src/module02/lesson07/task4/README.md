<h5>What is the parent class of all classes?</h5>
<p>Object</p>
---
<h5>How do I call the constructor of the parent class?</h5>
<p>Using the keyword super</p>
---
<h5>Will the parent class constructor be called automatically?</h5>
<p>No</p>
---
<h5>Will the parent class constructor be automatically called with arguments?</h5>
<p>No</p>
---
<h5>Can interface type be used for polymorphism?</h5>
<p>Yes</p>
---
<h5>There are the following classes:</h5>

    class A {
    }
    
    class B extends A {
    }
    
    class C extends B {
    }
  <p>Is it possible to do this?</p>
  <p>B b = new A(); - No</p>  
  <p>B b = new B(); - Yes</p>
  <p>B b = new C(); - Yes</p>
  <p>Object obj = new A(); - Yes</p>
  <p>Object obj1 = new B(); - Yes</p>
  <p>Object obj2 = new C(); - Yes</p>