/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab1;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author Teddy
 */
public interface Album {
    
    public String getTitle();
    
    public String getArtist();
    
    public Duration getPlayingTime();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public void order(int quantity);

    public String getFormattedReleaseDate();

}
