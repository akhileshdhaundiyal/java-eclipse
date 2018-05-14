package jdbc;
import java.util.Base64.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class DateDemo {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encoder enc=Base64.getEncoder();
			String normalString="username:password";
			String encodeString=enc.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
			System.out.println(encodeString);
			System.out.println("**************");
			Base64.Decoder dec=Base64.getDecoder();
			byte[] decodedByteArray=dec.decode(encodeString);
			System.out.println(new String(decodedByteArray));		
	}
}