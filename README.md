# Clash-in-Classroom (Team No Name)

- A Java-based Greenfoot game in which the player must toss the paper ball into the opponent's bucket.

## Team Members

[Harsh Sheth](https://github.com/harsh-sheth7)<br>
[Chinmay Kamerkar](https://github.com/mercury297)<br>
[Wen-Hao Tseng](https://github.com/Wenhao-Tseng)

## Approach for the game

- The game's concept is that there has been a clash in class 202, and one player receives 7 paper balls. The aim is to toss them into a bucket that is eventually moved across by the opponent. To win the game, the player must score 500 points, with each toss into the bucket awarding 100 points.

## Areas of Contribution

- Harsh : Main Screen, Instructions, Fighter, Opponent, PaperBall, Class Diagram, Project Initialization
- Chinmay : ScoreCard, ScoreCard Display, GameEnd Screens, User Story Video, Demo Video, Agile Video
- Wen Hao: Ongoing, Win/Lose Game States

## Design Patterns Used

- Command
- State
- Singleton
- Observer

## Game Design

### Main Screen

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Main%20Screen.png)

### Instructions Screen

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Instructions%20Screen.png)

### Game Screen

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Game%20Screen.png)

### Paper Throw Screen

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Paper%20throw%20screen.png)

### Win Screen

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Win%20Screen.png)

### Lose Screen

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Lose%20Screen.png)

## Design Patterns

| Name             | Design Pattern |
| :--------------- | :------------- |
| Harsh Sheth      | Command        |
| Harsh Sheth      | State          |
| Chinmay Kamerkar | Singleton      |
| Chinmay Kamerkar | Observer       |
| Wen Hao Tseng    | State          |

## XP Core Values

| Name             | Design Pattern |
| :--------------- | :------------- |
| Harsh Sheth      | Communication  |
| Harsh Sheth      | Simplicity     |
| Chinmay Kamerkar | Simplicity     |
| Chinmay Kamerkar | Feedback       |

### Important Links

- [User Story Ad](https://youtu.be/C439PqK_hs8)
- [Demo Video](https://youtu.be/s4BULVYJZeI)
- [Agile Demonstration](https://youtu.be/hs0AzeUElnA)
- [UI WireFrames](https://github.com/nguyensjsu/fa21-202-team-no-name/tree/main/Diagrams/UI%20Wireframes)

# Architecture Diagram

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Diagrams/Architecture.png)

# Class Diagram

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Diagrams/Class%20Diagram.png)

# Deployment Diagram

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Diagrams/Deployment.png)

# Kanban Board

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Kanban%20Board%20mid.png)

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/KanbanChinmay1.png)

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/Kanban%20Board%20complete.png)

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Screenshots/KanbanChinmay2.png)

# Burndown Chart

![alt text](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Diagrams/Burndown%20Chart.png)

# Journals

- [Harsh Sheth](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Journals/Harsh.md)
- [Chinmay Kamerkar](https://github.com/nguyensjsu/fa21-202-team-no-name/blob/main/Journals/Chinmay.md)

# Key features Design Summary

## Harsh Sheth

- We had a total of three buttons to handle on the Main Screen and the Instructions screen, so to keep in mind the simplicity factor, included the Command Pattern into the scenario, which allows us to conduct various events while just having to deal with the doActoin() function. There are three interfaces for this purpose: ButtonAction, Invoker, and Receiver. When all three of these are coupled, they determine which instructions should be placed on the instance of the button that is being called.
- On the Game World screen, we can see that our whole game is operational, including the Fighter, the Opponent, the Score Card, and the Paper Ball that has to be tossed into the bucket. In this scenario, the fighter has seven balls to toss into a bucket, and the score card count is being updated as the fighter tosses the ball. However, the fighter must determine whether or not he has any balls remaining, and for this, the State Pattern is introduced. As a result, if the fighter still has paper in his or her hands, the throw paper should be implemented, which is being handled by the PaperState. If, on the other hand, the fighter has run out of Paper Balls, the current state will be set to noPaperState, and if the throw paper command is sent while the fighter is in noPaperState, no action will be performed.

## Chinmay Kamerkar

- The Score Card is a class that observes the PaperRoll class. Whenever an object of PaperRoll touches an object of Opponent, PaperRoll notifies it's observer that is the Score Card class. This is how the Score Card gets updated for score. The count of paper rolls left for the fighter to throw, however, is updated whenever a paperRoll is thrown in the PaperState. Now this ScoreCard has to be singleton so that everytime only one object of ScoreCard class exists in run time. Now this ScoreCard provides the information for the ScoreCardDisplay class that is the actor that is actually displayed on the game screen(GameWorld)
- Now the game ends in two cases: 1) A user scores 500 points or 2) A user is out of paper balls and has not reached 500 points. To ensure this was full proof, the design was made such that there are N + 1 (8 here) paper rolls in the inventory and while displaying we always display 1 ball lesser. So when the fighter reaches NoPaperState on the 7th or Nth ball, the fighter can not throw the 8th ball and thus we have achieved losing condition. The winning condition is simpler, as the boundary case is already taken care of because of the losing scenario.

# Copyright

- Game Background Music(bensound-ukulele) (https://www.bensound.com/)
