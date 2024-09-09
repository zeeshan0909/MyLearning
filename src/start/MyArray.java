package start;

public class MyArray{
	
	public static void main(String[] args) {
		
		Dvd d = new Dvd("The Avengers", 2012 , "Joss Whedon");
		System.err.println(d);
		
		Dvd[] arr = new Dvd[15];
		//Writing Items into an Array
		Dvd incrediblesDVD = new Dvd("The Incredibles", 2004, "Brad Bird");
		Dvd findingDoryDVD = new Dvd("Finding Dory", 2016, "Andrew Stanton");
		Dvd lionKingDVD = new Dvd("The Lion King", 2019, "Jon Favreau");
		
		
		arr[7] = incrediblesDVD;
		
		arr[12] = findingDoryDVD;
		
		arr[3] = lionKingDVD;
		
		//Reading Items from an Array
		System.out.println(arr[7]);
		
		System.out.println(arr[12]);
		
		System.out.println(arr[3]);
		
		//Writing Items into an Array with a Loop
		System.out.println("Reading Items into an Array with a Loop");
		for(int i=0; i<arr.length; i++) {
			System.out.println("this is the idex of array => "+i + " and this is the item stored on this index =>  " + arr[i]);
		}
		
		
		for(Dvd j : arr) {
			System.out.println(j);
		}
		
	}
}

class Dvd {
	
	public String name;
	public int releaseYear;
	public String directedBy;
	
	public Dvd(String name, int releaseYear, String directedBy) {
		this.name = name;
		this.directedBy = directedBy;
		this.releaseYear = releaseYear;
		
	}
	
	public String toString() {
		return name +", releaseYear -> "+  releaseYear +", directedBy -> "+ directedBy;
	}
}