# Tic Tac Toe Game

Welcome to the Tic Tac Toe game! This project is a simple implementation of the classic game using Java. Follow the steps below to understand how the game works and how it was built.

## Project Overview

This project involves creating a Tic Tac Toe game where two players take turns to place their marks (X and O) on a 3x3 board. The game checks for a winner or a tie after each turn.

## Steps to Build the Game

### Step 1: Set Up the Game Board

We start by creating a 3x3 board filled with underscores ('_'), which represent empty spots.

```java
char[][] board = {
    { '_', '_', '_' },
    { '_', '_', '_' },
    { '_', '_', '_' }
};
```

### Step 2: Print the Game Board

We created a function `printBoard` to display the board. This function prints each row of the board with spaces between the characters.

```java
public static void printBoard(char[][] board) {
    System.out.println("\n");
    for (int i = 0; i < board.length; i++) {
        System.out.println("\t");
        for (int j = 0; j < board[i].length; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println("\n");
    }
}
```

### Step 3: Take Turns to Play

The main game loop runs 9 times (since the board has 9 spots). Players take turns to place their marks on the board.

```java
for (int i = 0; i < 9; i++) {
    if (i % 2 == 0) {
        System.out.println("Turn: X");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'X';
    } else {
        System.out.println("Turn: O");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'O';
    }
    printBoard(board);
    int count = checkWin(board);
    if (count == 3) {
        System.out.println("X wins!");
        break;
    } else if (count == -3) {
        System.out.println("O wins!");
        break;
    } else if (i == 8) {
        System.out.println("Oh! It's a tie!");
    }
}
```

### Step 4: Ask the User for Input

We created a function `askUser` to get the row and column from the user where they want to place their mark. If the spot is already taken, it asks the user to choose again.

```java
public static int[] askUser(char[][] board) {
    System.out.print("Pick a row and column: ");
    int row = scan.nextInt();
    int column = scan.nextInt();
    while (board[row][column] != '_') {
        System.out.print("Spot taken! Try another spot: ");
        row = scan.nextInt();
        column = scan.nextInt();
    }
    return new int[] { row, column };
}
```

### Step 5: Check for a Winner

We created a function `checkWin` to determine if there is a winner. This function checks rows, columns, and diagonals for three of the same marks in a row.

```java
public static int checkWin(char[][] board) {
    int rows = checkRows(board);
    if (Math.abs(rows) == 3) return rows;

    int columns = checkColumns(board);
    if (Math.abs(columns) == 3) return columns;

    int leftDiagonal = checkLeft(board);
    if (Math.abs(leftDiagonal) == 3) return leftDiagonal;

    int rightDiagonal = checkRight(board);
    if (Math.abs(rightDiagonal) == 3) return rightDiagonal;

    return 0;
}
```

### Helper Functions to Check Rows, Columns, and Diagonals

We also created helper functions to check for a winner in rows, columns, and diagonals.

```java
public static int checkRows(char[][] board) {
    for (int i = 0; i < board.length; i++) {
        int count = 0;
        for (int j = 0; j < board[i].length; j++) {
            if (board[i][j] == 'X') count++;
            else if (board[i][j] == 'O') count--;
        }
        if (Math.abs(count) == 3) return count;
    }
    return 0;
}

public static int checkColumns(char[][] board) {
    for (int i = 0; i < board.length; i++) {
        int count = 0;
        for (int j = 0; j < board[i].length; j++) {
            if (board[j][i] == 'X') count++;
            else if (board[j][i] == 'O') count--;
        }
        if (Math.abs(count) == 3) return count;
    }
    return 0;
}

public static int checkLeft(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
        if (board[i][i] == 'X') count++;
        else if (board[i][i] == 'O') count--;
    }
    return count;
}

public static int checkRight(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
        if (board[i][2 - i] == 'X') count++;
        else if (board[i][2 - i] == 'O') count--;
    }
    return count;
}
```

## Summary

1. We set up the game board with underscores.
2. We created a function to print the board.
3. We looped through turns for X and O, asking the user for their move.
4. We created a function to check for a winner after each turn.

This project is a simple yet effective way to understand the basics of loops, conditionals, arrays, and user input in Java. Enjoy playing Tic Tac Toe!