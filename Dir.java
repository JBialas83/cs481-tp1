import java.io.*;

public class Dir {
  /* Command::
       dir name           where name must be null or the name of a directory and its paths.
       Action:
       List the file and directory names in this directory.
       Note that if the user enters "dir" it is OK and it means the current
       directory. In this case as you know a period (e,g .) means the current
       directory
       Errors:
       The user enters:
       1. dir name             The directory name does not exist.
       2. dir name             But the name does is not a directory name.
       When there is an error println a message and return (not exit).
  */

  public Dir(String name){
    f(name);
  }

  private void f(String path){

	  String files;
	  File folder;
	  if (path.equalsIgnoreCase("") || path.equalsIgnoreCase("."))
	  {
	  	folder = new File(".");
	  	String s_dir = folder.getAbsolutePath();
		folder = new File(s_dir);
	  }
	  else
		  folder=new File(path);
	
	  File[] listOfFiles = folder.listFiles(); 
	  
	  if (!folder.exists())
		  System.out.println("Directory does not exist.");
	  else if (!folder.isDirectory() && folder.isFile())
		  System.out.println(path + " is a file, not a directory");
	  else
	  {
	  
	  for (int i = 0; i < listOfFiles.length; i++) 
	  {
		  
	   if (listOfFiles[i].isDirectory()) 
		   {
		   files = listOfFiles[i].getName() + " (Directory)";
		   System.out.println(files);
		      }
	   else if(listOfFiles[i].isFile()) 
	   {
	   files = listOfFiles[i].getName();
	   System.out.println(files);
	      }
	  }
	  }
		   
  }
}
