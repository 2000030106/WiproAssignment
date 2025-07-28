package assignments;

class Student
{
	private static int nextrollno=1;
	
	private int rollno;
	private String name;
	private int engmark;
	private int mathmark;
	private int scimark;
	public static int getNextrollno() {
		return nextrollno;
	}
	public static void setNextrollno(int nextrollno) {
		Student.nextrollno = nextrollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEngmark() {
		return engmark;
	}
	public void setEngmark(int engmark) {
		this.engmark = engmark;
	}
	public int getMathmark() {
		return mathmark;
	}
	public void setMathmark(int mathmark) {
		this.mathmark = mathmark;
	}
	public int getScimark() {
		return scimark;
	}
	public void setScimark(int scimark) {
		this.scimark = scimark;
	}
	public Student( String name, int engmark, int mathmark, int scimark) {
		super();
		this.rollno = nextrollno;
		nextrollno++;
		this.name = name;
		this.engmark = engmark;
		this.mathmark = mathmark;
		this.scimark = scimark;
	}
	public int getTotalMarks()
	{
		return getEngmark()+getMathmark()+getScimark();
	}
	public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
	
	
	
}


class Standard
{
	Student s[] = new Student[8];
	int count=0;
	public void addstudent(Student st)
	{
		if(count<8)
		{
			s[count]=st;
			count++;
		}
	}
	
	//ascending order for roll no
	public void displayRollNo()
	{
		
		for (int i = 0; i < s.length; i++) 
		{
			
			for (int j = 0; j < s.length; j++) 
			{
				if(s[i].getRollno()<s[j].getRollno())
				{
					Student temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}		
			}	
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println("RollNo: "+s[i].getRollno()+",Name: "+s[i].getName());
			
		}
	}
	
	// highest percentage
	
	public void highestPercentage()
	{
		double maxpercent=0;
		int index=-1;
		
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].getPercentage()>maxpercent)
			{
				maxpercent=s[i].getPercentage();
				index=i;
			}
			
		}
		
		System.out.println("Highest Percentage: "+maxpercent);
		
		
	}
	//highest maths marks
		public void displayhighmathmarks()
		{
			int maxmarks=0;
			int index=-1;
			for (int i = 0; i < s.length; i++) 
			{
				if(s[i].getMathmark()>maxmarks)
				{
					maxmarks=s[i].getMathmark();
					index=i;
				}
				
			}
			System.out.println("Highest Marks in Maths: "+"Name: "+s[index].getName()+", Rollno: "+s[index].getRollno()+", Marks:"+maxmarks);
		}
	
		//ascending of maths+sci marks
		public void totalMathAndSciAsc()
		{
			for (int i = 0; i < count; i++) 
			{
				for (int j = i+1; j <count; j++) 
				{
					int total=s[i].getMathmark()+s[i].getScimark();
					int total1=s[j].getMathmark()+s[j].getScimark();
					if(total>total1)
					{
						Student temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
				
			}
			for (int i = 0; i <count; i++) {
	            int total11 = s[i].getMathmark() + s[i].getScimark();
				System.out.println("Name: "+s[i].getName()+", ROll no:"+s[i].getRollno()+", Total:"+total11);
			}
			
		}
		
		
		//descending order of ranks
		public void displayRanks() {
	        for (int i = 0; i < count; i++) {
	            for (int j = i + 1; j < count; j++) {
	                if (s[i].getTotalMarks() < s[j].getTotalMarks()) {
	                    Student temp = s[i];
	                    s[i] = s[j];
	                    s[j] = temp;
	                }
	            }
	        }

	        System.out.println("Rank\tRoll No\tName\tTotal\tPercentage");
	        for (int i = 0; i < count; i++) {
	            System.out.println((i + 1) + "\t" + s[i].getRollno() + "\t" + s[i].getName()
	                    + "\t" + s[i].getTotalMarks() + "\t" + String.format("%.2f", s[i].getPercentage()) + "%");
	        }
	    }
		
}




public class Question12 {

	public static void main(String[] args) {

		Standard std = new Standard();
		std.addstudent(new Student("Satya", 86, 89, 96));
		std.addstudent(new Student("Sai", 63, 79, 76));
		std.addstudent(new Student("Venky", 82, 75, 84));
		std.addstudent(new Student("Sam", 75,85,96));
		std.addstudent(new Student("Srujan",84,58,68 ));
		std.addstudent(new Student("Akhil",91,85,67 ));
		std.addstudent(new Student("Kiran",86,85,94 ));
		std.addstudent(new Student("Uday",84,96,85 ));
		
		std.displayRollNo();
		std.highestPercentage();
		std.displayhighmathmarks();
		System.out.println("***************");
		std.totalMathAndSciAsc();
		std.displayRanks();
	}
	

}

/*output:
 * 
 * RollNo: 1,Name: Satya
RollNo: 2,Name: Sai
RollNo: 3,Name: Venky
RollNo: 4,Name: Sam
RollNo: 5,Name: Srujan
RollNo: 6,Name: Akhil
RollNo: 7,Name: Kiran
RollNo: 8,Name: Uday
Highest Percentage: 90.33333333333333
Highest Marks in Maths: Name: Uday, Rollno: 8, Marks:96
***************
Name: Srujan, ROll no:5, Total:126
Name: Akhil, ROll no:6, Total:152
Name: Sai, ROll no:2, Total:155
Name: Venky, ROll no:3, Total:159
Name: Kiran, ROll no:7, Total:179
Name: Sam, ROll no:4, Total:181
Name: Uday, ROll no:8, Total:181
Name: Satya, ROll no:1, Total:185
Rank	Roll No	Name	Total	Percentage
1	1	Satya	271	90.33%
2	8	Uday	265	88.33%
3	7	Kiran	265	88.33%
4	4	Sam	256	85.33%
5	6	Akhil	243	81.00%
6	3	Venky	241	80.33%
7	2	Sai	218	72.67%
8	5	Srujan	210	70.00%

 */
 
