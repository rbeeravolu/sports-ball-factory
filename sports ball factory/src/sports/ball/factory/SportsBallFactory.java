/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sports.ball.factory;

/**
 *
 * @author 
 */
public class SportsBallFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factory notificationFactory = new factory();
        Notification notification = notificationFactory.createNotification("factory");
        notification.notifyUser();
        Notification notification1 = notificationFactory.createNotification("packaging");
        notification1.notifyUser();
        Notification notification2 = notificationFactory.createNotification("process");
        notification2.notifyUser();
    }
    
}
