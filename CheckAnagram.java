
public class CheckAnagram {
	public static String anagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return"I am not anagram!";
		}
		int arr1[] = new int[26];
		int arr2[] = new int[26];
		for(int i=0;i<str1.length();i++) {
			++arr1[str1.charAt(i)-'a'];
		}
		for(int i=0;i<str2.length();i++) {
			++arr2[str2.charAt(i)-'a'];
		}
		for(int i=0;i<str1.length();i++){
			if(arr1[i]!=arr2[i]) {
				return "I am not anagram!";
			}
		}
		return "I am anagram!";	
	}
	public static void main(String[] args) {
		String str1="rat";
		String str2="tar";
		System.out.println(anagram(str1,str2));
	}

}
