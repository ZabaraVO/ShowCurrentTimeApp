/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBPack;

import DBPack.Clientinfo;
import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vlad
 */
@Stateless
public class PersistancerBean implements Persistancer{
    @PersistenceContext(unitName="com.mycompany_ShowCurrentTime-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public void addElem(String ip, String userAgent, String currentTime){
        Clientinfo obj=new Clientinfo();
        
        obj.setIp(ip);
        obj.setUseragent(userAgent);
        obj.setCurrenttime(currentTime);
        
        em.persist(obj);
    }
}
