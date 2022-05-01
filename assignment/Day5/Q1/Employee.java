class Employee{
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;

	public Employee() {
		super();
	}
	
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		double finalSalary = getSalary()-((getSalary())*pfpercentage)/100; 
		  
		netSalary = finalSalary;
	}
/////getter and setter methods///

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	
	
	public static int getPFPercentage(Employee e) 
	{
		
		return (int)(Math.round((1-(e.netSalary/e.salary))*100));
	}
	public static Employee getEmployeeDetails(int employeedId, String employeeName, double salary)
	{
		 Employee emp = new Employee(employeedId,employeeName,salary);
		 return emp;
	}
}