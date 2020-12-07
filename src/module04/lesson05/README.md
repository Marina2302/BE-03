<h5>How do I make a field non-serializable?</h5>
<p>Use keyword transient</p>
----------------------
<h5>Can static fields be serialized?</h5>
<p>No, because static variables belong to class</p>
----------------------
<h5>What methods does the Serializable interface have?</h5>
<p>None</p>
----------------------
<h5>What methods does the Externalizable interface have?</h5>
<p>writeExternal() and readExternal()</p>
----------------------
<h5>What is the difference between Serializable and Externalizable interfaces?</h5>
<p>Serializable is a marker interface i.e. does not contain any method. 
Externalizable interface contains two methods writeExternal() and readExternal() which implementing classes MUST override.
Serializable interface pass the responsibility of serialization to JVM and it’s default algorithm.
Externalizable provides control of serialization logic to programmer – to write custom logic.
Mostly, default serialization is easy to implement, but has higher performance cost.
Serialization done using Externalizable, add more responsibility to programmer but often result in better performance.
Default serialization does not call any class constructor.
A public no-arg constructor is required while using Externalizable interface.
Serializable interface - It’s hard to analyze and modify class structure because any change may break the serialization.
Externalizable interface - It’s more easy to analyze and modify class structure because of complete control over serialization logic.</p>
----------------------
<h5>If the parent implements the Serializable interface, then the child also implements?</h5>
<p>If Parent class is Serializable then child class is by default Serializable.</p>
