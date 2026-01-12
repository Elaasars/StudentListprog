/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vp.studentlist;

/**
 *
 * @author steph
 */
public class StudentList {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
    Student[] list = new Student[3]; //array of objects
    Student s1 = new Student(); 
    s1.setName("peter");
    s1.setSid(1);
    
    Student s2 = new Student(); 
    s1.setName("john");
    s1.setSid(2);
    
    Student s3 = new Student(); 
    s1.setName("khan");
    s1.setSid(3);
    
   list[0] = s1;
   list[1] = s2;
   list[2] = s3; //stores objects in array
   for(int i=0; i<list.length; i++) {
       System.out.println(list[i].getName() + "" + list[i].getSid());
   }
    //store s1 object in an array
    
    }// todo code application logic
    //define and print 3 student informaton name, studentid using array
}
