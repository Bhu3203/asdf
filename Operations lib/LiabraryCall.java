package Operations;

import java.util.Scanner;
import entity.Book;
import entity.Member;
import service.Liabrary;

public class LiabraryCall {

    public static void main(String[] args) {
        Liabrary lia = new Liabrary();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("**********************************");
            System.out.println("***** Welcome to Library 420 ****");
            System.out.println("**********************************");
            System.out.println("1. Add Book"
                    + "\n2. Remove Book"                    
                    + "\n3. Display All Books"
                    + "\n4. Display All Members"
                    + "\n5. Update Book"
                    + "\n6. Search Book By Title"
                    + "\n7. Search Book By Author"
                    + "\n8. Search Book By Category"
                    + "\n9. Add Member"
                    + "\n10. Remove Member"
                    + "\n11. Update Member"
                    + "\n12. Get Member By Id"
                    + "\n13. Borrow Book"
                    + "\n14. Return Book"                    
                    + "\n0. Exit");
            System.out.println("**********************************");

            System.out.println("Enter your choice");
            ch = sc.nextInt();
            sc.nextLine();  

            switch (ch) {
                case 1:{
                    System.out.println("Enter book title");
                    String title = sc.nextLine();
                    System.out.println("Enter book author");
                    String author = sc.nextLine();
                    System.out.println("Enter book category");
                    String category = sc.nextLine();
                    Book book = new Book(title, author, category);
                    lia.addBook(book);
                    break;
                }

                case 2:{
                    System.out.println("Enter bookId to remove");
                    String bookId = sc.next();
                    lia.removeBook(bookId); 
                    break;
                    }
                case 3:
                    System.out.println("Details of all books:");
                    lia.displayAllBooks();
                    break;

                case 4:
                    System.out.println("Details of all members:");
                    lia.displayAllMembers();
                    break;

                case 5:
                {
                    System.out.println("Enter bookId to update");
                    String bookId = sc.next();
               
                    System.out.println("Enter new book title");
                    String Title = sc.nextLine();
                    System.out.println("Enter new author");
                    String Author = sc.nextLine();
                    System.out.println("Enter new category");
                    String Category = sc.nextLine();
                    Book updatedBook = new Book(Title, Author, Category);
                    lia.updateBook(bookId, updatedBook);  
                    break;
                    }
                case 6:
                {
                	System.out.println("Enter book title to search");
                    String title = sc.nextLine();
                    lia.searchBook(title);
                    break;
                }
                case 7:
                {
                	System.out.println("Enter  author to search");
                    String Author = sc.nextLine();
                    lia.searchByAuthor(Author);
                    break;
                }
                case 8:
                {
                	System.out.println("Enter category to search");
                    String Category = sc.nextLine();
                    lia.searchByCategory(Category);
                    break;
                }
                case 9:
                {
                    System.out.println("Enter member name");
                    String name = sc.nextLine();
                   
                    Member mem = new Member(name);
                    lia.addMember(mem);
                    break;
                }
                case 10:
                {
                    System.out.println("Enter member Id to remove member");
                    String memId = sc.nextLine();                                    
                    lia.removeMember(memId);
                    break;
                }
                case 11:
                {
                	System.out.println("Enter MemberId to update");
                    String memberId = sc.next();
               
                    System.out.println("Enter new Member name");
                    String name = sc.nextLine();                   
                    Member updatedmem = new Member(name);
                    lia.updateMember(memberId, updatedmem);  
                    break;
                }
                case 12:
                {
                	System.out.println("Enter MemberId to search");
                    String memberId = sc.next();
                    lia.getMemberById(memberId); 
                    break;
                }
                case 13:
                {
                	System.out.println("Enter MemberId ");
                    String memberId = sc.next();
                    System.out.println("Enter BookId ");
                    String bookId = sc.next();
                    lia.borrowBook(memberId, bookId); 
                    break;
                }
                case 14:
                {
                	System.out.println("Enter MemberId ");
                    String memberId = sc.next();
                    System.out.println("Enter BookId ");
                    String bookId = sc.next();
                    lia.returnBook(memberId, bookId); 
                    break;
                }
                
                case 0:
                    System.out.println("Thank you for using Library 420!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }

        } while (ch != 0);
    }
}

