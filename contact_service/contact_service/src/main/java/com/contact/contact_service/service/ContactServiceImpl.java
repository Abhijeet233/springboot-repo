package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> l1= List.of(
            new Contact(100L,"c1@c1.com","c100",1L),
            new Contact(101L,"c2@c2.com","c101",2L),
            new Contact(102L,"c3@c3.com","c102",3L)
    );
    @Override
    public List<Contact> getContactsUser(Long contactId) {
        return l1.stream().filter(c -> c.getUserId().equals(contactId)).collect(Collectors.toList());
    }
}
