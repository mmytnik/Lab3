import java.io.IOException;
import java.net.URL;
import java.util.Scanner;



public class Lab3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String webString;
        webString = urlToString("http://erdani.com/tdpl/hamlet.txt");

        System.out.println(webString);

        int wordCount = 1;
        for (int i = 0; i <= webString.length() - 1; i++)
        {
            if (webString.charAt(i) == ' ' && webString.charAt(i+1)!=' ')
            {
                wordCount++;
            }
        }

        System.out.println("Word count is: " + wordCount);

        String stringToFind;
        System.out.println("Enter what word you would like to find.");

        stringToFind = input.next();

        //System.out.println(stringToFind);



    }



/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
    }

}