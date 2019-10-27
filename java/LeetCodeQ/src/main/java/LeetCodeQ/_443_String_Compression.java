package LeetCodeQ;

public class _443_String_Compression {

	public static void main(String[] args) {
		char[] chars = {};

		int processindex = 0;
		int startindex = 0;
		while (processindex < chars.length) {

			char c = chars[processindex];

			int cnt = 0;
			while (processindex < chars.length && chars[processindex] == c) {
				cnt++;
				processindex++;
			}
			if (cnt == 1) {
				chars[startindex] = c;
				++startindex;
			}
			if (cnt > 1) {
				chars[startindex] = c;

				String str = String.valueOf(cnt);
				for (char ch : str.toCharArray()) {
					chars[++startindex] = ch;
				}

				++startindex;
			}

		}

//		return startindex;
	}

}
