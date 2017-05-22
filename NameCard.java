public class NameCard {
	
		
	    private int age;
	    private String name, company;
	    private NameCard next;
	    private NameCard prev;
	 
	    /* Constructor 1*/
	    NameCard(int a, String n, String c)
	    {
	        next = null;
	        prev = null;
	        age = a;
	        name = n;
	        company = c;
	    }
	      
	    /* Constructor 2 */
	    NameCard(int a, String na, String c, NameCard n, NameCard p)
	    {
	        age = a;
	        next = n;
	        prev = p;
	        name = na;
	        company = c;
	    }
	    /* set link to next node */
	    public void setLinkNext(NameCard n)
	    {
	        next = n;
	    }
	    /* set link to previous node */
	    public void setLinkPrev(NameCard p)
	    {
	        prev = p;
	    }    
	    /* get link to next node */
	    public NameCard getLinkNext()
	    {
	        return next;
	    }
	    /* get link to previous node */
	    public NameCard getLinkPrev()
	    {
	        return prev;
	    }
	    /* set data to node */
	    public void setAge(int a)
	    {
	        age = a;
	    }
	    /* get data from node */
	    public int getAge()
	    {
	        return age;
	    }
	    public void setName(String n)
	    {
	        name = n;
	    }
	    /* get data from node */
	    public String getName()
	    {
	        return name;
	    }
	    public void setCompany(String c)
	    {
	        company = c;
	    }
	    /* get data from node */
	    public String getCompany()
	    {
	        return company;
	    }

		public String toString() {
			return  age + " " + " " + name + " " + company ;
		}
}
