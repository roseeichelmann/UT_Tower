/*
 * CS312 Assignment 1.
 * On my honor, Rose Eichelmann, this programming assignment is my own work.
 *
 * A program to print out the lyrics to the
 * children's song, "There was an old woman".
 *
 *  Name: Rose Eichelmann
 *  email address: rose.eichelmann@gmail.com
 *  UTEID: ree585
 *  Section 5 digit ID: 52205
 *  Grader name: Tejna
 */

public class Song {

	// print out the lyrics of "There was an old woman ... "
	public static void main(String[] args) {
		printVerse1();
		printVerse2();
		printVerse3();
		printVerse4();
		printVerse5();
		printVerse6();
		printVerse7();
		printVerse8();
	}

	// print repetition in verse 1
	public static void repeat1() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}

	// print verse 1
	public static void printVerse1() {
		System.out.println("There was an old woman who swallowed a fly.");
		repeat1();
	}

	// print repetition in verse 2
	public static void repeat2() {
		System.out.println("She swallowed the spider to catch the fly,");
		repeat1();
	}

	// print verse 2
	public static void printVerse2() {
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		repeat2();
	}

	// print repetition in verse 3
	public static void repeat3() {
		System.out.println("She swallowed the bird to catch the spider,");
		repeat2();
	}

	// print verse 3
	public static void printVerse3() {
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		repeat3();
	}

	// print repetition in verse 4
	public static void repeat4() {
		System.out.println("She swallowed the cat to catch the bird,");
		repeat3();
	}

	// print verse 4
	public static void printVerse4() {
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		repeat4();
	}

	// print repetition in verse 5
	public static void repeat5() {
		System.out.println("She swallowed the dog to catch the cat,");
		repeat4();
	}

	// print verse 5
	public static void printVerse5() {
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		repeat5();
	}

	// print repetition in verse 6
	public static void repeat6() {
		System.out.println("She swallowed the goat to catch the dog,");
		repeat5();
	}

	// print verse 6
	public static void printVerse6() {
		System.out.println("There was an old woman who swallowed a goat,");
		System.out.println("She just opened her throat to swallow a goat.");
		repeat6();
	}

	// print repetition in verse 7
	public static void repeat7() {
		System.out.println("She swallowed the cow to catch the goat,");
		repeat6();
	}

	// print verse 7
	public static void printVerse7() {
		System.out.println("There was an old woman who swallowed a cow,");
		System.out.println("I don't know how she swallowed a cow.");
		repeat7();
	}

	// print verse 8
	public static void printVerse8() {
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
}