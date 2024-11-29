package Library_Management_System;

public abstract class LibraryUser {
    int libraryUserid;
    String libraryUserName;

    public LibraryUser(int libraryUserid, String libraryUserName) {
        this.libraryUserid = libraryUserid;
        this.libraryUserName = libraryUserName;
    }

    public abstract int getMaxBooksAllowed();

    public String userDetails(){
        return "ID: "+libraryUserid+"\nLibrary user name: "+libraryUserName;
    }



}
