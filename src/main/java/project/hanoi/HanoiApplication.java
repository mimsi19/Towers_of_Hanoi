package project.hanoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

@RestController
public class HanoiApplication {

	int n=6;
	List<String> shift = new ArrayList<String>();

	String hanoiTowers(int n, char startPole, char endPole, char intermediatePole) {

		if (n == 1){
			shift.add("Move disk 1 from pole " + startPole + " to pole " + endPole);
			return null;
		}

		hanoiTowers(n-1, startPole, intermediatePole, endPole);
		shift.add("Move disk " + n + " from pole " + startPole + " to pole " + endPole);
		hanoiTowers(n-1,intermediatePole, endPole, startPole);
		return null;

	}

	@RequestMapping("/")
	public List<String> game(){
		String res = hanoiTowers(n,'A','C','B');
		return shift;
	}

	public static void main(String[] args) {
		SpringApplication.run(HanoiApplication.class, args);
	}

}
