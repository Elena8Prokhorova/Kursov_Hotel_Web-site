package hotel_labs.lr3_1.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="hotelrooms",schema="hotel_labs",catalog="hotel_labs")
public class HotelRoom {
    @Id
    @Column(name = "idRoom",unique = true)
    private String idRoom;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "description",nullable = false)
    private String description;
    @Column(name = "amountLeft")
    private int amountLeft;
    @Column(name = "amountPerson",nullable = false)
    private int amountPerson;
    @Column(name = "viewWindow",nullable = false)
    private String viewWindow;
    @Column(name = "workPlaceInRoom",nullable = false)
    private boolean workPlaceInRoom;
    @Column(name = "conditionerInRoom",nullable = false)
    private boolean conditionerInRoom;
    @Column(name = "saveInRoom",nullable = false)
    private boolean saveInRoom;
    @Column(name = "kettleInRoom",nullable = false)
    private boolean kettleInRoom;
    @Column(name = "img",nullable = false)
    private String img;


    public HotelRoom() {
        idRoom = UUID.randomUUID().toString();
    }
    public HotelRoom(String name, String description, int amountLeft, int amountPerson,
                     String viewWindow, boolean workPlaceInRoom, boolean conditionerInRoom,
                     boolean saveInRoom, boolean kettleInRoom, String img) {
        this.idRoom = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.amountLeft = amountLeft;
        this.amountPerson = amountPerson;
        this.viewWindow = viewWindow;
        this.workPlaceInRoom = workPlaceInRoom;
        this.conditionerInRoom = conditionerInRoom;
        this.saveInRoom = saveInRoom;
        this.kettleInRoom = kettleInRoom;
        this.img = img;
    }

    public boolean isSameId(HotelRoom hotelRoom) {
        return this.getIdRoom().equals(hotelRoom.getIdRoom());
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public int getAmountPerson() {
        return amountPerson;
    }

    public void setAmountPerson(int amountPerson) {
        this.amountPerson = amountPerson;
    }

    public String getViewWindow() {
        return viewWindow;
    }

    public void setViewWindow(String viewWindow) {
        this.viewWindow = viewWindow;
    }

    public boolean isKettleInRoom() {
        return kettleInRoom;
    }

    public void setKettleInRoom(boolean kettleInRoom) {
        this.kettleInRoom = kettleInRoom;
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

    public int getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(int amountLeft) {
        this.amountLeft = amountLeft;
    }

    public boolean isWorkPlaceInRoom() {
        return workPlaceInRoom;
    }

    public void setWorkPlaceInRoom(boolean workPlaceInRoom) {
        this.workPlaceInRoom = workPlaceInRoom;
    }

    public boolean isConditionerInRoom() {
        return conditionerInRoom;
    }

    public void setConditionerInRoom(boolean conditionerInRoom) {
        this.conditionerInRoom = conditionerInRoom;
    }

    public boolean isSaveInRoom() {
        return saveInRoom;
    }

    public void setSaveInRoom(boolean saveInRoom) {
        this.saveInRoom = saveInRoom;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
