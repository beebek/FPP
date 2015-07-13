package week3.Day6;

public class HashSet {

	int size;
	String[] table;
	final int DEFAULT_SIZE = 64;

	public HashSet() {
		this.size = 0;
		table = new String[DEFAULT_SIZE];
		for (int i = 0; i < table.length; i++) {
			table[i] = null;
		}
	}

	public boolean add(String key) {

		if (size == table.length) {
			rehash();
		}
		int hashcode = hashmap(key);
		System.out.println(hashcode);
		while (table[hashcode] != null) {
			if (table[hashcode].equalsIgnoreCase(key)) {
				System.out.println("Dublicate  key == >" + key);
				return false;
			}
			hashcode = (hashcode + 1) % table.length;
		}
		table[hashcode] = key;
		size++;
		return true;
	}

	public int hashmap(String x) {
		int hashcode = 0;
		String temp = x.toLowerCase();
		for (int i = 0; i < x.length(); i++) {
			hashcode = ((31 * hashcode) % table.length + temp.charAt(i))
					% table.length;
		}
		return hashcode;
	}

	private void rehash() {
		int len = table.length;
		String[] tempStr = new String[len * 2];
		System.arraycopy(table, 0, tempStr, 0, len);
		table = tempStr;
	}

	public String remove(String key) {
		int hascode = hashmap(key);
		String str = "";
		while (table[hascode] != null) {
			if (table[hascode].equalsIgnoreCase(key)) {
				str = "" + table[hascode];
				table[hascode] = null;
				size--;
				return str + " is removed";
			}
		}
		return key + " not found to delete";
	}

	public boolean find(String key) {
		int hascode = hashmap(key);
		while (table[hascode] != null) {
			if (table[hascode].equalsIgnoreCase(key)) {
				return true;
			}
		}
		System.out.println(key + " is not found ");
		return false;
	}

	public int size() {
		return size;
	}

	public void show() {
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null)
				System.out.println("Value -> " + i + " " + table[i]);
		}
	}

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("FPP");
		hashSet.add("MPP");
		System.out.println("Boolean add: " + hashSet.add("SCI"));
		System.out.println("HashSet: ");
		hashSet.show();
		
		System.out.println();
		System.out.println("Removing string...");
		hashSet.remove("FPP");
		System.out.println("HashSet:");
		hashSet.show();
		
		System.out.println();
		System.out.println("Boolean find:" + hashSet.find("MPP"));
		System.out.println("Size: " + hashSet.size());
		
		System.out.println();
		hashSet.show();
	}
}

// Output

/*
	38
	45
	25
	Boolean add: true
	HashSet: 
	Value -> 25 SCI
	Value -> 38 FPP
	Value -> 45 MPP
	
	Removing string...
	HashSet:
	Value -> 25 SCI
	Value -> 45 MPP
	
	Boolean find:true
	Size: 2
	
	Value -> 25 SCI
	Value -> 45 MPP
*/

