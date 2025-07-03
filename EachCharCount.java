package com;

public class EachCharCount {

	public static void main(String[] args) {
		String s = "aabbbbcccd";
		//int count = 1;
		char words[] = s.toCharArray();
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i] == words[j]) {
					count = count + 1;
					words[j] = '0';
				}
			}
			// if(words[i]!='0' && count>=2)
			if (words[i] != '0')
				System.out.println(words[i] + " == " + count);

		}
	}

}
