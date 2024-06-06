package hotel_labs.lr3_1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders",schema="hotel_labs",catalog="hotel_labs")
public class Order {
    @Id
    @Column(name = "idOrder",unique = true)
    private String idOrder;
    @Column(name = "list",nullable = false)
    private String list;
    @Column(name = "price",nullable = false)
    private int price;

    public Order() {}

    public Order(String idOrder, String list, int price) {
        this.idOrder = idOrder;
        this.list = list;
        this.price = price;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
