package com.revature.pixott.model;

public class Customer {

		private int id;
		private String Name;
		private String MobileNumber;
		private String Password;
		
		public Customer() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getMobileNumber() {
			return MobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			MobileNumber = mobileNumber;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((MobileNumber == null) ? 0 : MobileNumber.hashCode());
			result = prime * result + ((Name == null) ? 0 : Name.hashCode());
			result = prime * result + ((Password == null) ? 0 : Password.hashCode());
			result = prime * result + id;
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
			Customer other = (Customer) obj;
			if (MobileNumber == null) {
				if (other.MobileNumber != null)
					return false;
			} else if (!MobileNumber.equals(other.MobileNumber))
				return false;
			if (Name == null) {
				if (other.Name != null)
					return false;
			} else if (!Name.equals(other.Name))
				return false;
			if (Password == null) {
				if (other.Password != null)
					return false;
			} else if (!Password.equals(other.Password))
				return false;
			if (id != other.id)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", Name=" + Name + ", MobileNumber=" + MobileNumber + ", Password=" + Password
					+ "]";
		}
		
}


