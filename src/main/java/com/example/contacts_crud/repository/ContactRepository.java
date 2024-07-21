package com.example.contacts_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contacts_crud.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
