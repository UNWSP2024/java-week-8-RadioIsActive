package src.JavaWeek8Programs;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {
    public static void main(String[] args) {
    	Queue<String> line1 = new LinkedList<>();
		Queue<String> line2 = new LinkedList<>();
    	char let = 'A';
    	int time = 0;
    	int rn;
    	String person = "" + let + let + let;
    	line1.add(person);
    	
    	while (time < 40)
    	{	
    		rn = (int)(Math.random() * 6);
    		if ((rn == 1) || (rn == 2)) {
				let++; person = "" + let + let + let; 
				if (Math.random() < 0.5) {
                    line1.add(person);
                } else {
                    line2.add(person);
                }
			}
    		if ((rn == 3) || (rn == 4) || (rn == 5)) {
				if (!line1.isEmpty() && Math.random() < 0.5) {
                    line1.poll();
                } else if (!line2.isEmpty()) {
                    line2.poll();
                }
			}
    		System.out.println("Time " + time + " : Line 1 - " + line1 + " | Line 2 - " + line2);
            time++;
    	}

    }
}

