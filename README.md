**Overview**
The TicTacToe game implementation follows object-oriented programming principles effectively. Here's a breakdown of its components and concepts:
**Players:** An abstract class representing players. It defines a common interface (makeMove()) for making moves and checks for move validity.
**HumanPlayer:** A concrete subclass of Players representing a human player. It prompts the user for row and column coordinates for their move.
**AiPlayer:** A concrete subclass of Players representing an AI player. It generates random row and column coordinates for its move.
**TicTacToe:** A class representing the game board and logic. It initializes the board, displays it, places marks, and checks for wins or draws.
**LaunchGame:** A class containing the main method to run the TicTacToe game. It alternates between human and AI players until there's a winner or draw.
The implementation doesn't explicitly use design patterns but adheres to fundamental object-oriented principles like inheritance, encapsulation, and polymorphism. It provides a solid foundation for a simple TicTacToe game without the need for complex design patterns.

Q. To play the TicTacToe game?
**Launch the Game:** Run the LaunchGame class. This will start the TicTacToe game.
**Alternate Turns**: The game will prompt players to take turns making moves. If you're playing against the AI, it will automatically make its moves.
**Make a Move:** When it's your turn, you'll be prompted to enter the row and column coordinates for your move. Enter two numbers separated by a space or newline, representing the row and column index (0-indexed).
**Winning Condition**: Keep making moves until one player achieves a winning condition:
Three of your marks (X or O) appear consecutively in a row, column, or diagonal.
Or until the game ends in a draw if all spaces on the board are filled without a winner.
**Game End:** The game will end when one player wins or when it's a draw. You'll be notified of the outcome, and you can choose to play again if you wish.




