import javax.persistence.*;
@Entity
@Table(name = "shippers")
public class Shippers {
    @Id
    @Column(name = "ShipperID")
    private int ShipperID;
    @Column(name = "ShipperName")
    private String ShipperName;
    @Column(name = "Phone")
    private String Phone;      

    public Shippers() {
    }

    public Shippers(int ShipperID, String ShipperName, String Phone) {
        this.ShipperID = ShipperID;
        this.ShipperName = ShipperName;
        this.Phone = Phone;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int ShipperID) {
        this.ShipperID = ShipperID;
    }

    public String getShipperName() {
        return ShipperName;
    }

    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
}

