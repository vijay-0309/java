public class LicPolicyDTO{

public LicPolicyDTO(){
System.out.println("LicPolicyDTO object is created");
}

private String policyHolderName;
private int policyId;
private int years;

public String getPolicyHolderName(){
return policyHolderName;
}
public void setPolicyHolderName(String policyHolderName){
this.policyHolderName = policyHolderName;
}
public int getPolicyId(){
return policyId;
}
public void setPolicyId(int policyId){
this.policyId = policyId;
}
public int getYears(){
return years;
}
public void setYears(int years){
this.years = years;
}
}