public class Square{
	private int len;
	private int wid;
	
	public Square(int lne,int wid){
		this.len = len;
		this.wid = wid;
	}
	public boolean CompareTwo(Square obj)
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