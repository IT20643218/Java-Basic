public class dimentional{
	public static void main(String[]args)
	{
	//one dimentional array
	int myarray[];//this is array veriable
	myarray = new int[10];//size of the array to allocate memory
	
	int myarray2[] = new int[3];
	
	//Assign value the array
	myarray2[0] = 10;
	myarray2[1] = 20;
	myarray2[2] = 70;
	
	//Print the array
	for(int i =0;i<3;i++){
		System.out.println(myarray2[i]);
	}
	
	}

}