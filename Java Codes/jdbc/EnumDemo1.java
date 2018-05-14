package jdbc;


public class EnumDemo1 {

	public enum EnumCompany {
		EBAY("E"), PAYPAL("Y"), GOOGLE("E"), YAHOO("Y");

		private String companyLetter;

		private EnumCompany(String s) {
			companyLetter = s;
		}

		private String getCompanyLetter() {
			return companyLetter;
		}
	}

	public static void main(String[] args) {
		System.out.println("get enum value for company 'ebay': " + EnumCompany.EBAY.getCompanyLetter());

	}
}
