/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; 
    private String refNumber; 
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; 
        refNumber = ""; 
        courseText = bookText; 
      
    }
        
           public boolean isCourseText(){
               return courseText; 
            }
            
            
        public void setBorrowed(){
            borrowed += 1; //page 56 addCredits
        }
        
        public int getBorrowed(){
            return borrowed; 
        }
        
                public void setRefNumber(String ref)
        {
            if( ref.length() >= 3){
                refNumber = ref;
            }
            else{
                System.out.println("Refnumber must be atleast 3 characters!");
            }
        }

    
    
    public String getRefNumber()
    {
        return refNumber; 
    }
      


    public String getAuthor (){
        return author; 
    }
    
    public String getTitle(){
        return title; 
        
    }
    
     public int getPages(){
        return pages; 
        
    }
    
    public void printAuthor(){
        System.out.println("Author is " + author); 
}


    public void printTitle(){
        System.out.println("Title is " + title); 
}

public void printDetails()
{
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Pages: " + pages);
    System.out.println("Amount of times book borrowed:" + borrowed); 
    
    if(refNumber.length() > 0){
        System.out.println("Refnumber = " + refNumber);
    }
    else{
        System.out.println("Refnumber = ZZZ");
    }
}


}