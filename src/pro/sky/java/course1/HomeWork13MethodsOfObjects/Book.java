package pro.sky.java.course1.HomeWork13MethodsOfObjects;

public class Book {
    private final String title;


    private final Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название книги = " + title + '\n' +
                author +
                "Год публикации =" + yearOfPublication + '\n';
    }


}