package NGG.com.example.NumGuessGame;

/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class NumberGuessingGameApplication implements CommandLineRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(NumberGuessingGameApplication.class, args);
	}

}
*/


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class NumberGuessingGameApplication implements CommandLineRunner
{
    private final Game game;

    public NumberGuessingGameApplication(Game game)
	{
        this.game = game;
    }

    public static void main(String[] args)
	{
        SpringApplication.run(NumberGuessingGameApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
	{
        game.startGame();
    }
}