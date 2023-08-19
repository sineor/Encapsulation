class Book {
        private String name;
        private int number;
        private String author;

        public Book(String name, int number, String author) {
            this.name = name;
            this.number = number;
            this.author = author;
        }
        public Book(){

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +"\n"+
                    "name; " + name  +
                    ", number=" + number +
                    ", author='" + author + '\'' +
                    '}';
        }
    }