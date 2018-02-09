package AnikeeenkoHw3;




import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 
public class Information{
   
   private Student student;

   public Student getStudent() {
       return student;
   }

   @Autowired
   public void setStudent( @Qualifier("student2")    Student student) {
       this.student = student;
   }
   @Override
   public String toString(){
       return "Name: "+this. student.getName()+" , Surname: "+this. student.getSurname();
   }
}
