package com.harry.spring;


import org.springframework.boot.orm.jpa.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATION")
public class Location {

    @Id
    @GeneratedValue
    private Long id;
    
    private double latitude;
    private double longitude;
    private String heading;
    private double gpsSpeed;


}
