package aggregation;

public class Book {
	
	String Bookname;
	int Price;
	Author adr;//refernce variable as adr.adr-any name
	
	public Book(String Bookname,int Price,Author adr)//add Address adr also as parameter
	{
		this.Bookname=Bookname;
		this.Price=Price;
		this.adr=adr; //parameter
	}
	public void display()
	{
		System.out.println("Book name : "+Bookname);
		System.out.println("Book Price : "+ Price);
		System.out.println("Author Name : "+adr.AuthorName);
		System.out.println("Volume of Book : "+adr.noOfBook);
		System.out.println("Place : "+adr.place);
		
		
	}

	public static void main(String[] args) {
		Author obj1=new Author("Aravind","Trivandrum",2);
		Book obj2=new Book("DKJFVHDKF",454,obj1);
				obj2.display();

	}

}
