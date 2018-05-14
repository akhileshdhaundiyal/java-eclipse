package com.niit.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookLogic {

	public static void main(String[] args) {
		
		ApplicationContext  bf = new ClassPathXmlApplicationContext("book.xml");
		Library library = (Library)bf.getBean("Library");
		
		List<?> bookList = library.getBookList();
		for(int i=0; i<bookList.size(); i++)
		{
			System.out.println("*** Book "+(i+1)+" Details ***");
			Book book = (Book)bookList.get(i);
			System.out.println("Book title: "+book.getTitle());
			System.out.println("Book Author: "+book.getAuthor());
			System.out.println("Book publications: "+book.getPublications());			
		}
		
		List<?> stringList = library.getStringList();
		System.out.println("Primitives set to list: "+stringList);
	}

}
