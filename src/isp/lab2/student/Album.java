package isp.lab2.student;

import java.time.Duration;

public interface Album extends Product {

    public Duration getPlayingTime();

    public String getArtist();

}
