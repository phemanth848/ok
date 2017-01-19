package bean;

public class Student {  
//Hello java	
//java
private String name; 
private int id;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Student(String name, int id){
	this.name=name;
	this.id=id;
}
public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
  
public void displayInfo(){  
    System.out.println("Hello: "+name+" Your ID:" +id);  
}  
}  