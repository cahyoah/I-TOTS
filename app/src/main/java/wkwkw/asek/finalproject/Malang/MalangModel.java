package wkwkw.asek.finalproject.Malang;

/**
 * Created by ASUS on 19/11/2016.
 */

import java.io.Serializable;

public class MalangModel implements Serializable {
    String title, subtitle, image;

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}