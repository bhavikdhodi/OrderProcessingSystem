package com.hsbc.model.beans;

public class Employee {
		
	private int employeeID;
	private String employeeUsername;
	private String employeePassword;
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(int empID, String username, String password) {
			super();
			this.employeeID = empID;
			this.employeeUsername = username;
			this.employeePassword = password;
		}

		public int getEmpID() {
			return employeeID;
		}

		public void setEmpID(int empID) {
			this.employeeID = empID;
		}

		public String getUsername() {
			return employeeUsername;
		}

		public void setUsername(String username) {
			this.employeeUsername = username;
		}

		public String getPassword() {
			return employeePassword;
		}

		public void setPassword(String password) {
			this.employeePassword = password;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + employeeID;
			result = prime * result + ((employeePassword == null) ? 0 : employeePassword.hashCode());
			result = prime * result + ((employeeUsername == null) ? 0 : employeeUsername.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (employeeID != other.employeeID)
				return false;
			if (employeePassword == null) {
				if (other.employeePassword != null)
					return false;
			} else if (!employeePassword.equals(other.employeePassword))
				return false;
			if (employeeUsername == null) {
				if (other.employeeUsername != null)
					return false;
			} else if (!employeeUsername.equals(other.employeeUsername))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Employee [empID=" + employeeID + ", username=" + employeeUsername + ", password=" + employeePassword + "]";
		}
		
		
}
