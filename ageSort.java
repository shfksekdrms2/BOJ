package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//10814
public class ageSort {
	public static void main(String[] args){
		ArrayList<MyRoom> list = new ArrayList<MyRoom>();
		MyRoom myRoom;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		String inputAge;
		String inputName;
		int sequence=0;
		for(i=0; i<n; i++){
			myRoom = new MyRoom();
			inputAge = sc.next();
			inputName = sc.next();
			myRoom.setAge(Integer.parseInt(inputAge));
			myRoom.setName(inputName);
			myRoom.setSequence(sequence);
			sequence++;
			list.add(myRoom);
		}
//		for(i=0; i<n; i++){
//			System.out.println(list.get(i).getAge() + " " + list.get(i).getName());
//		}
//		System.out.println();
		
		Collections.sort(list, new MyRoom());
		
		for(i=0; i<n; i++){
			System.out.println(list.get(i).getAge() + " " + list.get(i).getName());
//			System.out.println(list.get(i).getAge() + " " + list.get(i).getName() + " " + list.get(i).getSequence());
		}
	}
	
	static class MyRoom implements Comparator<MyRoom>{
		int age;
		String name;
		int sequence;
		MyRoom(){
			age=0;
			name="";
			sequence=0;
		}
		
		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getSequence() {
			return sequence;
		}


		public void setSequence(int sequence) {
			this.sequence = sequence;
		}

		@Override
		public int compare(MyRoom o1, MyRoom o2) {
			// TODO Auto-generated method stub
			if(o1.getAge() > o2.getAge()){
				return 1;
			}else if(o1.getAge() == o2.getAge()){
				if(o1.getSequence() > o2.getSequence()){
					return 1;
				}else{
					return -1;
				}
			}else{
				return -1;
			}
		}
		
	}
}
