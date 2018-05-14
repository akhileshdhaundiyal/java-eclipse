public class SoftwareList
{
	public SoftwareList() {}

	public static void main(final String[] args)
	{
		sun.Softwares objSun = new sun.Softwares();
		objSun.listSoftware();
		oracle.Softwares objOracle = new oracle.Softwares();
		objOracle.printSoftware();
	}
}