// The "KM_HangmanMain" class.
import java.awt.*;
import hsa.Console;

public class KM_HangmanMain
{
    static Console c;           // The output console

    // public static String Letter (String word)
    // {
    //     String value = "";
    //
    //     if (word.length () > 0)
    //     {
    //         value = word.substring (0, word.length () - 1);
    //         return value;
    //     }
    //     else
    //         return value;
    // }


    public static int Hangman (int exit)
    {
	if (exit == 1)
	{
	    //Head
	    c.setColor (Color.black);
	    c.drawOval (330, 210, 51, 51);
	    c.setColor (Color.blue);
	    c.fillOval (331, 211, 50, 50);

	}
	else if (exit == 2)
	{
	    //Body
	    c.setColor (new Color (255, 158, 64));
	    c.fillRect (348, 260, 15, 60);

	}
	else if (exit == 3)
	{
	    //Right Arm
	    c.setColor (Color.black);
	    c.drawLine (348, 260, 300, 300);

	}
	else if (exit == 4)
	{ //Left Arm
	    c.drawLine (363, 260, 410, 300);
	}
	else if (exit == 5)
	{
	    //Right Leg
	    c.drawLine (348, 320, 300, 360);
	}
	else if (exit == 6)
	{
	    //Left Leg
	    c.drawLine (363, 320, 410, 360);
	}

	return exit;
    }


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
	String drawLet;

	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);



	//Gameplay Code
	for (int i = 0 ; i < chosen.length () ; i++) //Indexes through the word
	{
	    letter = c.getChar (); //Prompts for letter

	    if (chosen.indexOf (letter) > -1) //Checks to see if letter is inside the word
	    {
		c.setFont (word);
		c.setColor (wordCol);
		drawLet = Character.toString (letter);
		c.drawString (drawLet, 330, 670);
		win++;
		//drawLet = null;
	    }
	    else if (chosen.indexOf (letter) == -1)
	    {
		lose++;
		Hangman (lose);
	    }

	    letter = ' ';




	}

	//Clears Screen
	c.clear ();


	if (lose == 6) //Loss Screen
	{

	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 200, 330);

	}
	else
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
	String drawLet;
	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);


	//Gameplay Code
	//Gameplay Code
	for (int i = 0 ; i < chosen.length () ; i++) //Indexes through the word
	{
	    letter = c.getChar (); //Prompts for letter

	    if (chosen.indexOf (letter) > -1) //Checks to see if letter is inside the word
	    {
		c.setFont (word);
		c.setColor (wordCol);
		drawLet = Character.toString (letter);
		c.drawString (drawLet, 330, 670);
		win++;
		//drawLet = null;
	    }
	    else if (chosen.indexOf (letter) == -1)
	    {
		lose++;
		Hangman (lose);
		
	    }

	    letter = ' ';




	}

	//Clears Screen
	c.clear ();


	if (lose == 6) //Loss Screen
	{

	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 200, 330);

	}
	else
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
	String drawLet;
	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);


	//Gameplay Code
	//Gameplay Code
	for (int i = 0 ; i < chosen.length () ; i++) //Indexes through the word
	{
	    letter = c.getChar (); //Prompts for letter

	    if (chosen.indexOf (letter) > -1) //Checks to see if letter is inside the word
	    {
		c.setFont (word);
		c.setColor (wordCol);
		drawLet = Character.toString (letter);
		c.drawString (drawLet, 330, 670);
		win++;
		//drawLet = null;
	    }
	    else if (chosen.indexOf (letter) == -1)
	    {
		lose++;
		Hangman (lose);
	    }

	    letter = ' ';




	}

	//Clears Screen
	c.clear ();


	if (lose == 6) //Loss Screen
	{

	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 200, 330);

	}
	else
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
	String drawLet;
	char letter;
	c.setFont (word);
	c.setColor (wordCol);
	c.drawString ("Word: ", 130, 670);


	//Gameplay Code
	for (int i = 0 ; i < chosen.length () ; i++) //Indexes through the word
	{
	    letter = c.getChar (); //Prompts for letter

	    if (chosen.indexOf (letter) > -1) //Checks to see if letter is inside the word
	    {
		c.setFont (word);
		c.setColor (wordCol);
		drawLet = Character.toString (letter);
		c.drawString (drawLet, 330, 670);
		win++;
		//drawLet = null;
	    }
	    else if (chosen.indexOf (letter) == -1)
	    {
		lose++;
		Hangman (lose);
	    }

	    letter = ' ';




	}

	//Clears Screen
	c.clear ();


	if (lose == 6) //Loss Screen
	{

	    c.setColor (loss);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (tooBad);
	    c.setFont (verdict);
	    c.drawString ("You Lose!", 200, 330);

	}
	else
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

	//Custom Colors
	Color background = new Color (159, 255, 119);
	Color movies = (Color.blue);
	Color tech = new Color (185, 0, 0);
	Color sports = (Color.orange);
	Color games = new Color (64, 0, 128);
	Color quitting = (Color.red);
	Color writer = new Color (0, 128, 64);
	;

	//Custom Fonts
	Font title = new Font ("Jokerman", Font.PLAIN, 100);
	Font choices = new Font ("Arial", Font.BOLD, 50);
	Font quit = new Font ("Georgia", Font.PLAIN, 40);
	Font author = new Font ("Times New Roman", Font.BOLD, 40);
	char choice;
	do
	{
	    //Welcome Screen
	    c.setColor (background);
	    c.fillRect (0, 0, 100000, 1000);
	    c.setColor (Color.black);
	    c.setFont (title);
	    c.drawString ("Hangman", 240, 130);
	    c.setColor (movies);
	    c.setFont (choices);
	    c.drawString ("1. Movies", 170, 300);
	    c.setColor (tech);
	    c.drawString ("2. Tech", 550, 300);
	    c.setColor (sports);
	    c.drawString ("3. Sports", 170, 450);
	    c.setColor (games);
	    c.drawString ("4. Games", 550, 450);
	    c.setColor (quitting);
	    c.setFont (quit);
	    c.drawString ("Press 0 to quit", 30, 650);
	    c.setColor (writer);
	    c.setFont (author);
	    c.drawString ("By: Minhaz Khan", 630, 650);

	    //Menu Options
	    choice = c.getChar ();

	    if (choice == '1')
		Movies ();
	    else
		if (choice == '2')
		    Tech ();
		else
		    if (choice == '3')
			Sports ();
		    else
			if (choice == '4')
			    Games ();
			else
			    if (choice == '0')
				c.close ();
	    c.getChar ();
	}
	while (choice != 0);

	c.getChar ();

	return;




	// Place your program here.  'c' is the output console
    } // main method
} // KM_HangmanMain class


