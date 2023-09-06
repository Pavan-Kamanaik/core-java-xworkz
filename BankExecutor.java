class BankExecutor{
	public static void main(String banking[]){
		Bank bank=new Bank();
		bank.setBankId(501);
		bank.setBankName("SBI Bank");
		bank.setBranchName("3rd block Rajajinagar");
		bank.setIfscCode("SBI36002514");
		bank.setManagerName("Pavan K");
		bank.setNoOfWorkers(65);
		bank.setIsBankOpen(true);
		
		
		System.out.println("Bank Id : "+ bank.getBankId());
		System.out.println("Bank Name : "+ bank.getBankName());
		System.out.println("Branch Name : "+ bank.getBranchName());
		System.out.println("Bank IFSC code : "+ bank.getIfscCode());
		System.out.println("Bank Manager Name : "+ bank.getManagerName());
		System.out.println("Number of Workers : "+ bank.getNoOfWorkers());
		System.out.println("Is Bank Open : "+ bank.getIsBankOpen());
	}
}