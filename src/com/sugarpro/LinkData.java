package com.sugarpro;

import java.net.URL;
import java.util.Date;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String shohin;
     
    @Persistent
    private String pricea;
     
 
     
   /* @Persistent
    private Date datetime;*/
 
    public LinkData(String shohin,String pricea) {
        super();
        this.shohin= shohin;
        this.pricea = pricea;
        //this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getShohin() {
        return shohin;
    }
 
    public void setShohin(String shohin) {
        this.shohin = shohin;
    }
 
    public String getPrice() {
        return pricea;
    }
 
    public void setPrice(String price) {
        this.pricea = price;
    }
 
 
 /*   public Date getDatetime() {
        return datetime;
    }
 
   /* public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }*/
}
