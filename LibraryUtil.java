class LibraryUtil{

public static void main(String a[]){

LibraryDTO lib = new LibraryDTO();
lib.setName("Sarvajanika-Grantalaya");
lib.setAddress("Channagiri");
lib.setType("Public-Library");
lib.setIsOpen(true);
lib.setNoOfBooks(1043);

System.out.println(lib.getName()+ " "+lib.getAddress()+ " "+lib.getType()+ " "+lib.getIsOpen()+" "+lib.getNoOfBooks());
}
}