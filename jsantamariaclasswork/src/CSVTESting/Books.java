package CSVTESting;

public class Books {
	import java.io.BufferedReader;
	import java.util.ArrayList;
	import java.util.List;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Paths;

		
		public static void main(String[] args) {
			 List <Books> books = readBooksFromCSV("books.csv");
			 for (Books b : books) { System.out.println(b); }


		}
		
		private static List<Books> readBooksFromCSV(String filename){
			List<Books> books = new ArrayList<>();
			Path pathToFile = Paths.get(filename);
			 try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)) {
				 
				 String line = br.readLine();
				 while(line != null && line != ""){
					 String[] attributes = line.split(",");
					Books book = createBooks(attributes);
					books.add(book);
					line = br.readLine();
				 }
			 }
			 catch(IOException ioe) {
				 ioe.printStackTrace();
			 }
			 return books;
		}
		
		private static Books createBooks(String[] metadata) {
			String names = metadata[0];
			String authors = metadata[2];
			int prices = Integer.parseInt(metadata[1]);
			return new Books(names,prices,authors);
		}
		
		private int price;
		private String name;
		private String author;
		public Books(String name,int price,String author) {
			this.name = name;
			this.price = price;
			this.author = author;
		}
		
		public String toString() {
			return this.name + ", price " + this.price + "," + this.author;
		}
		
	}
}
