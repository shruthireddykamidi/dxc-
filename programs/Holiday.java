package jp;


	public class Holiday {
		private String name;
		private int day; 
		private String month;

	public String setname()
	{       this.name="Republic day";
			return name;
	}
		public int setday()
		{       this.day=26;
				return day;
		}
		public String setmonth()
		{       this.month = "January";
				return month;
		}
	 public static void main(String args[])
	 {
		 Holiday h = new Holiday();
		 System.out.println(h.setday()+"-"+h.setmonth()+"="+h.setname());
	 }
			
		
	}


