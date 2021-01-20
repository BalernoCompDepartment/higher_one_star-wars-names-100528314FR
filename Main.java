class Main {
  public static void main(String[] args) {
    //Step 1: ask user for firstname
    String forename = Keyboard.getText("Please enter your forname");
    //Step 2: ask user for surname
    String surname = Keyboard.getText("Please enter your surname");
    //Step 3: ask user for mothers maiden name
    String maiden = Keyboard.getText("Please enter your mothers maiden name");
    //Step 4: ask user for city in which they were born
    String town = Keyboard.getText("Please enter the town where you were born");
    //Step 5: starwarsname = first 3 letter of surname + first 2 letters of first name + " " + first 3 letters of motehrs maiden name + first 2 letters of town you **were born in

String starwarsname = (surname.substring(0,3)+(forename.substring(0,2)) + " "+ (maiden.substring(0,3)+ (town.substring(0,2))));

    //Step 6: display "your star wars name is " + starwarsname
    System.out.println("Your Star Wars name is " + starwarsname);
  }
}


