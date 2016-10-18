
	function show_data(){
		list = new Array(this.employee_name,this.employee_salary,this.employee_number,this.hobbies);
		return list.join();
	}
	function show_sal(){
		return this.employee_salary;
	}
	function Employee(name,salary,emp_no,my_hobbies){
		this.employee_name = name;
		this.employee_salary = salary;
		this.employee_number = emp_no;
		this.data=show_data;
		this.sal=show_sal;
		this.hobbies = my_hobbies;
	}