package com.store.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Setter
    @Getter
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Setter
    @Getter
    @Column(name = "address_line_1", nullable = false, length = 512)
    private String addressLine1;

    @Setter
    @Getter
    @Column(name = "address_line_2", length = 512)
    private String addressLine2;

    @Setter
    @Getter
    @Column(name = "country", nullable = false, length = 75)
    private String country;

    @Setter
    @Getter
    @Column(name = "city", nullable = false)
    private String city;

    @Setter
    @Getter
    @Column(name = "state", nullable = false, length = 75)
    private String state;

    @Setter
    @Getter
    @Column(name = "zip_code", nullable = false, length = 10)
    private String zipCode;


}