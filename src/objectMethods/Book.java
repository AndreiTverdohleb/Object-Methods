  package objectMethods;

    public class Book {
        private final String bookName;
        private final Author authorName;
        private int age;

        public Book(String bookName, Author author, int age){
            this.bookName = bookName;
            this.authorName = author;
            this.age = age;
        }

        public String getBookName(){
            return this.bookName;
        }

        public Author getAuthorName(){
            return this.authorName;
        }

        public int getAge(){
            return this.age;
        }

        public void setAge(int age){
            this.age = age;
        }

        @Override
        public String toString(){
            return "Название книги " +'"'+ this.bookName + '"' +" Имя Автора " + this.authorName + " Год издания " + this.age;
        }

        @Override
        public boolean equals(Object other){
            if(this.getClass() != other.getClass())
            {
                return false;
            }
            Book book = (Book) other;
            return authorName.equals(((Book) other).authorName) && bookName.equals(((Book) other).bookName);

        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash (authorName,bookName,age);
        }
    }



