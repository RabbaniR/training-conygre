package com.conygre.assessment.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="bridge")
public class Bridge implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    // add attributes for all the remaining properties
    @Column(name="name") private String name;
    @Column(name="max_traffic_flow") private Double max_traffic_flow;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMax_traffic_flow() {
        return max_traffic_flow;
    }

    public void setMax_traffic_flow(Double max_traffic_flow) {
        this.max_traffic_flow = max_traffic_flow;
    }



}
