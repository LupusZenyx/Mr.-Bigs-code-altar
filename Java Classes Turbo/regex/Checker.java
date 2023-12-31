import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
	
	public static boolean checkNameValidity(String password) {
		String regex="^[A-Z][a-z]{1,29}\s[A-Z]{1}[a-z]{1,29}";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (matcher.find()) {
			return true;
		}
		return false;
	}

	public static boolean checkPasswordValidity(String password) {
		String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#\\$%&*])[A-Za-z\\d!@#\\$%&*]{8,20}$";

		return password.matches(pattern);
	}

	public static boolean checkWebAddressValidity(String webAddress) {
		String pattern = "^(https?:\\/\\/)?(www\\.)?[a-zA-Z0-9]+\\.(com|org|net)$";

		return webAddress.matches(pattern);
	}

	public static class Shipment {
		public static boolean checkProductNameValidity(String productName) {
			String pattern = "^[a-zA-Z]+(\\s[a-zA-Z]+){1,2}$";

			return productName.matches(pattern);
		}

		public static boolean checkProductIdValidity(String productId) {
			String pattern = "^[a-zA-Z0-9]{2,20}$";

			return productId.matches(pattern);
		}

	}
}
