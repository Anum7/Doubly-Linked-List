public class DoublyNameCardList {
	int size =0;
    NameCard head = null;
    NameCard tail = null;

    // add a new node at the head of the doubly linked list
    public void addHead(NameCard n){
        System.out.println("Adding DNode at the start");
        if(size==0){
            head = n;
            tail = n;
        }else{
            n.setLinkNext(head);
            head.setLinkPrev(n);
            head = n;
        }
        size++;
        
    }

 // add a new node at the end of the doubly linked list
    public void addEnd(NameCard n){
        //System.out.println("Adding DNode at the End");
        if(size==0){
            head = n;
            tail = n;
        }else{
            tail.setLinkNext(n);
            n.setLinkPrev(tail);
            tail =n;
        }
        size++;
        
    }
    
    // add a new node after the index
    public void add(int index, NameCard n){
    	
    	System.out.println("Adding DNode after the index: "+ index);
    	if(index==0){
    		this.addHead(n);
    	}
    	else if(index>=size){
    		this.addEnd(n);
    	}
    	else{
    		NameCard curr=this.get(index);
    		//store the next DNode of given node 
    		NameCard nextDNode = curr.getLinkNext();
            
          //make new node' next point to prevDNode
            n.setLinkNext(nextDNode);
            
          // make new node' prev point to the given node
            n.setLinkPrev(curr);
            
          //make  given node point to new DNode
            curr.setLinkNext(n); 
           
            //make nextDNode'  prev point to new DNode
            nextDNode.setLinkPrev(n);
    	}
    }


 // Delete the first node of the doubly linked list
    public void deleteFromStart(){
        if(size==0){
            System.out.println("\nList is Empty");
        }else{
            System.out.println("\ndeleting DNode " + head.getAge() + " from start");
            head = head.getLinkNext();
            size--;
        }
    }

 // Delete the node at the end of the doubly linked list
    public void deleteFromEnd(){
        if(size==0){
            System.out.println("\nList is Empty");
        }else if(size==1){
            deleteFromStart();
        }else{
            
        	NameCard prevTail = tail.getLinkPrev();
            //detach the last DNode
            tail = prevTail;
            prevTail.setLinkNext(null);
            System.out.println("Last node is deleted");
            size--;
        }
    }
    //delete a name card at the given index
    public void delete(int n){
    	System.out.println("Deleting a node after a index "+ n);
    	n=n-1;
    	if(n==0){
    		deleteFromStart();
    	}else if(n==size){
    		deleteFromEnd();
    	}else if (n>size){
    		System.out.println("Out of Range");
    	}else {	
    		NameCard curr = this.get(n);
    		NameCard next = curr.getLinkNext();
    		curr.setLinkPrev(next);
    		curr.setLinkNext(curr.getLinkNext().getLinkNext());
    		size--;
    		    	
    	}  	
    }
    
    // get a node with the given index 
    public NameCard get(int index){
        if(index >= size){
            return null;
        }
        NameCard n = head;
        
        int i=0;
        while(i<index){
        	i++;
        	n=n.getLinkNext();
        	
        }
        return n;
    }

    //get Size
    public int getSize(){
        return size;
    }
    
    // display the nodes in the doubly linked list
    public void display(){
    	if(head.getLinkNext()==null){
    		System.out.println("the doubly linked list is empty");
    	}
    	else{
    		NameCard curr=head;
    		while(curr!=null){
    			System.out.println(curr.getAge()+" "+ curr.getName()+" " + curr.getCompany()+", ");
    			curr=curr.getLinkNext();
    		}
    		System.out.println();
    		}
    	}
    
    public boolean exist(NameCard n){
    	boolean t = false;
    	NameCard curr = head;
    	while(curr.getLinkNext()!=null){
    		if(n.getAge()== curr.getAge() && n.getName()== curr.getName() && n.getCompany()== curr.getCompany() ){
    		t=true;
    		return t;
    	} 
    	curr = curr.getLinkNext();
    	}
    	return t;
    }
    
    public void printReverse(){
    	NameCard curr = tail;
    	while(curr != null){
    		System.out.println(curr.toString());
    		curr = curr.getLinkPrev();
    	}
    	System.out.println();
    }
   
}
