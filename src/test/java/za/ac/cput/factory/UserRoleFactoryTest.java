package za.ac.cput.factory;
/*
UserRoleFactoryTest.java
Test for userRoleFactory
Author: Siphelele Nyathi 218334028
Date: O4.04.2022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.UserRole;
import static org.junit.jupiter.api.Assertions.*;

class UserRoleFactoryTest {

    @Test
    void buildRole() {

        // Should create role type
        UserRole role = UserRoleFactory.createRole("Administrator");
        assertNotNull(role);

        System.out.println(role.toString());
    }

    @Test
    void buildWithNull(){
        //return null because no role type is entered
        UserRole role1 = UserRoleFactory.createRole("");
        assertNotNull(role1);
        System.out.println(role1.toString());
    }
}