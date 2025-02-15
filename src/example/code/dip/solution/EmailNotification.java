package example.code.dip.solution;

import example.code.dip.Notification;

public class EmailNotification implements Notification {
    public void notifyUser(){
        //implement notification via email
        System.out.println("Send notification via email");
    }

    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        Employee employee = new Employee(notification);
        employee.notifyUser();
    }
 }