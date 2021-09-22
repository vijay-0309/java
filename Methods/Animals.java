class Animals{
static String[] typeofAnimals={"Wild","Pet"};
static String[] wildAnimals={"Tiger","Lion","Cheetha","Leopard"};
static String[] petAnimals={"Cow","Cat","Dog"};

public static void main(String a[]){
getTypeofAnimals();
getWildAnimals();
getPetAnimals();
}

public static void getTypeofAnimals(){
for(int i=0;i<typeofAnimals.length;i++){
System.out.print(typeofAnimals[i]+"  ");
}
}


public static void getWildAnimals(){
for(int j=0;j<wildAnimals.length;j++){
System.out.print(wildAnimals[j]+"  ");
}
}


public static void getPetAnimals(){
for(int k=0;k<petAnimals.length;k++){
System.out.print(petAnimals[k]+"  ");
}
}
}