/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vp.studentlist;

/** Student entity
 *
 * @author steph
 */
public class Student {
    private String name; //variables always must be private
    private int sid; // this is encapsulation principle
    // encapsulation means make variables private and have public getter and setters
    //other objects can access through getters and setters

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
        // test fetch and pull
    }
           
}
