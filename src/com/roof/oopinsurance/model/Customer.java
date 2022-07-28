package com.roof.oopinsurance.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    // variables (state)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String ssid;

    @OneToMany(mappedBy = "customer")
    private List<Vehicle> vehicleList = new ArrayList<>();

    // constructors
    public Customer(String name, String address, String ssid) {
        this.name = name;
        this.address = address;
        this.ssid = ssid;
    }

    public Customer() {
    }

    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // toString()

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssid='" + ssid + '\'' +
                ", vehicleList=" + vehicleList +
                '}';
    }
}
