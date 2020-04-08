package com.syntax.class24;

public abstract class File {

//	Create a class File that will have the following behaviors: open, edit, close. 
	// Edit and close are implemented method while open is an abstract. 
//	Create 3 subclasses: 
//		JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
//		Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
//
	public abstract void open();
	void edit() {
		System.out.println(" I need to edit all my files");
	}
	void close() {
		System.out.println("I need to close my files after i have done the project");
	}
}
class JavaFile extends File{
	@Override
	public void open() {
			System.out.println("I need to open the java file");
		}
	}
class WordFile extends File{
	@Override
	public void open() {
		System.out.println("I have to start working on my word file");
	}
}
class PDFFile extends File{
	@Override
	public void open() {
		System.out.println("I like to open my files in pdf format");
	}
}