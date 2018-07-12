import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
public static void main(String[] args) throws FileNotFoundException{
	int result;
	int last=0;
	boolean jolly=false;
    File file=new File("C:\\Users\\Marawan\\Desktop\\test.txt");
	Scanner sc1 = new Scanner(file);
	Vector<Integer> num = new Vector<Integer>();
	while(sc1.hasNextLine()) {
		String line = sc1.nextLine();
		Scanner sc2 = new Scanner(line);
		while(sc2.hasNext()) {
			num.add(sc2.nextInt());
		}
	
	for(int i=0; i<num.size(); i++) {
		if(i==num.size()-1) {
			break;
		}
		result=Math.abs(num.get(i)-num.get(i+1));
		if(i==0) {
		last = result;
		jolly = true;
		}else {
			if(result==last || result== last-1) {
				last = result;
			}else {
				jolly = false;
				break;
			}
		}
	}
	if(jolly) {
		System.out.println("Jolly");
	}else {
		System.out.println("Not jolly");
	}
	}
}
}
