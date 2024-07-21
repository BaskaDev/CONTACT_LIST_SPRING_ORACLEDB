package com.example.contacts_crud.model;

import jakarta.persistence.*;

@Entity
@Table(name="contacts")
public class Contact {

    /*
    ID para determinar el atributo que sera el id
    @GeneratedValue fija la estrategia y asigna cual generador de la base de datos asignara este

     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contacts_seq")
    @SequenceGenerator(name = "contacts_seq", sequenceName = "contacts_seq", allocationSize = 1)
    private Long id_contact;

    @Column(name="NAME_CONTACT")
    private String name_contact;

    @Column(name="EMAIL_CONTACT")
    private String email_contact;

    @Column(name="NUMBER_CONTACT")
    private String number_contact;

    // Getters and setters
    public Long getId_contact() {
        return id_contact;
    }

    public void setId_contact(Long id_contact) {
        this.id_contact = id_contact;
    }

    public String getName_contact() {
        return name_contact;
    }

    public void setName_contact(String name_contact) {
        this.name_contact = name_contact;
    }

    public String getEmail_contact() {
        return email_contact;
    }

    public void setEmail_contact(String email_contact) {
        this.email_contact = email_contact;
    }

    public String getNumber_contact() {
        return number_contact;
    }

    public void setNumber_contact(String number_contact) {
        this.number_contact = number_contact;
    }
}
