package org.springframework.samples.petclinic;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.samples.atm.user.UserRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetclinicIntegrationTests {

    @Autowired
    private UserRepository users;

    @Test
    public void testFindAll() throws Exception {
        users.findAll();
    }
}
