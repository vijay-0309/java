class LicPolicyUtil{
public static void main(String a[]){

LicPolicyDTO policy = new LicPolicyDTO();
policy.setPolicyHolderName("Vijay");
policy.setPolicyId(1943);
policy.setYears(3);

System.out.println(policy.getPolicyHolderName()+ " "+policy.getPolicyId()+ " "+policy.getYears());
}
}