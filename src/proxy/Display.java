package proxy;

public class Display {
        private Books tableBooks = new Romans();

        public void printBooks() {
            String[] books = tableBooks.getBooks();
            String[] tmpArr;
            System.out.println("Название\tАвтор\tГод издания");
            for(int i = 0; i < books.length; i++) {
                tmpArr = books[i].split(";");
                System.out.printf("%s\t\t\t%s\t\t\t%s\n", tmpArr[0], tmpArr[1], tmpArr[2]);
            }
        }
    public static void main(String[] args) {
        Display display = new Display();
        display.printBooks();
    }
}
