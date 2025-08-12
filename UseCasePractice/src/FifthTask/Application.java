package FifthTask;

public class Application {

	public static void main(String[] args) {
		

		Electronics elec1 = new Electronics("E001", "Mixer");
        elec1.setWarrantyYears(2);

        Electronics elec2 = new Electronics("E002", "Laptop");
        elec2.setWarrantyYears(3);

        Book book1 = new Book("B001", "Girl on the Train");
        book1.setAuthor("Paula Hawkins");

        Book book2 = new Book("B002", "1984");
        book2.setAuthor("George Orwell");
		
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addProduct(elec1);
        electronicsInventory.addProduct(elec2);
        

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addProduct(book1);
        bookInventory.addProduct(book2);


        System.out.println("Electronics Inventory:");
        electronicsInventory.listAllProducts();

        System.out.println("\nBook Inventory:");
        bookInventory.listAllProducts();

	}

}
