import java.io.*;

public class Delete {
  /* Command::
     delet name           where name must be the name of a file and its paths.
     Action:
     delets name
     Errors:
     The user enters:
     1. delet                The user did not type the file name.
     2. delet name           The file name does not exist in the path.
     3. delete name          But the file name does is a directory.
     When there is an error println a message and return (not exit).
*/
  public Delete(String name){
    f(name);
  }

  private void f(String name){
  }
}
