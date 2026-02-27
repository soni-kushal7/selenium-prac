package handlingBrokenLinks;

public class BrokenLinks {

	public static void main(String[] args) {
		
		
/*		
	
*****Broken link is a link which does'nt have resource in the server
     if link does'nt have resource in the server then that will return status code >= 400 
     if link have resource in the server then that will return status code < 400 
	
We need to  below 3 conditions to find a broken link---->
		
1)      The link should have href attribute along with value 
        -----Link    href="https://xyz.com"

2)  If the value is exist then we will capture href attribute value and hit this url
    to the server and capture the status code
     ------https://xyz.com ---> server ---> status code

3)  If the  status code >= 400  then its a broken link
    If status code < 400       its not a broken link		
		
		
		
		
*/		
		
	}

}
