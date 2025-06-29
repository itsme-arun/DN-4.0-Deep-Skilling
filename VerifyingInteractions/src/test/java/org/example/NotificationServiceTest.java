package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class NotificationServiceTest {

    @Test
    void testSendIsCalled() {
        MessageSender mockSender = mock(MessageSender.class);
        NotificationService service = new NotificationService(mockSender);

        service.notifyUser("user123", "Hello Arun");

        verify(mockSender).send("user123", "Hello Arun");
    }

    @Test
    void testSendIsNotCalledWithNullUserId() {
        MessageSender mockSender = mock(MessageSender.class);
        NotificationService service = new NotificationService(mockSender);

        service.notifyUser(null, "Hello");

        verify(mockSender, never()).send(anyString(), anyString());
    }

    @Test
    void testSendCalledOnlyOnce() {
        MessageSender mockSender = mock(MessageSender.class);
        NotificationService service = new NotificationService(mockSender);

        service.notifyUser("arun123", "Welcome");

        verify(mockSender, times(1)).send("arun123", "Welcome");
    }
}
