package Inheritence;

public class BookAggre {
	String bName;
	int id;
	AuthorAggre a;//Aggregation.
	public BookAggre(String bName,int id,AuthorAggre a)
	{
		this.bName=bName;
		this.id=id;
		this.a=a;
		
	}
	public void det()
	{
		System.out.println("Author Name: "+a.name+","+" Age of author: "+a.age);
		System.out.println("Name of the book: "+bName+","+" Book Id: "+id);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AuthorAggre obj=new AuthorAggre("Benyamin",55);
BookAggre obj1=new BookAggre("Aadujeevitham",121,obj);
obj1.det();
	}

}
