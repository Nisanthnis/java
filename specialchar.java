 import java.util.*;

class specialchar {
	public static void rev(char s[], int l, int r)
	{
		for (int i = l; i < r / 2; i++) {
			char temp = s[i];
			s[i] = s[r - 1 - i];
			s[r - 1 - i] = temp;
		}
	}
	public static void reverse(char s[])
	{
		char[] temp = new char[s.length];
		int x = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z' || s[i] >= 'A' && s[i] <= 'Z') {
				temp[x] = s[i];
				x++;
			}
		}

		rev(temp, 0, x);

		x = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z'
				|| s[i] >= 'A' && s[i] <= 'Z') {
				s[i] = temp[x];
				x++;
			}
		}

		String revStr = new String(s);
		System.out.println(revStr);
	}

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		reverse(charArray);
	}
}

