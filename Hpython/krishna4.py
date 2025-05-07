import turtle

# Setup the screen
screen = turtle.Screen()
screen.bgcolor("black")
krishna = turtle.Turtle()
krishna.speed(7)

# Helper function to draw a filled circle
def draw_circle(color, radius, x, y):
    krishna.penup()
    krishna.goto(x, y)
    krishna.pendown()
    krishna.color(color)
    krishna.begin_fill()
    krishna.circle(radius)
    krishna.end_fill()

# Draw face
draw_circle("deepskyblue", 70, 0, 0)

# Draw hair
krishna.penup()
krishna.goto(-70, 70)
krishna.pendown()
krishna.color("black")
krishna.begin_fill()
krishna.right(90)
krishna.circle(70, 180)
krishna.left(90)
krishna.forward(140)
krishna.end_fill()

# Draw eyes
for eye_x in [-30, 30]:
    draw_circle("white", 10, eye_x, 40)
    draw_circle("black", 5, eye_x, 45)

# Draw smile
krishna.penup()
krishna.goto(-20, 10)
krishna.pendown()
krishna.setheading(-60)
krishna.circle(20, 120)

# Draw tilak (symbol)
krishna.penup()
krishna.goto(0, 60)
krishna.pendown()
krishna.setheading(270)
krishna.color("white")
krishna.pensize(2)
krishna.forward(20)

# Draw body
draw_circle("deepskyblue", 40, 0, -120)

# Draw dhoti (red dress)
krishna.penup()
krishna.goto(-40, -160)
krishna.pendown()
krishna.color("red")
krishna.begin_fill()
for _ in range(2):
    krishna.forward(80)
    krishna.right(90)
    krishna.forward(40)
    krishna.right(90)
krishna.end_fill()

# Draw pot
draw_circle("brown", 40, -120, -180)

# Butter coming out of pot
krishna.penup()
krishna.goto(-140, -140)
krishna.pendown()
krishna.color("white")
krishna.begin_fill()
krishna.circle(10)
krishna.end_fill()

# Draw peacock feather (simplified)
krishna.penup()
krishna.goto(0, 90)
krishna.pendown()
krishna.pensize(2)
krishna.color("green")
krishna.setheading(60)
krishna.circle(30, 180)

krishna.penup()
krishna.goto(10, 120)
krishna.pendown()
krishna.color("blue")
krishna.begin_fill()
krishna.circle(5)
krishna.end_fill()

# Hide turtle and done
krishna.hideturtle()
turtle.done()
