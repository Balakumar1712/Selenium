
public class RemoveWhitespace {

	public static void main(String[] args) {
		String str = "A 1 U T O";
		
		String result = str.replaceAll("\\s+", "");
		
		System.out.println(result);
	}

}

/*Regex

Description
.

Any character
\d

Any digits, [0-9]
\D

Any non-digit, [^0-9]
\s

Whitespace character, [\t\n\x0B\f\r]
\S

Non-whitespace character, [^\s]
\w

Word character, [a-zA-Z_0-9]
\W

Non-word character, [^\w]
\b

Word boundary
\B

Non -Word boundary*/

/*In Java, the regular expression \\s is a predefined character class 
 * that matches a single whitespace character. This includes spaces, tabs, newlines, and other whitespace characters. Here's a quick breakdown:
 

\\s: Matches any single whitespace character, such as a space, tab, newline, etc.
\\s+: Matches one or more consecutive whitespace characters12.
For example, if you have a string "Hello World", using replaceAll("\\s", "_") would replace each whitespace character with an underscore, resulting in "Hello___World". On the other hand, replaceAll("\\s+", "_") 
would replace the entire sequence of whitespace characters with a single underscore, resulting in "Hello_World */