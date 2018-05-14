package oracle;

public class Softwares
{
	public Softwares() {}

	public final void printSoftware()
	{
		String []arrOracle = {"Oracle8i", "Oracle9i", "Oracle10G"};
		for(int i=0; i<3; i++)
			System.out.println(arrOracle[i]);
	}
}