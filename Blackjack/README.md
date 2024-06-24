### Overview
Welcome to the Java Casino Blackjack game! This program simulates a simple game of Blackjack where you, the player, compete against the dealer. The game starts by dealing two cards to both the player and the dealer. You will have the opportunity to "hit" (draw a new card) or "stay" (keep your current cards) to get as close as possible to a total of 21 without going over. Once the player stays, the dealer will reveal their hidden card and draw new cards until they reach a total of at least 17. The one with the higher total wins, unless someone exceeds 21, which is a bust.

### Main Function and Sub-functions
The main function in this program is `main`, which is where the game starts and runs the main logic. It makes use of several sub-functions to handle specific tasks:

1. **`drawRandomCard()`**: This function generates a random card between 1 and 13.
2. **`cardString(int cardNumber)`**: This function returns a string representation of the given card number.
3. **`faceDown()`**: This function returns a string representation of a face-down card.
4. **`hitOrStay()`**: This function asks the player whether they want to "hit" or "stay" and ensures the response is valid.

### Code Flow and Loops
The game starts with welcoming messages and waits for the player to press enter to begin. The player and dealer are both dealt two random cards, and the player’s cards and one of the dealer's cards are displayed. The player's total is calculated, but only one of the dealer's cards is shown, with the other hidden.

- **Player's Turn**: A `while` loop runs, asking the player if they want to "hit" or "stay" using the `hitOrStay()` function. If the player chooses to hit, a new card is drawn, and the total is updated. If the total exceeds 21, the player busts and loses the game.

- **Dealer's Turn**: Once the player stays, the dealer reveals their hidden card and continues to draw new cards while their total is less than 17. This is also done using a `while` loop. If the dealer busts (total exceeds 21), the player wins.

- **Determine Winner**: After the dealer’s turn, if neither the player nor the dealer has busted, the totals are compared to determine the winner.

### Steps to Run the Code
1. Compile and run the `Blackjack` program.
2. Read the welcome messages and press enter to start.
3. Look at your initial two cards and decide whether to "hit" or "stay".
4. If you "hit", a new card is drawn and added to your total.
5. If you "stay", the dealer reveals their cards and draws until their total is 17 or higher.
6. The winner is determined based on who has a total closer to 21 without exceeding it.

This game is a great way to understand basic programming concepts such as functions, loops, and user input handling. Enjoy playing and may the best hand win!