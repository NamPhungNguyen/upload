/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Bill {
    private String ID;
    private String idEmployee;
    private String idGuest;
    private String nameGuest;
    private String roomNumber;
    private int cost;
    private Date dateStart;
    private Date dateStop;

    public Bill() {
    }

    public Bill(String ID, String idEmployee, String idGuest, String nameGuest, String roomNumber, int cost, Date dateStart, Date dateStop) {
        this.ID = ID;
        this.idEmployee = idEmployee;
        this.idGuest = idGuest;
        this.nameGuest = nameGuest;
        this.roomNumber = roomNumber;
        this.cost = cost;
        this.dateStart = dateStart;
        this.dateStop = dateStop;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(String idGuest) {
        this.idGuest = idGuest;
    }

    public String getNameGuest() {
        return nameGuest;
    }

    public void setNameGuest(String nameGuest) {
        this.nameGuest = nameGuest;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateStop() {
        return dateStop;
    }

    public void setDateStop(Date dateStop) {
        this.dateStop = dateStop;
    }
    
    
}
