package Exercise_2_2.Data;

import Exercise_2_1.Data.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return getAuthorName() + "1, " + getAuthorName() + "2";
    }

    @Override
    public String toString() {
        StringBuilder authorsInfo = new StringBuilder();
        for (Author author : authors) {
            authorsInfo.append("Author[name=").append(author.getName())
                    .append(",email=").append(author.getEmail())
                    .append(",gender=").append(author.getGender()).append("], ");
        }

        // Remove the trailing comma and space
        if (authors.length > 0) {
            authorsInfo.setLength(authorsInfo.length() - 2);
        }

        return "Book[name=" + name + ", authors=[" + authorsInfo.toString() +
                "], price=" + price + ",qty=" + qty + "]";
    }
}
