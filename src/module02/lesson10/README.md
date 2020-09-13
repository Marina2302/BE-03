1.
Code given. What code is enough to add to the inc () method instead of a comment so that the compilation goes without errors? (choose 2).

    class Quest1 {
        int counter;
        java.io.OutputStream out; Quest1(){/* инициализация out */} float inc() {
        try { counter++;
          out.write(counter); }
          //comment
        }
    }
Answers:

catch (java.io.OutputStreamException e){}; 2) catch (java.io.IOException e){};
catch (java.io.OutputException e){};
finally{};
return counter;
return;

2.
What value will be returned when calling meth (5)?

    class Quest2 {
        public int meth(int x) {
          int y = 010; //1
          try { 
            y += x; //2
            if(x<=5) throw new Exception(); //3
            y++; 
          } //4 catch(Exception e) { 
            y--; 
          } //5
          return y; 
        } //6
    }
Answers:

12;
13;
14;
15;
compilation error: Inexecutable code on line 4.

3.
What value will be returned when calling meth(12) if an ArithmeticException is thrown when calling mexcept(int x)?

    class Quest3 {
        int meth(int x) {
            int count=0;
            try { count += x;
                count += mexcept(count);
                 count++;
            } catch(Exception e) {
                --count; 
                return count;
            }
            finally {
                count += 3; return count;
            } 
        }
    }
Answers:

11;
12;
13;
14;
compilation error due to missing return after block finally.

4.
Which of the following definitions of the show () method can legally be used use instead of comment // CODE in class Quest4?

    class Base {
        public void show(int i) {/realisation*/}
    }
    public class Quest4 extends Base{
        //code
    }
Answers:

void show (int i) throws Exception {/realisation*/}
void show (long i) throws IOException {/realisation*/}
void show (short i) {/realisation*/}
public void show (int i) throws IOException {/realisation*/}

5.
Code given. Which declaration of the ioRead () method should be used instead of a comment to successfully compile and execute the code?

    public class Quest5 {
        public static void main(String[] args) {
            try {
                ioRead();
            } catch(IOException e) {}
        }
    }
Answers:

private static void ioRead() throws IOException { };
public static void ioRead() throw IOException { };
public static void ioRead() { };
public static void ioRead() throws Exception { };