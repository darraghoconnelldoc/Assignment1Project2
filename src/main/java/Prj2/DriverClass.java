package Prj2;
import assignment1project1.Student;
import assignment1project1.Module;
import assignment1project1.CourseProgramme;
import org.joda.time.LocalDate;

/**
  * @author darra
 */
public class DriverClass {
    
    public static void main(String[] args){
        DriverClass test= new DriverClass();
        test.registration1();
    }
    
    public void registration1(){
        Student student1 = new Student("John Johnson","19","20/02/2000","CT417, CT115","Electronic Engineering");
        Student student2 = new Student("Tom Thompson","18","09/09/1999","EE445","Electronic Engineering");
        Student student3 = new Student("Steve Stevenson","20","08/08/1998","EE445","Electronic Engineering");
    
        Module module1 = new Module("Software Engineering III","CT417", "Electronic Engineering");
        Module module2 = new Module("Digital Signal Processing","EE445","Electronic Engineering");
       
        module1.addStudent(student1);
        module2.addStudent(student2);
        module2.addStudent(student3);
        
        LocalDate startdate = new LocalDate(2020, 8, 1);
        LocalDate enddate = new LocalDate(2021, 4, 1);
    
       CourseProgramme course1 = new CourseProgramme("Electronic Engineering",startdate,enddate);
        course1.addModule(module1);
        course1.addModule(module2);
        course1.addStudents(module1);
        course1.addStudents(module2);
        
        System.out.println("Course Modules\n"+course1.getModules());
        System.out.println("Course Students\n"+course1.getStudents());
        System.out.println("Students Modules and Courses: \n"+ student1.getUserName()+ "\n"+ student1.getModules() + "\n"+ student1.getCourses()+"\n\n" + "Students Modules and Courses: \n"+ student2.getUserName()+ "\n"+ student2.getModules()+"\n"+ student2.getCourses()+"\n"+"Students Modules and Courses: \n\n"+student3.getUserName()+ "\n"+ student3.getModules()+"\n"+ student3.getCourses()+"\n\n");
     
    }
}
