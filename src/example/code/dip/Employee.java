package example.code.dip;

public class Employee {
    private final EmailNotification emailNotification;

    public Employee(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

    public void notifyUser() {
        emailNotification.notifyUser();
    }
}