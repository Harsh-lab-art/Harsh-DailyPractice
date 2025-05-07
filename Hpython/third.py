import turtle

screen = turtle.Screen()
screen.bgcolor("black")

krishna = turtle.Turtle()
krishna.pensize(3)
krishna.speed(5)
krishna.color("white")

krishna.penup()
krishna.goto(0, -50)
krishna.pendown()
krishna.circle(80)

krishna.penup()
krishna.goto(-30, 50)
krishna.pendown()
krishna.dot(10, "white")

krishna.penup()
krishna.goto(30, 50)
krishna.pendown()
krishna.dot(10, "white")

krishna.penup()
krishna.goto(0, 40)
krishna.pendown()
krishna.right(90)
krishna.circle(10, 180)

krishna.pensize(5)
krishna.color("yellow")
krishna.penup()
krishna.goto(-70, 20)
krishna.pendown()
krishna.forward(140)

krishna.pensize(2)
krishna.color("black")
for i in range(-40, 41, 20):
    krishna.penup()
    krishna.goto(i, 22)
    krishna.pendown()
    krishna.dot(5)

krishna.pensize(2)
krishna.color("green")
krishna.penup()
krishna.goto(40, 130)
krishna.pendown()
krishna.left(45)
krishna.circle(30, 180)

krishna.hideturtle()
turtle.done()
