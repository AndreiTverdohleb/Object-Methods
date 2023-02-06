package objectMethods;

public class Main {
            public static void main(String[] args) {
            Author margaret = new Author("Маргарет","Митчелл");
            Book book1 = new Book("Унесенные ветром",margaret,1936);
            Author karl = new Author("Карл","Маркс");
            Book book2 = new Book("Капитал",karl,1867);
            book1.setAge(1937);
                System.out.println(book1);
                System.out.println(book2);

            }


}
