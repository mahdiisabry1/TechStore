package com.store.techstore_backend.model;

import jakarta.persistence.*;
import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item_orders")
public class ItemOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "local_user_id", nullable = false)
    private LocalUser user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ItemOrdersQuantity> quantities = new ArrayList<>();

    public List<ItemOrdersQuantity> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<ItemOrdersQuantity> quantities) {
        this.quantities = quantities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalUser getUser() {
        return user;
    }

    public void setUser(LocalUser user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
