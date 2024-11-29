package Library_Management_System;

public class Student extends LibraryUser{
    public Student(int libraryUserid, String libraryUserName) {
        super(libraryUserid, libraryUserName);
    }

    @Override
    public String userDetails(){
        return "Student ID: "+libraryUserid+"\nUser name: "+libraryUserName;
    }

    @Override
    public int getMaxBooksAllowed() {
        System.out.print("Max number: "); //????????
        return 3;
    }
}
