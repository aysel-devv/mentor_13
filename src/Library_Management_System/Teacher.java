package Library_Management_System;

public class Teacher extends LibraryUser{
    public Teacher(int libraryUserid, String libraryUserName) {
        super(libraryUserid, libraryUserName);
    }

    @Override
    public String userDetails(){
        return "Teacher ID: "+libraryUserid+"\nUser name: "+libraryUserName;
    }

    @Override
    public int getMaxBooksAllowed() {
        System.out.print("Max number: ");  // ???????
        return 10;
    }
}
