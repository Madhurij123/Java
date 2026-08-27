import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//writeVechicles();
		readVehicles();
	}
    
	public static void writeVechicles()
	{
		List<Vehicle> list = new ArrayList<>();
		   list.add(new Vehicle(101, "abc", "agfs", 10000));
		    list.add(new Vehicle(102, "ahdfc", "afgs", -20000));
		    list.add(new Vehicle(103, "abdfh", "fags", 30000));
		    list.add(new Vehicle(104, "abdc", "fags", 40000));
		    list.add(new Vehicle(105, "abff", "hfdags", 50000));
		
		try(FileOutputStream fout = new FileOutputStream("Vehicle.db")){
			try(DataOutputStream dout = new DataOutputStream(fout)){
				
                      dout.writeInt(list.size());
                      
				for(Vehicle v : list) {
					if(v.getPrice() > 0) {
						dout.writeInt(v.getVechicleId());
						dout.writeUTF(v.getModel());
						dout.writeUTF(v.getType());
						dout.writeDouble(v.getPrice());
					}
					else {
						System.out.println("Invalid Price..!!" +v.getModel());
					}
				}
			}
			System.out.println("Vechicles Added Successfully..!!");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

public static void readVehicles() {
    List<Vehicle> list = new ArrayList<>();

    try (FileInputStream fin = new FileInputStream("Vehicle.db");
         DataInputStream din = new DataInputStream(fin)) {

    	int count = din.readInt();   //take count variable

    	for (int i = 0; i < count; i++) {  //use for loop
    	    Vehicle v = new Vehicle();

    	    v.setVechicleId(din.readInt());
    	    v.setModel(din.readUTF());
    	    v.setType(din.readUTF());
    	    v.setPrice(din.readDouble());

    	    list.add(v);
    	}
    } catch (Exception e) {
    } 

    System.out.println("Vehicles:");
    list.forEach(System.out::println);
}
	
}
