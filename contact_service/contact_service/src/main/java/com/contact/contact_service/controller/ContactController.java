package com.contact.contact_service.controller;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController
{

    @Autowired
    ContactService contactService;

    @GetMapping("/{contactId}")
    public List<Contact> getUserContact(@PathVariable("contactId") Long contactId){
        return  contactService.getContactsUser(contactId);
    }
}
