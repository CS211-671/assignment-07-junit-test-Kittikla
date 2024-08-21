package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("abc","123");
        userList.addUser("def","456");
        userList.addUser("ghi","789");

        // TODO: find one of them
        assertEquals("abc",userList.findUserByUsername("abc").getUsername());
        // TODO: assert that UserList found User
        String expected = "abc";
        String actual = userList.findUserByUsername("abc").getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList userList = new UserList();
        // TODO: add 3 users to UserList
        userList.addUser("abc","123");
        userList.addUser("def","456");
        userList.addUser("ghi","789");
        // TODO: change password of one user
        userList.changePassword("abc","123","456");
        // TODO: assert that user can change password
        boolean actual = userList.findUserByUsername("abc").validatePassword("456");
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}