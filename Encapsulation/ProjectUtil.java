class ProjectUtil{

public static void main(String a[]){

ProjectDTO project = new ProjectDTO();
project.setName("Face-Recognition-Attendance");
project.setNoOfStudents(4);
project.setGuideName("prof.Lohith M S");
project.setDurationInMonths(3);
project.setIsCompleted(true);

System.out.println(project.getName()+ " "+project.getNoOfStudents()+ " "+project.getGuideName()+ " "+project.getDurationInMonths()+" "+project.getIsCompleted());
}
}