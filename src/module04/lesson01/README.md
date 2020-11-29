<h5>What are the types of I/O streams? (not names of classes)</h5>
<p>Byte and character</p>
----------------------
<h5>What are the basic classes of I/O streams? (4)</h5>
<p>InputStream, OutputStream, Reader, Writer</p>
----------------------
<h5>What are the similarities and differences between classes from the second question?</h5>
<p>These are abstract classes. The first two work with bytes, the last two work with characters.</p>
----------------------
<h5>What classes allow you to convert one type of stream to another type?</h5>
<p>    

    InputStream initialStream = new ByteArrayInputStream("With Java".getBytes());
    Reader targetReader = new InputStreamReader(initialStream);
    targetReader.close();
</p>
