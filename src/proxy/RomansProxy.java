package proxy;

public class RomansProxy implements Books {
        private Books books = new Romans();

        private String[] booksCache = null;

        @Override
        public String[] getBooks() {
            if(booksCache== null) {
                booksCache = books.getBooks();
            }
            return booksCache;
        }

        public void clearCache() {
            books = null;
        }

}
