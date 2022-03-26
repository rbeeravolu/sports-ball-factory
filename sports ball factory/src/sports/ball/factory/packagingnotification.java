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
public class packagingnotification implements Notification {
    @Override
    public void notifyUser() {
    System.out.println("Sending a notification to user for progress of manufacturing");   
    }
}
