package AnikeeenkoHw3;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

public class Student {
	@NotNull 
	@Size(min=2,max=30) 
    private String name;
	@NotNull
	@Size(min=2,max=30) 
    private String surname;
     
    public String getName() {
        return name;
    }
    public void setName(@NotNull String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(@NotNull  String surname) {
        this.surname = surname;
    }
}