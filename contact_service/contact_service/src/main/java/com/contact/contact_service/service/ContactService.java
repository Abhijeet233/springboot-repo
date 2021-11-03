package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getContactsUser(Long contactId);
}
