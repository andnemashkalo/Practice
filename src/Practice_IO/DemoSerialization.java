package Practice_IO;

import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student gonchar=new Student("MMF","Gonchar",1,"qwerty123");
        System.out.println(gonchar);
        File fw=new File("demo.dat");

        ObjectOutputStream ostream=new ObjectOutputStream(new FileOutputStream(fw));
        ostream.writeObject(gonchar);
        ostream.close();

        Student.faculty="GEO";

        File fr=new File("demo.dat");
        ObjectInputStream istream=new ObjectInputStream(new FileInputStream(fr));
        Student unknown=(Student) istream.readObject();
        System.out.println(unknown);
    }
}
