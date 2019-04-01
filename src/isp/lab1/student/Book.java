package isp.lab1.student;

import java.time.LocalDate;

public interface Book {

    public String getTitle();

    public String getISBN();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getAuthor();

    public void order(int quantity);

    public int getPages();

    public String getFormattedReleaseDate();

}