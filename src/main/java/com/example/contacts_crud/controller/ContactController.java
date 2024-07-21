package com.example.contacts_crud.controller;



import com.example.contacts_crud.model.Contact;
import com.example.contacts_crud.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class ContactController {

    private List<Contact> contacts = new ArrayList<>();

    @Autowired
    ContactRepository contactRepository;

    /*
    * http://localhost:8080/contacts
     */

    @GetMapping(path = "/contacts")
    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    /*
     * http://localhost:8080/newContact
     */
    @PostMapping(path="/newContact")
    public Contact addContact (@RequestBody Contact contact){
        contactRepository.save(contact);
        return contact;
    }

    /*
     * http://localhost:8080/deleteContact
     */
    @DeleteMapping(path="/deleteContact")
    public Contact deleteContact(@RequestBody Contact contact){
        contactRepository.delete(contact);
        return  contact;
    }

    /*
     * http://localhost:8080/updateContact/id
     */

    @PutMapping(path = "/updateContact/{id}")
    public Contact updateContact(@PathVariable Long id ,@RequestBody Contact contact ){
        Optional<Contact> optionalContact = contactRepository.findById(id);
        if(optionalContact.isPresent()){
            Contact contact_update = optionalContact.get();
            contact_update.setId_contact(id);
            contact_update.setName_contact(contact.getName_contact());
            contact_update.setEmail_contact(contact.getEmail_contact());
            contact_update.setNumber_contact(contact.getNumber_contact());
            contactRepository.delete(contact);
            contactRepository.save(contact_update);
            return contact_update;
        }
        return contact;

    }



}
