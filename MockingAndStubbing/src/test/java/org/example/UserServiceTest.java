package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void testGetUserName_whenUserExists() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById("1")).thenReturn(new User("1", "Arun"));

        UserService userService = new UserService(mockRepo);

        String name = userService.getUserName("1");

        assertEquals("Arun", name);
    }

    @Test
    void testGetUserName_whenUserDoesNotExist() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById("99")).thenReturn(null);

        UserService userService = new UserService(mockRepo);

        String name = userService.getUserName("99");

        assertEquals("Unknown User", name);
    }
}
