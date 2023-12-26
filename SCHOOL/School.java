public class School{ 
    
	String schoolName;
	int numberOfClassroom;
	String[] departments;
	SchoolType type;
	int numOfTeachers;
	Subjects subjectType;
	int noOflaygrounds;
	int numOfLibrary;
	 
	School(String schoolName,int numberOfClassroom, String[] departments,SchoolType type,int numOfTeachers,Subjects subjectType,int Playgrounds,int numOfLibrary)
	
	{
		this.schoolName=schoolName;
		this.numberOfClassroom=numberOfClassroom;
		this.departments=departments;
		this.type=type;
		this.numOfTeachers=numOfTeachers;
		this.subjectType=subjectType;
		this.noOflaygrounds=noOflaygrounds;
		this.numOfLibrary=numOfLibrary;
		
	}
	        public void display()
        {
            System.out.println("scool Name="+schoolName);
            System.out.println("no of classrooms="+numberOfClassroom);
            System.out.println("Scool type="+type);
            System.out.println("num of teachers ="+numOfTeachers);
            System.out.println("subject Type="+subjectType);
            System.out.println("num of playgrounds="+noOflaygrounds);
            System.out.println("num of library="+numOfLibrary);     
			
			for(int i=0; i<departments.length;i++)
			{
				
				System.out.println("departments:"+departments[i]);
			}
        }
		
		public static void main(String args[]){
		 String[] departments=("math","art","science");
		 School.obj=new School("vidya barati",20,departments,SchoolType.GOVT,40,Subjects.KANNADA,2,4);
		 obj.display();
		 
		 System.out.println(obj.type.value);
		 System.out.println(obj.subjectType.value);

		 
		}
		








}