package gitDemo;

public class parameterised_Constructor {
	
	int id;
	String name;
	String gender;
	
	public void show(){
		System.out.println("id ="+id);
		System.out.println("Name ="+name);
		System.out.println("gender is = " +gender);
		
	}
	//parameterised constructor
	parameterised_Constructor(int newID,String NewName){
		id=newID;
		name=NewName;
	}
	parameterised_Constructor(int newID,String NewName , String sex){
		id=newID;
		name=NewName;
		gender=sex;
	}
	
	
	public static void main (String args[]){
		parameterised_Constructor pc = new parameterised_Constructor(10, "Satish");
		parameterised_Constructor pc1= new parameterised_Constructor(20 , "Mahesh");
		parameterised_Constructor pc2= new parameterised_Constructor(20 , "Shekhar" , "male");
		
		pc.show();
		pc1.show();
		pc2.show();
	}


}
