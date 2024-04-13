package ntu.mssv63132461.myapplication;

public class LandSpace {
    String Image, Caption;

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public LandSpace(String image, String caption) {
        Image = image;
        Caption = caption;
    }
    
}
