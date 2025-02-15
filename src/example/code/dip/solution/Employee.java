package example.code.dip.solution;

import example.code.dip.Notification;

public class Employee {
    private final Notification notification;

    public Employee(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser() {
        notification.notifyUser();
    }
}