package example.code.dip;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending notification via email without DIP");
    }

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        Employee employee = new Employee(emailNotification);
        employee.notifyUser();
    }
}
