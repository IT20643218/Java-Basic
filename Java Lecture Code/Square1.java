public class Square1{
	private int len;
	private int wid;
	
	public Square1(int lne,int wid)
	{
		this.len = len;
		this.wid = wid;
	}
	
	public Square1(Square1 copy)
	{
		this.len = copy.len;
		this.wid = copy.wid;
	}
	
	public boolean CompareTwo(Square1 obj)
	{
		if ((this.len == obj.len) && (this.wid == obj.wid))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}