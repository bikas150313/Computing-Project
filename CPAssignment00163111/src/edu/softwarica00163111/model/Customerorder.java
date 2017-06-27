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
@Table(name = "customerorder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customerorder.findAll", query = "SELECT c FROM Customerorder c"),
    @NamedQuery(name = "Customerorder.findById", query = "SELECT c FROM Customerorder c WHERE c.id = :id"),
    @NamedQuery(name = "Customerorder.findByCustomerName", query = "SELECT c FROM Customerorder c WHERE c.customerName = :customerName"),
    @NamedQuery(name = "Customerorder.findByAddress", query = "SELECT c FROM Customerorder c WHERE c.address = :address"),
    @NamedQuery(name = "Customerorder.findByContactNo", query = "SELECT c FROM Customerorder c WHERE c.contactNo = :contactNo"),
    @NamedQuery(name = "Customerorder.findByBookOrdered", query = "SELECT c FROM Customerorder c WHERE c.bookOrdered = :bookOrdered"),
    @NamedQuery(name = "Customerorder.findByAuthor", query = "SELECT c FROM Customerorder c WHERE c.author = :author"),
    @NamedQuery(name = "Customerorder.findByQuantity", query = "SELECT c FROM Customerorder c WHERE c.quantity = :quantity"),
    @NamedQuery(name = "Customerorder.findByOrderDate", query = "SELECT c FROM Customerorder c WHERE c.orderDate = :orderDate")})
public class Customerorder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CustomerName")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "ContactNo")
    private String contactNo;
    @Basic(optional = false)
    @Column(name = "BookOrdered")
    private String bookOrdered;
    @Basic(optional = false)
    @Column(name = "Author")
    private String author;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "OrderDate")
    private String orderDate;

    public Customerorder() {
    }

    public Customerorder(Integer id) {
        this.id = id;
    }

    public Customerorder(Integer id, String customerName, String address, String contactNo, String bookOrdered, String author, int quantity, String orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.address = address;
        this.contactNo = contactNo;
        this.bookOrdered = bookOrdered;
        this.author = author;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getBookOrdered() {
        return bookOrdered;
    }

    public void setBookOrdered(String bookOrdered) {
        this.bookOrdered = bookOrdered;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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
        if (!(object instanceof Customerorder)) {
            return false;
        }
        Customerorder other = (Customerorder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.softwarica00163111.model.Customerorder[ id=" + id + " ]";
    }
    
}
