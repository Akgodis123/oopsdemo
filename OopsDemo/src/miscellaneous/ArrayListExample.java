package miscellaneous;

import java.util.*;

//Program to store User Defined class Objects in ArrayList
public class ArrayListExample {

	public static void main(String[] args) {
		List<Book> bList=new ArrayList<Book>();
		//Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
       
        //add books to list
        bList.add(b1);
        bList.add(b2);
        bList.add(b3);
       
        //Traverse a list
        System.out.println("************* Book Detais **************");
        for(Book i:bList)
        {
            System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        }
       
        System.out.println("Total no. of Books :"+bList.size());

	}

}
