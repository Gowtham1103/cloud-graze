package com.gowatr.cloudgraze.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@AttributeOverride(name = "current_month_tot", column = @Column(name = "Current_month_tot"))
public class CgEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> door_no;

    @ElementCollection
    private List<List<String>> time;

    @ElementCollection
    private List<Integer> last_month_tot;

    @ElementCollection
    private List<Integer> current_month_tot;

    @ElementCollection
    private List<Integer> last_tot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getDoor_no() {
        return door_no;
    }

    public void setDoor_no(List<String> door_no) {
        this.door_no = door_no;
    }

    public List<List<String>> getTime() {
        return time;
    }

    public void setTime(List<List<String>> time) {
        this.time = time;
    }

    public List<Integer> getLast_month_tot() {
        return last_month_tot;
    }

    public void setLast_month_tot(List<Integer> last_month_tot) {
        this.last_month_tot = last_month_tot;
    }

    public List<Integer> getCurrent_month_tot() {
        return current_month_tot;
    }

    public void setCurrent_month_tot(List<Integer> current_month_tot) {
        this.current_month_tot = current_month_tot;
    }

    public List<Integer> getLast_tot() {
        return last_tot;
    }

    public void setLast_tot(List<Integer> last_tot) {
        this.last_tot = last_tot;
    }

    public static CgEntity createFromRequest(List<String> doorNo, List<List<String>> time, List<Integer> lastMonthTot,
                                             List<Integer> currentMonthTot, List<Integer> lastTot) {
        CgEntity cgEntity = new CgEntity();
        cgEntity.setDoor_no(doorNo);
        cgEntity.setTime(time);
        cgEntity.setLast_month_tot(lastMonthTot);
        cgEntity.setCurrent_month_tot(currentMonthTot);
        cgEntity.setLast_tot(lastTot);
        return cgEntity;
    }
}


