class PatientExecutor{
	public static void main(String patientDetails[]){
		Patient patient=new Patient();
		patient.setPatientId(143);
		patient.setName("Pavan K");
		patient.setNurseName("Sunny Leone");
		patient.setage(21);
		patient.setDiseaseName("Love Disease");
		patient.setWardNo(420);
		patient.setAdmittedDate("08/04/2023");
		patient.setHospitalName("Nanjappa Life care");
		patient.setPatientAddress("Rajajinagar");
		patient.setGender("Male");
		patient.setConsultantDoctor("Usha");
		
		
		System.out.println("Patient Id : "+patient.getPatientId());
		System.out.println("Patient Name : "+patient.getName());
		System.out.println("Nurse Name : "+patient.getNurseName());
		System.out.println("Patient age : "+patient.getAge());
		System.out.println("Patient disease  : "+patient.getDiseaseName());
		System.out.println("Patient Ward No : "+patient.getWardNo());
		System.out.println("Patient Admitted Date : "+patient.getAdmittedDate());
		System.out.println("Patient Hospital Name : "+patient.getHospitalName());
		System.out.println("Patient Address : "+patient.getPatientAddress());
		System.out.println("Patient Gender : "+patient.getGender());
		System.out.println("Consultant Doctor : "+patient.getConsultantDoctor());
	}
}