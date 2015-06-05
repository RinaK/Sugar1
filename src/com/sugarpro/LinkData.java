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
    private int pricea;
     
    @Persistent
    private String password;
     
   /* @Persistent
    private Date datetime;*/
 
    public LinkData(String shohin,int pricea, String password) {
        super();
        this.shohin= shohin;
        this.pricea = pricea;
        this.password = password;
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
 
    public int getPrice() {
        return pricea;
    }
 
    public void setPrice(int price) {
        this.pricea = price;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
 /*   public Date getDatetime() {
        return datetime;
    }
 
   /* public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }*/
}
