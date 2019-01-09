package e.wolfsoft1.uiuxlabecommerce_jp_dark13.model;

public class Model_Shirt {


    private final Integer shirt_image;
    private final String shirt_price;
    private final String shirt_type;
    private final String shirt_decoration;

    public Model_Shirt(Integer shirt_image, String shirt_price, String shirt_type, String shirt_decoration) {
        this.shirt_image=shirt_image;
        this.shirt_price=shirt_price;
        this.shirt_type=shirt_type;
        this.shirt_decoration=shirt_decoration;
    }

    public Integer getShirt_image() {
        return shirt_image;
    }

    public String getShirt_price() {
        return shirt_price;
    }

    public String getShirt_type() {
        return shirt_type;
    }

    public String getShirt_decoration() {
        return shirt_decoration;
    }
}
