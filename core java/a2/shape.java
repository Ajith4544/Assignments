import java.io.*;
import java.util.*;

public abstract class shape
{
abstract void draw();

public static void main(String args[])
{
shape a=new line();
a.draw(); 
shape b=new rectangle();
b.draw();
 shape c=new cube();
c.draw(); 
}}


class line extends shape 
{
//@override
void draw()
{
System.out.println("line");
}}


class rectangle extends shape 
{
//@override
void draw()
{
System.out.println("rectangle");
}}


class cube extends shape 
{
//@override
void draw()
{
System.out.println("cube");
}
}
