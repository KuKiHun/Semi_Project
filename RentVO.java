package com.javaclass.vo;

public class RentVO {
		
		private Integer rno;
		private String rentDate;
		private String returnAppointed;
		private String returnDate;
		private String returnState;
		private Integer ono;
		
		
		@Override
		public String toString() {
			return "RentVO [rno=" + rno + ", rentDate=" + rentDate + ", returnAppointed=" + returnAppointed
					+ ", returnDate=" + returnDate + ", returnState=" + returnState + ", ono=" + ono + "]";
		}


		public Integer getRno() {
			return rno;
		}


		public void setRno(Integer rno) {
			this.rno = rno;
		}


		public String getRentDate() {
			return rentDate;
		}


		public void setRentDate(String rentDate) {
			this.rentDate = rentDate;
		}


		public String getReturnAppointed() {
			return returnAppointed;
		}


		public void setReturnAppointed(String returnAppointed) {
			this.returnAppointed = returnAppointed;
		}


		public String getReturnDate() {
			return returnDate;
		}


		public void setReturnDate(String returnDate) {
			this.returnDate = returnDate;
		}


		public String getReturnState() {
			return returnState;
		}


		public void setReturnState(String returnState) {
			this.returnState = returnState;
		}


		public Integer getOno() {
			return ono;
		}


		public void setOno(Integer ono) {
			this.ono = ono;
		}
		

}
