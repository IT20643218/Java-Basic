class Student{
	private String itno;
	private String name;
	private static String BatchId;
	
	public Student(String sitno,String sname){
		itno = sitno;
		name = sname;
	}
	
	public String getSitno()
	{
		return itno;
	}
	public String getName()
	{
		return name;
	}
	
	public static void setBatchid(String sbatchId)
	{
		BatchId = sbatchId;
	}
	public String getBatchid()
	{
		return BatchId;
	}
	
	

}