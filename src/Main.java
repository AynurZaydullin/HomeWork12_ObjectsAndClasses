public class Main {
    public static void main(String[] args) {
        Author Author1 = new Author("Иван", "Иванов");
        Book Book1 = new Book("Сделай сам", Author1, 1980);
        Author Author2 = new Author("Дима", "Петров");
        Book Book2 = new Book("Химия. Учебник для 10-го класса.", Author2, 2009);
        System.out.println("Book1 = " + Book1);
        System.out.println("Book2 = " + Book2);
        Book1.setYearOfPublication(1985);
        Book2.setYearOfPublication(2010);
        System.out.println("Измененный год публикации книги Book1 = " + Book1.getYearOfPublication());
        System.out.println("Измененный год публикации книги Book2 = " + Book2.getYearOfPublication());


    }
}