
public class Door {
	private String state, name;
	
	//---------------------------------------------------------------------
	// Constructor: Sets the initial values
	//---------------------------------------------------------------------
	public Door() {
		state = "closed";
		name = "Back Door";
	}
	
	public String getName() {
	   return name;
	}
	
	public String getState() {
		return state;
	}
	
	public void setName(String newName) {
	   name = newName;
	}

	public void setState(String newState) {
		state = newState;
	}
	
	public void open() {
		state = "Open";
	}
	
	public void close() {
		state = "closed";
	}
	
	public String toString() {
		String result = "This door's name is " + name + "\nThis door's state is " + state;
		
		return result;
	}

	
}
