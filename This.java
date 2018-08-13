// this is a refrence variable that refers to the current object
//1. this : to refer to current class instance variable 
class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  

//2.this : to invoke current class method 
// if you dont use this key word the compiler it self interprets it .
//eg; 
class A {
  void m(){}
  void n(){
  m();
  }
  public static void main (String[] args){
    new A().n();
  }
}
//compiler inerprets it as :
class A {
  void m(){}
  void n(){
  this.m();
  }
  public static void main (String[] args){
    new A().n();
  }
}