// The "KM_HangmanCategory" class.
import java.awt.*;
import hsa.Console;
import java.io.*;

public class KM_HangmanCategory
{
    static Console c;           // The output console

    public static void Movies ()
    {
	//Clears Screen
	c.clear ();

	//Title Fonts
	Font title = new Font ("Castellar", Font.BOLD, 100);
	Font word = new Font ("Impact", Font.PLAIN, 75);
	Font verdict = new Font ("Arial Black", Font.BOLD, 100);

	//Font and Screen Colors
	Color titleCol = (Color.blue);
	Color wordCol = (Color.black);
	Color background = new Color (240, 186, 0);
	Color brown = new Color (85, 43, 0);
	Color winner = (Color.green);
	Color loss = (Color.red);
	Color congratz = (Color.white);
	Color tooBad = (Color.white);


	//Background
	c.setColor (background);
	c.fillRect (0, 0, 100000, 1000);
	c.setColor (Color.black);
	c.drawRect (0, 598, 956, 100);

	//Title
	c.setFont (title);
	c.setColor (titleCol);
	c.drawString ("Movies", 250, 130);

	//Hangman Post
	c.setColor (brown);
	c.fillRect (346, 270, 50, 300);
	c.setColor (brown);
	c.fillRect (346, 220, 240, 50);
	c.setColor (brown);
	c.fillRect (520, 270, 20, 40);

	//Array Declarations and other Variables
	String[] words = {"skyfall", "inception", "godzilla"};
	int lose = 0, win = 0;
	int random = (int) (Math.random () * 3);
	String chosen = words [random];
	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);


	//Gameplay Code
	do
	{
	    letter = c.getChar (); //Prompts for letter


	    for (int i = 0 ; i < chosen.length () ; i++) //looks through the array for correct letter
	    {

		if (chosen.charAt (i) == letter) //If correct letter is found
		{
		    c.setFont (word);
		    c.setColor (wordCol);
		    String ch = Character.toString (letter); //Converts the character into a string
		    c.print (ch);
		    win++; //accumulates the number of correct values inputted
		}
		else
		{
		    lose++;
		}
	    }



	}
	while (lose <= 5 || win < chosen.length ());

	//Clears Screen
	c.clear ();

