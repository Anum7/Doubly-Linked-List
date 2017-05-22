

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyNameCardList dl=new DoublyNameCardList();
		
		// initilize the doubly linked list
		NameCard x1=new NameCard(1, "Anum", "x");
		dl.addEnd(x1);
		
		NameCard x2=new NameCard(2, "Naureen", "y");
		dl.addEnd(x2);
		
		NameCard x3=new NameCard(3, "Shifa", "z");
		dl.addEnd(x3);
		
		NameCard x4=new NameCard(4, "Rizwana", "r");
		dl.addEnd(x4);
		
		NameCard x5=new NameCard(5, "Aslam", "a");
		dl.addEnd(x5);
		
		// display the nodes in the doubly linked list
		dl.display();
		dl.printReverse();
		
		System.out.print("Adding Dnode to the end and ");
		NameCard x6=new NameCard(6, "Peter", "r");
		dl.addEnd(x6);
		
		NameCard newNode=new NameCard(0,"ASD", "h");
		dl.addHead(newNode);
		dl.display();
		
		System.out.println();

		NameCard newNode1=new NameCard(22,"asd", "yu");
		dl.add(2, newNode1);
		dl.display();
		
		int i=2;
		System.out.println("The data stored in the node with index "+ i +" is: ");
		System.out.println(dl.get(i).getAge()+" "+ dl.get(i).getName()+ " "+ dl.get(i).getCompany());
		
		System.out.println();
		
		System.out.println("Number of elements in the list: "+ dl.getSize());
		System.out.println();

		NameCard newNodet=new NameCard(22,"asd", "yu");
		System.out.println("Chcek to see if the specific node exist or not: " + newNodet);
		boolean a = dl.exist(newNodet);
		if(a){
			System.out.println("Exist");
		}else {
			System.out.println("Not Exist");
		}
		System.out.println();
		
		dl.delete(2);
		dl.display();
	}
	
	
}
