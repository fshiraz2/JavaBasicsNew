package com.syntax.class17_1;

public class ReplaceCharWithSymbol {

	     String censorLetter(String s, char c) {
				
				s=s.replace(c, '*');
				return s;
			}

			public static void main(String[] args){
				
				ReplaceCharWithSymbol obj=new ReplaceCharWithSymbol();
				System.out.println(obj.censorLetter("computer science",'e')); 
				System.out.println(obj.censorLetter("trick or treat",'t')); 
			}
	}
