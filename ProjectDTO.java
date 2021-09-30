public class ProjectDTO{
 
public ProjectDTO(){
System.out.println("ProjectDTO object is created");
}
 
private String name;
private int noOfStudents;
private String guideName;
private int durationInMonths;
private boolean isCompleted;

public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}

public int getNoOfStudents(){
return noOfStudents;
}
public void setNoOfStudents(int noOfStudents){
this.noOfStudents = noOfStudents;
}
 

public String getGuideName(){
return guideName;
}
public void setGuideName(String guideName){
this.guideName = guideName;
}


public int getDurationInMonths(){
return durationInMonths;
}
public void setDurationInMonths(int durationInMonths){
this.durationInMonths=durationInMonths;
}

public boolean getIsCompleted(){
return isCompleted;
}
public void setIsCompleted(boolean isCompleted){
this.isCompleted = isCompleted;
}
 
}