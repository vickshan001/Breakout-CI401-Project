# 🧱 Breakout Game – Java Application

A simple Breakout game developed as part of the CI401 module coursework during my **first year at university (2020)**. This was my **first hands-on experience with Java**, where I learned the basics of object-oriented programming and graphical user interface development. The game allows players to bounce a ball using a paddle to break rows of bricks, complete with scoring and pause/resume functionality.

---

## 🎮 Description & Aims

This project is a classic **Breakout** game where the player:

- Controls a bat (paddle) to keep the ball in play.
- Aims to destroy all bricks by bouncing the ball.
- Gains points for each brick destroyed.

Initial game state included a working scoreboard, bat, and ball. Enhancements aimed to:

- ✅ Add rows of bricks  
- ✅ Fix bat from moving outside the window  
- ✅ Add Pause and Resume functionality  

---

## ✨ Features

### 🔷 Add Rows of Bricks

- Dynamically generated bricks using nested loops for rows and columns.
- Each row is assigned a different color for better visual clarity using a predefined color array.

### ⏸️ Add Pause and Resume Function

- Implemented keyboard controls:
  - `P` → Pause
  - `C` → Continue
- Ball and bat motion are controlled by setting their movement units to `0` during pause.

### 🚫 Prevent Bat From Leaving the Window

- Added `if` condition to constrain bat movement within screen borders.
- Movement direction and bat position are checked and adjusted accordingly.

---

## 🛠 Technologies Used

- Java
- Java Swing (GUI)
- MVC Architecture
- Object-Oriented Programming principles

---

## 🎯 How to Play

1. Run the application.
2. Use arrow keys (or specified controls) to move the bat.
3. Hit the ball to break the bricks.
4. Press `P` to pause and `C` to continue.
5. Prevent the ball from falling and try to clear all bricks!

---

## 👨‍💻 Developed By

**Vickshan Vicknakumaran**  
University of Brighton  
_First-year university project (2020)_  

---

