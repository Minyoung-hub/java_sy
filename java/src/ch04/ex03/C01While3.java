package ch04.ex03;

import java.util.ArrayList;
import java.util.Arrays;

public class C01While3 {
	public static void main(String[] args) {
		String answer = "";
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String completion[] = {"stanko", "ana", "mislav"};
        ArrayList<String> completion2 = new ArrayList<>(Arrays.asList(completion));
        for(String player : participant){
            if(!completion2.contains(player.toString())){
                answer = player;
                break;
            }
        }

        if(answer == ""){
            int count[] = new int[completion.length];
            
            for(int i=0; i<participant.length; i++){
                for(int j=0; j<completion.length; j++){
                    if(participant[i] == completion[j]){
                        count[j] += 1;
                    }
                }
            }
            System.out.printf("%d %d %d \n",count[0], count[1], count[2]);
            int max = count[0];
            int maxIndex = 0;
            
            for (int i = 0; i < count.length; i++) {
                if (count[i] > max) {
                    max = count[i];
                    maxIndex = i;
                }
            }
            System.out.println(maxIndex);
            answer = completion[maxIndex];
        }
        System.out.println(answer);
	}
}
