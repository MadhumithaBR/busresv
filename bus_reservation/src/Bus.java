

	public class Bus {
		private int flight_no;
		private boolean ac;
		private int capacity; // get and set

		Bus(int no, boolean ac, int cap) {
			this.flight_no = no;
			this.ac = ac;
			this.capacity = cap;
		}

		public int getBusNo() { 
			return flight_no;
		}

		public boolean isAc() {
			return ac;
		}

		public int getCapacity() { 
			return capacity;
		}

		public void setAc(boolean val) { 
			ac = val;
		}

		public void setCapacity(int cap) { 
			capacity = cap;
		}

	}

