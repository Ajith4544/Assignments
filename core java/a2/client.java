import java.io.*;
import java.util.*;
  abstract class persistence
{
abstract  void persist();
}
 class fileper extends persistence
{
//@override
void persist()
{
//int n;
System.out.println("data saved in the file");
}}
 class dpper extends persistence
{
//@override
void persist()
{
System.out.println("database");
}}
public class client 
{
public static void main(String args[])
{
persistence fp=new fileper();
fp.persist();

persistence dp=new dpper();
dp.persist();
}}
