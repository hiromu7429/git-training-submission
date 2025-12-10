package main18;

//SpringBootによるWebAPIサンプル
import org.springframework.web.bind.annotation.*;

@restController
public class MonsterController {
	@GetMapping("/monster")
	public Monster monster(@RequestParam(value = "id") String id) {
		return new Monster(id);
	}
}
