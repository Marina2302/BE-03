package module04.lesson05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Author theBeatles = new Author("The Beatles", 50, "12lk65");
        Song song1 = new Song("Let it be", 4.03, theBeatles);
        Song song2 = new Song("Yellow Submarine", 2.34, theBeatles);
        Song song3 = new Song("All You Need Is Love", 3.44, theBeatles);
/*
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("song.out"));
        objectOutputStream.writeObject(song1);
        objectOutputStream.writeObject(song2);
        objectOutputStream.writeObject(song3);
        objectOutputStream.close();
 */

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("song.out"));
        Song song1Restored = (Song) objectInputStream.readObject();
        Song song2Restored = (Song) objectInputStream.readObject();
        Song song3Restored = (Song) objectInputStream.readObject();
        objectInputStream.close();
    }
}
