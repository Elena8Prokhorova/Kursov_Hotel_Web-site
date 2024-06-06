package hotel_labs.lr3_1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="foods",schema="hotel_labs",catalog="hotel_labs")
public class Food {
    @Id
    @Column(name = "idFood",unique = true)
    private String idFood;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "description",nullable = false)
    private String description;
    @Column(name = "price",nullable = false)
    private int price;
    @Column(name = "link")
    private String link;
    @Column(name = "img",nullable = false)
    private String img;

    public Food() {
        this.idFood = Long.toString(System.currentTimeMillis()/1000L);
    }

    public Food(String idFood, String name, String description, int price, String link,
                String img) {
        this.idFood = idFood;
        this.name = name;
        this.description = description;
        this.price = price;
        this.link = link;
        this.img = img;
    }

    public String getIdFood() {
        return idFood;
    }

    public void setIdFood(String idFood) {
        this.idFood = idFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
