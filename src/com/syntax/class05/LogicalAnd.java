package com.syntax.class05;

public class LogicalAnd {
    public static void main(String[]args) {
/*if we declared number is
* between 1-10-->small
* between 11-100-->big
* between 101-1000-->large  
*/
int num=78;
//if or num>1 && num<=10--> It would be # is small bc one of them is true.
if (num>1 && num<=10) {
 System.out.println("This number is small");
}else if(num>10 && num<=100) {
 System.out.println("This number is big");
}else if (num>100 && num<=1000) {
 System.out.println("This number is large");
}else {
 System.out.println("This number is super large");

}
}
}