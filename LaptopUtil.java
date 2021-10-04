class LaptopUtil{

public static void main(String a[]){

	Laptop specs = new Laptop();
	specs.brand="Hawlet Packard";
	specs.modelname="HP Pavilion";
	specs.ramInGB=8;
	specs.capacityInTB=2;
	specs.series="pavilion";
	specs.color="Black";

	specs.selfUse();
	System.out.println(specs.brand+"\n"+specs.modelname+"\n"+specs.ramInGB+"\n"+specs.capacityInTB+"\n"+specs.series+"\n"+specs.color+"\n");

	Laptop features = new Laptop();
	features.brand="Dell";
	features.modelname="Dell Inspiron";
	features.ramInGB=4;
	features.capacityInTB=1;
	features.series="Inspiron";
	features.color="Silver";

	features.selfUse();
	System.out.println(features.brand+"\n"+features.modelname+"\n"+features.ramInGB+"\n"+features.capacityInTB+"\n"+features.series+"\n"+features.color+"\n");

	Laptop feature = new Laptop();
	feature.brand="Apple";
	feature.modelname="Mac series2";
	feature.ramInGB=8;
	feature.capacityInTB=2;
	feature.series="macbook pro";
	feature.color="black";

	feature.selfUse();
	System.out.println(feature.brand+"\n"+feature.modelname+"\n"+feature.ramInGB+"\n"+feature.capacityInTB+"\n"+feature.series+"\n"+feature.color+"\n");

}

}