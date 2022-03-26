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
public class factory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
        case "factory":
            return new factorynotification();
        case "packaging":
            return new packagingnotification();
        case "process":
            return new processnotification();
        default:
            throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
