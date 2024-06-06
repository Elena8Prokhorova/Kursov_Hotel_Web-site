package hotel_labs.lr3_1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reviews",schema="hotel_labs",catalog="hotel_labs")
public class Review {
    @Id
    @Column(name = "idReview",unique = true)
    private String idReview;
    @Column(name = "role",nullable = false)
    private String role;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "text",nullable = false)
    private String text;

    public Review() {
        this.idReview = Long.toString(System.currentTimeMillis()/1000L);
    }

    public Review(String name, String text) {
        this.idReview = Long.toString(System.currentTimeMillis()/1000L);
        this.role = "клиент";
        this.name = name;
        this.text = text;
    }

    public Review(String role, String name, String text) {
        this.idReview = Long.toString(System.currentTimeMillis()/1000L);
        this.role = role;
        this.name = name;
        this.text = text;
    }

    public String getIdReview() {
        return idReview;
    }

    public void setIdReview(String idReview) {
        this.idReview = idReview;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
