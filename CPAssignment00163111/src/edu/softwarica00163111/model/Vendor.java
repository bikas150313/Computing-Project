/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bikas
 */
@Entity
@Table(name = "vendor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendor.findAll", query = "SELECT v FROM Vendor v"),
    @NamedQuery(name = "Vendor.findById", query = "SELECT v FROM Vendor v WHERE v.id = :id"),
    @NamedQuery(name = "Vendor.findByName", query = "SELECT v FROM Vendor v WHERE v.name = :name"),
    @NamedQuery(name = "Vendor.findByAddress", query = "SELECT v FROM Vendor v WHERE v.address = :address"),
    @NamedQuery(name = "Vendor.findByContactNo", query = "SELECT v FROM Vendor v WHERE v.contactNo = :contactNo"),
    @NamedQuery(name = "Vendor.findByEmail", query = "SELECT v FROM Vendor v WHERE v.email = :email"),
    @NamedQuery(name = "Vendor.findByBookPurchased", query = "SELECT v FROM Vendor v WHERE v.bookPurchased = :bookPurchased"),
    @NamedQuery(name = "Vendor.findByAuthor", query = "SELECT v FROM Vendor v WHERE v.author = :author"),
    @NamedQuery(name = "Vendor.findByPurchasedDate", query = "SELECT v FROM Vendor v WHERE v.purchasedDate = :purchasedDate"),
    @NamedQuery(name = "Vendor.findByQuantity", query = "SELECT v FROM Vendor v WHERE v.quantity = :quantity"),
    @NamedQuery(name = "Vendor.findByRate", query = "SELECT v FROM Vendor v WHERE v.rate = :rate"),
    @NamedQuery(name = "Vendor.findByDiscount", query = "SELECT v FROM Vendor v WHERE v.discount = :discount"),
    @NamedQuery(name = "Vendor.findByTotalAmount", query = "SELECT v FROM Vendor v WHERE v.totalAmount = :totalAmount")})
public class Vendor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "ContactNo")
    private String contactNo;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "BookPurchased")
    private String bookPurchased;
    @Basic(optional = false)
    @Column(name = "Author")
    private String author;
    @Basic(optional = false)
    @Column(name = "PurchasedDate")
    private String purchasedDate;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "Rate")
    private float rate;
    @Basic(optional = false)
    @Column(name = "Discount")
    private float discount;
    @Basic(optional = false)
    @Column(name = "TotalAmount")
    private float totalAmount;

    public Vendor() {
    }

    public Vendor(Integer id) {
        this.id = id;
    }

    public Vendor(Integer id, String name, String address, String contactNo, String email, String bookPurchased, String author, String purchasedDate, int quantity, float rate, float discount, float totalAmount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
        this.bookPurchased = bookPurchased;
        this.author = author;
        this.purchasedDate = purchasedDate;
        this.quantity = quantity;
        this.rate = rate;
        this.discount = discount;
        this.totalAmount = totalAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBookPurchased() {
        return bookPurchased;
    }

    public void setBookPurchased(String bookPurchased) {
        this.bookPurchased = bookPurchased;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(String purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendor)) {
            return false;
        }
        Vendor other = (Vendor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.softwarica00163111.model.Vendor[ id=" + id + " ]";
    }
    
}
