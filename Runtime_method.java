
public class Runtime_method {

	public static void main(String[] args) throws Throwable {

		System.out.println("START");
		
		//Process can be created using Runtime object.
		//Runtime object holds information of current runtime environment 
		Runtime rt = Runtime.getRuntime();  // Current runtime can be accessed using static getRuntime() method.

		
		//Process process = rt.exec("");
		Process process = rt.exec("Notepad"); 
        int status = process.waitFor();
        System.out.println("Status :"+status);
		System.out.println("END");

	}

}
