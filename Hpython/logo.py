import turtle

def draw_circle(color, x, y, radius):
    turtle.penup()
    turtle.goto(x, y - radius)
    turtle.pendown()
    turtle.color(color)
    turtle.begin_fill()
    turtle.circle(radius)
    turtle.end_fill()

def draw_square(color, x, y, size):
    turtle.penup()
    turtle.goto(x - size/2, y + size/2)
    turtle.pendown()
    turtle.color(color)
    turtle.begin_fill()
    for _ in range(4):
        turtle.forward(size)
        turtle.right(90)
    turtle.end_fill()

def write_text(text, x, y, size, color="white"):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    turtle.color(color)
    style = ('Arial', size, 'bold')
    turtle.write(text, font=style, align="center")

turtle.speed(5)
screen = turtle.Screen()
screen.bgcolor("black")

draw_square("#1877F2", -200, 100, 100)
write_text("f", -200, 70, 36)

draw_square("#0A66C2", 0, 100, 100)
write_text("in", 0, 70, 30)

draw_circle("#1DA1F2", 200, 100, 50)
write_text("🐦", 200, 80, 24)

draw_square("#C13584", -100, -150, 100)
write_text("📷", -100, -180, 24)

draw_circle("#25D366", 100, -150, 50)
write_text("📞", 100, -170, 24)

turtle.hideturtle()
turtle.done()
