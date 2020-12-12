<h5>How many ways to create threads do you know?</h5>
<p>Three</p>
----------------------
<h5>What does the word volatile allow you to do?</h5>
<p>The Java volatile keyword guarantees visibility of changes to variables across threads.</p>
----------------------
<h5>What is common and what is the difference between a mutex, a monitor and a semaphore?</h5>
<p>A mutex is a special mechanism for synchronizing threads, it makes possible to ensure that only one thread at a time has access to the object. 
A mutex is actually a semaphore with a count of 1. 
A monitor is an additional "superstructure" over a mutex. Java uses the synchronized keyword to represent a monitor. 
A semaphore is a tool for synchronizing access to some resource. Its distinctive feature is that it uses a counter to create the synchronization mechanism. </p>
----------------------
<h5>What are the main problems in multithreading?</h5>
<p>Memory-interference, race conditions, deadlock, livelock, and starvation are an example of some problems that come with multithreading and concurrent programming.</p>
