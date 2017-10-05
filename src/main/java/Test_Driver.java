/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */

import java.util.ArrayList;
import org.joda.time.DateTime;
public class Test_Driver {
    
    public static void main(String [ ] args)
    {
     ArrayList<modules> modules; 
     ArrayList<Student> students;
     DateTime start = new DateTime(2017, 9, 4, 12, 0, 0, 0);
     DateTime end = new DateTime(2018, 5, 30, 12, 0, 0, 0);
     CourseProgram computer_science = new CourseProgram("4BCT",start, end );
   
     students =  new ArrayList<Student>();    
     modules = new ArrayList<modules>(); 
    
    Student s1 = new Student("Conor", "Healy", "ballygar", "12-33-2007" ,18, 12313);
    students.add(s1);
    Student s2 = new Student("Alan", "slyman", "ballygar", "12-33-1996" ,19, 13231);
    students.add(s2);
    Student s3 = new Student("Jack", "hannon", "ballygar", "12-33-2012" ,20, 3213);
    students.add(s3);
    Student s4 = new Student("Shane", "flynn", "ballygar", "12-33-2014" ,40, 133123);
    students.add(s4);
    Student s5 = new Student("Dan", "jones", "ballygar", "12-33-2018" ,35, 23132);
    students.add(s5);
    Student s6 = new Student("james", "hannon", "ballygar", "12-33-2012" ,20, 3213);
    students.add(s6);
    Student s7 = new Student("niall", "flynn", "ballygar", "12-33-2014" ,40, 133123);
    students.add(s7);
    Student s8 = new Student("Mark", "keane", "ballygar", "12-33-2018" ,35, 23132);
     students.add(s8);
    Student s9 = new Student("Luke", "flynn", "ballygar", "12-33-2014" ,40, 133123);
     students.add(s9);
    Student s10 = new Student("Eanna", "keane", "ballygar", "12-33-2018" ,35, 23132);
     students.add(s10);
    
    
    modules m1 = new modules("Programming", "CT415");
    modules m2 = new modules("networks", "CT408");
    modules m3 = new modules("Databases", "CT401");
    modules m4 = new modules("Maths", "CT403");
    
    modules.add(m1);
    modules.add(m2);
    modules.add(m3);
    modules.add(m4);
    
    m1.addStudent(s1);
    m1.addStudent(s2);
    m1.addStudent(s3);
    m1.addStudent(s4);
    m1.addStudent(s5);
    
    m2.addStudent(s1);
    m2.addStudent(s6);
    m2.addStudent(s8);
    m2.addStudent(s4);
    m2.addStudent(s10);
    
    m3.addStudent(s9);
    m3.addStudent(s6);
    m3.addStudent(s7);
    m3.addStudent(s9);
    m3.addStudent(s2);
    
    m4.addStudent(s4);
    m4.addStudent(s3);
    m4.addStudent(s8);
    m4.addStudent(s7);
    m4.addStudent(s6);
    
    computer_science.addModules(m4);
    computer_science.addModules(m3);
    computer_science.addModules(m1);
    computer_science.addModules(m2);
    int a=0;
    
  
    for(int i=1; students.size() >= i ;i++){
        String Modules = "Registered Modules: ";
        
        
        String studentDetails = students.get(a).getFirst() +" "+students.get(a).getLast();
        System.out.println(i+": " + studentDetails);
        
        for(int b=0; computer_science.getModules().size() > b ;b++){
        
        ArrayList<Student> list = computer_science.getModules().get(b).getstudents();
             for(int c=0; list.size() > c ;c++){
                  if(list.get(c).getFirst().equals(students.get(a).getFirst())){
                         Modules  = Modules +" ,"+ computer_science.getModules().get(b).getModuleName();
                  }
              }
        }       
    a++;
    System.out.println(Modules);
    System.out.println(" Course:  "+ computer_science.getCourseName());
    }
    }
}