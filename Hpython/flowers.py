import turtle

screen = turtle.Screen()
screen.bgcolor("black")


t = turtle.Turtle()
t.speed(10)
t.color("red", "yellow") 

def draw_petal():
    t.begin_fill()
    for _ in range(2):
        t.circle(100, 60) 
        t.left(120)
    t.end_fill()


for _ in range(6):
    draw_petal()
    t.right(60)


t.color("orange")
t.penup()
t.goto(0, -20)
t.pendown()
t.begin_fill()
t.circle(20)
t.end_fill()

t.hideturtle()
turtle.done()
