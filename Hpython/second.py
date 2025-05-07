import turtle

screen = turtle.Screen()
screen.bgcolor("black")

krishna = turtle.Turtle()
krishna.pensize(3)
krishna.speed(5)

krishna.penup()
krishna.goto(0, 100)
krishna.pendown()
krishna.circle(20)

krishna.penup()
krishna.goto(0, 100)
krishna.right(90)
krishna.pendown()
krishna.forward(60)

krishna.penup()
krishna.goto(0, 80)
krishna.left(45)
krishna.pendown()
krishna.forward(40)

krishna.pensize(5)
krishna.color("orange")
krishna.backward(80)

krishna.pensize(3)
krishna.color("white")
krishna.penup()
krishna.goto(0, 80)
krishna.right(90)
krishna.pendown()
krishna.forward(40)

krishna.penup()
krishna.goto(0, 40)
krishna.left(45)
krishna.pendown()
krishna.forward(40)

krishna.penup()
krishna.goto(0, 40)
krishna.right(90)
krishna.pendown()
krishna.forward(40)

krishna.penup()
krishna.goto(10, 120)
krishna.pencolor("green")
krishna.pensize(2)
krishna.pendown()
krishna.circle(10, 180)

krishna.hideturtle()
turtle.done()
