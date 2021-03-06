package services;

import com.astontech.hr.Application;
import com.astontech.hr.domain.Contact;
import com.astontech.hr.repositories.ContactRepository;
import com.astontech.hr.services.ContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class ContactServiceTest {
    @Autowired
    private ContactService contactService;

    @Test
    public void testContactServiceSave() {
        Contact contact = new Contact();
        contact.setFirstName("Abe");
        contact.setLastName("Raham");
        contact.setDescription("Tophatty President");

        assertNull(contact.getId());
        contactService.saveContact(contact);
        assertNotNull(contact.getId());
    }
}
