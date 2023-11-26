package ParkingServer316.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vehicle")

public class Vehicle {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String Name;

    public Vehicle(long id, String name) {
        this.id = id;
        Name = name;
    }

    public Vehicle() {
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return Name;
    }

//    public void setName(String name) {
//        Name = name;
//    }
}
