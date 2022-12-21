package pro.sky.java.course1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Иванов");
        Book book1 = new Book("Сделай сам", author1, 1980);
        Author author2 = new Author("Дима", "Петров");
        Book book2 = new Book("Химия. Учебник для 10-го класса.", author2, 2009);
        System.out.println("Book1 = " + book1);
        System.out.println("Book2 = " + book2);
        book1.setYearOfPublication(1985);
        book2.setYearOfPublication(2010);
        System.out.println("Измененный год публикации книги Book1 = " + book1.getYearOfPublication());
        System.out.println("Измененный год публикации книги Book2 = " + book2.getYearOfPublication());


    }
}