	//Loss Screen
	if (lose == 5)
	{
	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 250, 330);


	}
	else //Win Screen
	{
	    c.setColor (winner);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (congratz);
	    c.setFont (verdict);
	    c.drawString ("You Win!", 250, 330);
	}

	return;





    }


    public static void Tech ()
    {
	//Clears Screen
	c.clear ();

	//Title Fonts
	Font title = new Font ("Castellar", Font.BOLD, 100);
	Font word = new Font ("Impact", Font.PLAIN, 75);
	Font verdict = new Font ("Arial Black", Font.BOLD, 100);

	//Font and Screen Colors
	Color titleCol = (Color.red);
	Color wordCol = (Color.black);
	Color background = new Color (89, 172, 172);
	Color brown = new Color (85, 43, 0);
	Color winner = (Color.green);
	Color loss = (Color.red);
	Color congratz = (Color.white);
	Color tooBad = (Color.white);


	//Background
	c.setColor (background);
	c.fillRect (0, 0, 100000, 1000);
	c.setColor (Color.black);
	c.drawRect (0, 598, 956, 100);

	//Title
	c.setFont (title);
	c.setColor (titleCol);
	c.drawString ("Tech", 310, 130);

	//Hangman Post
	c.setColor (brown);
	c.fillRect (346, 270, 50, 300);
	c.setColor (brown);
	c.fillRect (346, 220, 240, 50);
	c.setColor (brown);
	c.fillRect (520, 270, 20, 40);

	//Array Declarations and other Variables
	String[] words = {"intel", "microsoft", "nvidia"};
	int lose = 0, win = 0;
	int random = (int) (Math.random () * 3);
	String chosen = words [random];
	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);


	//Gameplay Code
	do
	{
	    letter = c.getChar (); //Prompts for letter


	    for (int i = 0 ; i < chosen.length () ; i++) //looks through the array for correct letter
	    {

		if (chosen.charAt (i) == letter) //If correct letter is found
		{
		    c.setFont (word);
		    c.setColor (wordCol);
		    String ch = Character.toString (letter); //Converts the character into a string
		    c.print (ch);
		    win++; //accumulates the number of correct values inputted
		}
		else
		{
		    lose++;
		}
	    }



	}
	while (lose <= 5 || win < chosen.length ());

	//Clears Screen
	c.clear ();

	//Loss Screen
	if (lose == 5)
	{
	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 250, 330);


	}
	else //Win Screen
	{
	    c.setColor (winner);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (congratz);
	    c.setFont (verdict);
	    c.drawString ("You Win!", 250, 330);
	}

	return;
    }


    public static void Sports ()
    {
	//Clears Screen
	c.clear ();

	//Title Fonts
	Font title = new Font ("Castellar", Font.BOLD, 100);
	Font word = new Font ("Impact", Font.PLAIN, 75);
	Font verdict = new Font ("Arial Black", Font.BOLD, 100);

	//Font and Screen Colors
	Color titleCol = (Color.yellow);
	Color wordCol = (Color.black);
	Color background = new Color (140, 140, 255);
	Color brown = new Color (85, 43, 0);
	Color winner = (Color.green);
	Color loss = (Color.red);
	Color congratz = (Color.white);
	Color tooBad = (Color.white);


	//Background
	c.setColor (background);
	c.fillRect (0, 0, 100000, 1000);
	c.setColor (Color.black);
	c.drawRect (0, 598, 956, 100);

	//Title
	c.setFont (title);
	c.setColor (titleCol);
	c.drawString ("Sports", 250, 130);

	//Hangman Post
	c.setColor (brown);
	c.fillRect (346, 270, 50, 300);
	c.setColor (brown);
	c.fillRect (346, 220, 240, 50);
	c.setColor (brown);
	c.fillRect (520, 270, 20, 40);

	//Array Declarations and other Variables
	String[] words = {"soccer", "basketball", "hockey"};
	int lose = 0, win = 0;
	int random = (int) (Math.random () * 3);
	String chosen = words [random];
	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);


	//Gameplay Code
	do
	{
	    letter = c.getChar (); //Prompts for letter


	    for (int i = 0 ; i < chosen.length () ; i++) //looks through the array for correct letter
	    {

		if (chosen.charAt (i) == letter) //If correct letter is found
		{
		    c.setFont (word);
		    c.setColor (wordCol);
		    String ch = Character.toString (letter); //Converts the character into a string
		    c.print (ch);
		    win++; //accumulates the number of correct values inputted
		}
		else
		{
		    lose++;
		}
	    }



	}
	while (lose <= 5 || win < chosen.length ());

	//Clears Screen
	c.clear ();

	//Loss Screen
	if (lose == 5)
	{
	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 250, 330);


	}
	else //Win Screen
	{
	    c.setColor (winner);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (congratz);
	    c.setFont (verdict);
	    c.drawString ("You Win!", 250, 330);
	}

	return;
    }


    public static void Games ()
    {
	//Clears Screen
	c.clear ();

	//Title Fonts
	Font title = new Font ("Castellar", Font.BOLD, 100);
	Font word = new Font ("Impact", Font.PLAIN, 75);
	Font verdict = new Font ("Arial Black", Font.BOLD, 100);

	//Font and Screen Colors
	Color titleCol = (Color.yellow);
	Color wordCol = (Color.black);
	Color background = new Color (255, 72, 72);
	Color brown = new Color (85, 43, 0);
	Color winner = (Color.green);
	Color loss = (Color.red);
	Color congratz = (Color.white);
	Color tooBad = (Color.white);


	//Background
	c.setColor (background);
	c.fillRect (0, 0, 100000, 1000);
	c.setColor (Color.black);
	c.drawRect (0, 598, 956, 100);

	//Title
	c.setFont (title);
	c.setColor (titleCol);
	c.drawString ("Video Games", 75, 130);

	//Hangman Post
	c.setColor (brown);
	c.fillRect (346, 270, 50, 300);
	c.setColor (brown);
	c.fillRect (346, 220, 240, 50);
	c.setColor (brown);
	c.fillRect (520, 270, 20, 40);

	//Array Declarations and other Variables
	String[] words = {"pokemon", "civilization", "tetris"};
	int lose = 0, win = 0;
	int random = (int) (Math.random () * 3);
	String chosen = words [random];
	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);


	//Gameplay Code
	do
	{
	    letter = c.getChar (); //Prompts for letter


	    for (int i = 0 ; i < chosen.length () ; i++) //looks through the array for correct letter
	    {

		if (chosen.charAt (i) == letter) //If correct letter is found
		{
		    c.setFont (word);
		    c.setColor (wordCol);
		    String ch = Character.toString (letter); //Converts the character into a string
		    c.print (ch);
		    win++; //accumulates the number of correct values inputted
		}
		else
		{
		    lose++;
		}
	    }



	}
	while (lose <= 5 || win < chosen.length ());

	//Clears Screen
	c.clear ();

	//Loss Screen
	if (lose == 5)
	{
	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 250, 330);


	}
	else //Win Screen
	{
	    c.setColor (winner);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (congratz);
	    c.setFont (verdict);
	    c.drawString ("You Win!", 250, 330);
	}

	return;
    }


    public static void main (String[] args)
    {
	c = new Console (35, 120);
	
	Games();



	// Place your program here.  'c' is the output console
    } // main method
} // KM_HangmanCategory class
