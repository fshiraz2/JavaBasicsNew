package com.syntax.class24;

public class TestFile {

	public static void main(String[] args) {
		File file=new JavaFile(); 
		file.open();
		file.close();
		file.edit();
		File word=new WordFile();
		word.open();
		word.close();
		word.edit();
		File pdf=new PDFFile();
		pdf.open();
		pdf.close();
		pdf.edit();
	}
}
