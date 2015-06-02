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
    private String Shohin;
     
    @Persistent
    private int price;
     
    @Persistent
    private Long password;
     
    @Persistent
    private Date datetime;
 
    public LinkData(String shohin, int price, Long password, Date datetime) {
        super();
        this.Shohin= shohin;
        this.price = price;
        this.password = password;
        this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getShohin() {
        return Shohin;
    }
 
    public void setShohin(String shohin) {
        this.Shohin = shohin;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
 
    public Long getPassword() {
        return password;
    }
 
    public void setComment(Long password) {
        this.password = password;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
