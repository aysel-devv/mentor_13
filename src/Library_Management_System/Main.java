package Library_Management_System;

public class Main {
    public static void main(String[] args) {
        LibraryUser[] libraryUsers=new LibraryUser[3];

        libraryUsers[0]=new Student(1, "Aysel");
        libraryUsers[1]=new Student(2, "Lala");
        libraryUsers[2]=new Teacher(100, "Mr.Brown");

        for(LibraryUser users: libraryUsers){
            System.out.println(users.userDetails());
            System.out.println(users.getMaxBooksAllowed());
            System.out.println("--------------------------------------------------------");
        }

    }
}
