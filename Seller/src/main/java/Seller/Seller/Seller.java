package Seller.Seller;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "seller_email", nullable = false, unique = true)
    private String sellerEmail;

    @Column(name = "seller_firstname", nullable = false)
    private String sellerFirstname;

    @Column(name = "seller_lastname", nullable = false)
    private String sellerLastname;

    @Column(name = "seller_password", nullable = false)
    private String sellerPassword;

    @Column(name = "seller_streetAddress", nullable = false)
    private String sellerStreetAddress;

    @Column(name = "seller_city", nullable = false)
    private String sellerCity;

    @Column(name = "seller_zipcode", nullable = false)
    private int sellerZipcode;

    @Column(name = "seller_country", nullable = false)
    private String sellerCountry;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @CreationTimestamp
    private Date updatedAt;

    public Seller(){

    }

    public Seller(String seller_firstname, String seller_lastname, String seller_email, String seller_password, String seller_streetAddress, String seller_city, int seller_zipcode, String seller_country){
        this.setSellerFirstname(sellerFirstname);
        this.setSellerLastname(sellerLastname);
        this.setSellerEmail(sellerEmail);
        this.setSellerPassword(sellerPassword);
        this.setSellerStreetAddress(sellerStreetAddress);
        this.setSellerCity(sellerCity);
        this.setSellerZipcode(sellerZipcode);
        this.setSellerCountry(sellerCountry);
    }

    public int getId(){return id;}

    public String getSellerFirstname(){return sellerFirstname;}

    public void setSellerFirstname(String sellerFirstname) {this.sellerFirstname = sellerFirstname;}

    public String getSellerLastname(){return sellerLastname;}

    public void setSellerLastname(String sellerrLastname) {this.sellerLastname = sellerLastname;}

    public String getSellerEmail(){return sellerEmail;}

    public void setSellerEmail(String sellerEmail) {this.sellerEmail = sellerEmail;}

    public String getSellerPassword(){return sellerPassword;}

    public void setSellerPassword(String sellerPassword) {this.sellerPassword = sellerPassword;}

    public String getSellerStreetAddress(){return sellerStreetAddress;}

    public void setSellerStreetAddress(String sellerStreetAddress) {this.sellerStreetAddress = sellerStreetAddress;}

    public String getSellerCity(){return sellerCity;}

    public void setSellerCity(String buyerCity) {this.sellerCity = buyerCity;}

    public int getSellerZipcode(){return sellerZipcode;}

    public void setSellerZipcode(int sellerZipcode) {this.sellerZipcode = sellerZipcode;}

    public String getSellerCountry(){return sellerCountry;}

    public void setSellerCountry(String buyer_country) {this.sellerCountry =sellerCountry;}

    public Date getCreatedAt() {return createdAt;}

    public void setCreatedAt(Date createdAt){this.createdAt = createdAt;}

    public Date getUpdatedAt(){ return updatedAt;}

    public void setUpdatedAt(Date updatedAt){this.updatedAt = updatedAt;}
}

