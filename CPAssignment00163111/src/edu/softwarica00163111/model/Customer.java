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
@Table(name = "customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findById", query = "SELECT c FROM Customer c WHERE c.id = :id"),
    @NamedQuery(name = "Customer.findByName", query = "SELECT c FROM Customer c WHERE c.name = :name"),
    @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address"),
    @NamedQuery(name = "Customer.findByContactNo", query = "SELECT c FROM Customer c WHERE c.contactNo = :contactNo"),
    @NamedQuery(name = "Customer.findByBookPurchased", query = "SELECT c FROM Customer c WHERE c.bookPurchased = :bookPurchased"),
    @NamedQuery(name = "Customer.findByPurchaseDate", query = "SELECT c FROM Customer c WHERE c.purchaseDate = :purchaseDate"),
    @NamedQuery(name = "Customer.findByQuantity", query = "SELECT c FROM Customer c WHERE c.quantity = :quantity"),
    @NamedQuery(name = "Customer.findByRate", query = "SELECT c FROM Customer c WHERE c.rate = :rate"),
    @NamedQuery(name = "Customer.findByDiscount", query = "SELECT c FROM Customer c WHERE c.discount = :discount"),
    @NamedQuery(name = "Customer.findByTotalAmount", query = "SELECT c FROM Customer c WHERE c.totalAmount = :totalAmount")})
public class Customer implements Serializable {
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
    @Column(name = "BookPurchased")
    private String bookPurchased;
    @Basic(optional = false)
    @Column(name = "PurchaseDate")
    private String purchaseDate;
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

    public Customer() {
    }

    public Customer(Integer id) {
        this.id = id;
    }

    public Customer(Integer id, String name, String address, String contactNo, String bookPurchased, String purchaseDate, int quantity, float rate, float discount, float totalAmount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.bookPurchased = bookPurchased;
        this.purchaseDate = purchaseDate;
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

    public String getBookPurchased() {
        return bookPurchased;
    }

    public void setBookPurchased(String bookPurchased) {
        this.bookPurchased = bookPurchased;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.softwarica00163111.model.Customer[ id=" + id + " ]";
    }
    
}
